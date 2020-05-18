package org.highschool.forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import org.highschool.model.impl.Gender;
import org.highschool.model.impl.Student;
import org.highschool.service.StudentService;
import org.highschool.util.Utils;

/**
 * 
 *
 */
@SuppressWarnings("rawtypes")
public class StudentForm extends JInternalFrame {

	private static final long serialVersionUID = 4005156305874528837L;
	
	private static final Logger LOG = Logger.getLogger(StudentForm.class.getName());
	
	StudentService studentService;
    DefaultTableModel model;
    static int id;
    
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
	private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    
    /**
     * Creates new form EtudiantForms
     */
    public StudentForm() {
        initComponents();
        studentService = new StudentService();
        model = (DefaultTableModel) jTable1.getModel();
        load();
    }

    void load() {
        model.setRowCount(0);
        List<Student> studentList = studentService.findAll(); 
        LOG.log(Level.FINE, studentList.toString());
        for (Student e : studentList) {
            model.addRow(new Object[]{e.getStudentNumber(), e.getLastName(), e.getFirstName(), e.getGender(), e.getEmail(), e.getBirthDate(), e.getHeight(), e.getSubject()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    void clear() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jPanel2 =  new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jComboBox1 = new JComboBox();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jPanel3 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createTitledBorder("Informations Etudiant"));

        jLabel1.setText("Nom :");

        jLabel2.setText("Prenom :");

        jLabel3.setText("Genre :");
        
        jLabel4.setText("Email :");
        
        jLabel5.setText("Date de naissance (yyyy-MM-dd):");
        
        jLabel6.setText("Taille (cm):");
        
        jLabel7.setText("Filiere :");

        jRadioButton1.setBackground(new Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("F");

        jRadioButton2.setBackground(new Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("M");
        
        jRadioButton3.setBackground(new Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("O");

        jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Science", "Litterrature", "Art" }));
        
        jTextField4 = new JTextField();
        
        jTextField5 = new JTextField();
        
        jTextField6 = new JTextField();

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel1)
        							.addGap(34)
        							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel4)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel3)
        							.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
        							.addComponent(jRadioButton1)
        							.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
        							.addComponent(jRadioButton2)
        							.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
        							.addComponent(jRadioButton3))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jLabel7)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jComboBox1, 0, 213, Short.MAX_VALUE))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jLabel2)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jTextField2, 114, 114, 114)
        					.addGap(18)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel6)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel5)
        							.addGap(18)
        							.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
        					.addGap(50))))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jLabel3)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jRadioButton1)
        				.addComponent(jRadioButton2)
        				.addComponent(jRadioButton3))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel6)
        						.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel7))
        					.addGap(18))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel4)
        						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addContainerGap())))
        );
        jPanel2.setLayout(jPanel2Layout);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Supprimer");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modifier");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setBorder(BorderFactory.createTitledBorder("Liste des étudiants"));

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prenom", "Genre", "Email", "Date de naissance", "Taille", "Filiere"
            }
        ));
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jScrollPane1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Gender gender = null;
        if (jRadioButton1.isSelected()) {
        	gender = Gender.FEMALE;
        }
        if (jRadioButton2.isSelected()) {
        	gender = Gender.MALE;
        }
        if (jRadioButton3.isSelected()) {
        	gender = Gender.OTHER;
        }

        Date birthDate = null;
		try {
			birthDate = Utils.parseToDate(jTextField5.getText());
		} catch (ParseException ex) {
			LOG.log(Level.SEVERE, "Error Parsing Date", ex);
		}
        
        if (studentService.create(new Student(id, jTextField1.getText(), jTextField2.getText(), jTextField4.getText(), gender, Integer.valueOf(jTextField6.getText()), birthDate, jComboBox1.getSelectedItem().toString()))) {
            JOptionPane.showMessageDialog(this, "l'etudiant a bien ajoute");
            clear();
            load();
        }

    }

    private void jTable1MouseClicked(MouseEvent evt) {
        id = Integer.parseInt(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextField1.setText(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField2.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextField4.setText(model.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jTextField5.setText(model.getValueAt(jTable1.getSelectedRow(), 5).toString());
        jTextField6.setText(model.getValueAt(jTable1.getSelectedRow(), 6).toString());
        jComboBox1.setSelectedItem(model.getValueAt(jTable1.getSelectedRow(), 7).toString());

        if (model.getValueAt(jTable1.getSelectedRow(), 3).equals(Gender.MALE)) {
            jRadioButton2.setSelected(true);
        } else if(model.getValueAt(jTable1.getSelectedRow(), 3).equals(Gender.FEMALE)){
            jRadioButton1.setSelected(true);
        } else {
        	jRadioButton3.setSelected(true);
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
    	studentService.delete(id);
        load();
        clear();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
    	
        Gender gender = null;
        if (jRadioButton1.isSelected()) {
        	gender = Gender.FEMALE;
        }
        if (jRadioButton2.isSelected()) {
        	gender = Gender.MALE;
        }
        if (jRadioButton3.isSelected()) {
        	gender = Gender.OTHER;
        }
        
        Date birthDate = null;
		try {
			birthDate = Utils.parseToDate(jTextField5.getText());
		} catch (ParseException ex) {
			LOG.log(Level.SEVERE, "Error Parsing Date", ex);
		}
        
        if (studentService.update(new Student(id, jTextField1.getText(), jTextField2.getText(), jTextField4.getText(), gender, Integer.valueOf(jTextField6.getText()), birthDate, jComboBox1.getSelectedItem().toString()))) {
            JOptionPane.showMessageDialog(this, "l'etudiant bien ete modifie");
            clear();
            load();
        }
    }

}
