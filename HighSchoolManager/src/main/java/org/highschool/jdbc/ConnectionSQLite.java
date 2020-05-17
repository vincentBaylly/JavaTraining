package org.highschool.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

public abstract class ConnectionSQLite{
	
	private static final Logger LOG = Logger.getLogger("DAO");
	
    private static final String PROP_FILE = "src/main/resources/dbconfig.properties";

    private static Properties prop = new Properties();
    private static InputStream input;
	
	private static Connection connect;
	
	private static Statement request;
	
	/**
	 * M�thode qui va nous retourner notre instance
	 * et la cr�er si elle n'existe pas...
	 * @return
	 */
	public static Connection getInstance(){
		return connect;	
	}
	
	/**
	 * Ouvre la base de donn�es sp�cifi�e
	 * 
	 * @return True si la connection � �t� r�ussie. False sinon.
	 */
	public static boolean connect() {
		try {
			// Etabli la connection
			
            // charge le fichier de propriete
			try {
				input = new FileInputStream(PROP_FILE);
				prop.load(input);
	        } catch (FileNotFoundException e) {
	            LOG.severe("Properties file not Found: " + e.getMessage());
	        } catch (IOException e) {
	        	LOG.severe("Cannot open properties file: " + e.getMessage());
	        }

			Class.forName("org.sqlite.JDBC");
			connect = DriverManager.getConnection("jdbc:" + prop.getProperty("datamanager") + ":" + prop.getProperty("database"));
			
			// D�clare l'objet qui permet de faire les requ�tes
			request = connect.createStatement();

			// Le PRAGMA synchronous de SQLite permet de v�rifier chaque �criture
			// avant d'en faire une nouvelle.
			// Le PRAGMA count_changes de SQLite permet de compter le nombre de
			// changements fait sur la base
			// R�sultats de mes tests :
			// synchronous OFF, une insertion est 20 fois plus rapide.
			// La diff�rences avec le count_changes est de l'ordre de la �s.
			// Les autres PRAGMA : http://www.sqlite.org/pragma.html

			request.executeUpdate("PRAGMA synchronous = OFF;");
			request.setQueryTimeout(30);
			
			return true;
		} catch (SQLException e) {
			// message = "out of memory" souvent le resultat de la BDD pas trouv�e
			LOG.severe(e.getMessage());
			return false;
		} catch (ClassNotFoundException e) {
			LOG.severe(e.getMessage());
		}
		
		return false;
	}
	
	/**
	 * Ferme la connection � la base de donn�es
	 * 
	 * @return True si la connection a bien �t� ferm�e. False sinon.
	 */
	public static boolean disconnect() {
		try {
			if (connect != null)
				connect.close();

			return true;
		} catch (SQLException e) {
			LOG.severe(e.getMessage());
			return false;
		}
	}
}
