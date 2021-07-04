/**
 * 
 */
package rgu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
* USER 
*/
/**
 * @author pc56
 *
 */
public class DogGromerGUI {

	private JFrame frame;
	private JTable table;
	private JTextField nametf;
	private JTextField stf;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	 List<Grommer> list=new ArrayList<Grommer>();
		Grommer gromObj= new Grommer("Andy", "Have 2 years of experience");
		Grommer gromObj1= new Grommer("Joky", "Have 4 years of experience");
	   Grommer addGrom;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DogGromerGUI window = new DogGromerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DogGromerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 500, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 634, 411);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Groomers", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.setForeground(SystemColor.textHighlight);
		table.setShowGrid(false);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i= table.getSelectedRow();
				list.add(gromObj);
				 list.add(gromObj1);
				 TableModel model= table.getModel();
				 nametf.setText(model.getValueAt(i, 0).toString());
				if(i==0) {
				stf.setText(gromObj.description.toString());
			}else if(i==1) {
				stf.setText(gromObj1.description.toString());
			}else {
				stf.setText(addGrom.getDescription().toString());
			}
			}
		});
		table.setModel(new DefaultTableModel(
				
			new Object[][] {
				{gromObj},
				{gromObj1}
			},
			new String[] {
				"New column"
			}
		)
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.setFillsViewportHeight(true);
		table.setBounds(10, 11, 314, 361);
		panel.add(table);
		
		JLabel lblNewLabel = new JLabel("Name: ");
		lblNewLabel.setBounds(334, 11, 46, 14);
		panel.add(lblNewLabel);
		
		nametf = new JTextField();
		nametf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		nametf.setBounds(400, 8, 219, 20);
		panel.add(nametf);
		nametf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Speciality:");
		lblNewLabel_1.setBounds(334, 76, 70, 14);
		panel.add(lblNewLabel_1);
		
		stf = new JTextField();
		stf.setColumns(10);
		stf.setBounds(400, 73, 219, 20);
		panel.add(stf);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(frame,"Textbox has been emptied","Reset",JOptionPane.PLAIN_MESSAGE); 
				nametf.setText("");
				stf.setText("");
			
			}
		});
		btnNewButton.setBounds(444, 349, 70, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=nametf.getText();
				String descrip=stf.getText();
				addGrom=new Grommer(name, descrip);
				Object[] row = { addGrom };
				list.add(addGrom);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(row);
			}
			
		});
		
		btnNewButton_1.setBounds(524, 349, 89, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Clients", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Clients:");
		lblNewLabel_2.setBounds(36, 40, 65, 14);
		panel_1.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Boy ", "Girl"}));
		comboBox.setBounds(89, 36, 321, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setBounds(36, 115, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(92, 112, 198, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Joined: ");
		lblNewLabel_4.setBounds(338, 115, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(382, 112, 198, 20);
		panel_1.add(textField_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.activeCaptionBorder);
		panel_4.setBounds(36, 161, 565, 143);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Dog: ");
		lblNewLabel_5.setBounds(10, 24, 46, 14);
		panel_4.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(54, 20, 220, 22);
		panel_4.add(comboBox_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Name:");
		lblNewLabel_3_1.setBounds(10, 72, 46, 14);
		panel_4.add(lblNewLabel_3_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(54, 69, 220, 20);
		panel_4.add(textField_2);
		
		JLabel lblNewLabel_5_1 = new JLabel("Breed:");
		lblNewLabel_5_1.setBounds(10, 114, 46, 14);
		panel_4.add(lblNewLabel_5_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(DogBreed.values()));
		comboBox_1_1.setBounds(54, 110, 220, 22);
		panel_4.add(comboBox_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(329, 72, 220, 20);
		panel_4.add(textField_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Age:");
		lblNewLabel_3_1_1.setBounds(296, 72, 46, 14);
		panel_4.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.setBounds(179, 349, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.setBounds(305, 349, 89, 23);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Services", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Services:");
		lblNewLabel_6.setBounds(42, 31, 76, 14);
		panel_2.add(lblNewLabel_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(110, 27, 447, 22);
		panel_2.add(comboBox_2);
		
		JLabel lblNewLabel_7 = new JLabel("Type:");
		lblNewLabel_7.setBounds(42, 105, 46, 14);
		panel_2.add(lblNewLabel_7);
		
		JRadioButton cleaning = new JRadioButton("Cleaning");
		cleaning.setBounds(110, 101, 109, 23);
		panel_2.add(cleaning);
		
		JRadioButton rdbtnTraining = new JRadioButton("Training");
		rdbtnTraining.setBounds(234, 101, 109, 23);
		panel_2.add(rdbtnTraining);
		
		JRadioButton rdbtnGromming = new JRadioButton("Gromming");
		rdbtnGromming.setBounds(368, 101, 109, 23);
		panel_2.add(rdbtnGromming);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.activeCaptionBorder);
		panel_5.setBounds(42, 159, 549, 173);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Description: ");
		lblNewLabel_8.setBounds(10, 26, 85, 14);
		panel_5.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(117, 23, 422, 20);
		panel_5.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Grommer");
		lblNewLabel_9.setBounds(10, 64, 85, 14);
		panel_5.add(lblNewLabel_9);
		
		JComboBox comboBox_3 = new JComboBox();
		
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {gromObj.name, gromObj1.name}));
		comboBox_3.setBounds(117, 60, 422, 22);
		panel_5.add(comboBox_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Include Trimming nails ");
		chckbxNewCheckBox.setBounds(10, 108, 177, 23);
		panel_5.add(chckbxNewCheckBox);
		
		textField_5 = new JTextField();
		textField_5.setBounds(214, 109, 46, 20);
		panel_5.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(214, 135, 46, 20);
		panel_5.add(textField_6);
		
		JCheckBox chckbxIncludeBrushingTeeth = new JCheckBox("Include Brushing Teeth");
		chckbxIncludeBrushingTeeth.setBounds(10, 134, 177, 23);
		panel_5.add(chckbxIncludeBrushingTeeth);
		
		JButton btnNewButton_4 = new JButton("Clear");
		btnNewButton_4.setBounds(130, 349, 89, 23);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Save");
		btnNewButton_4_1.setBounds(234, 349, 89, 23);
		panel_2.add(btnNewButton_4_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Bookings", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Bookings:");
		lblNewLabel_10.setBounds(36, 43, 105, 14);
		panel_3.add(lblNewLabel_10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(122, 39, 433, 22);
		panel_3.add(comboBox_4);
		
		JLabel lblNewLabel_10_1 = new JLabel("Clients: ");
		lblNewLabel_10_1.setBounds(36, 109, 105, 14);
		panel_3.add(lblNewLabel_10_1);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(122, 106, 307, 20);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Services:");
		lblNewLabel_10_1_1.setBounds(36, 181, 105, 14);
		panel_3.add(lblNewLabel_10_1_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(122, 178, 307, 20);
		panel_3.add(textField_8);
		
		JLabel lblNewLabel_10_1_1_1 = new JLabel("Date/ Time: ");
		lblNewLabel_10_1_1_1.setBounds(36, 263, 105, 14);
		panel_3.add(lblNewLabel_10_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(122, 260, 130, 20);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Clear");
		btnNewButton_5.setBounds(318, 316, 89, 23);
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("Save");
		btnNewButton_5_1.setBounds(430, 316, 89, 23);
		panel_3.add(btnNewButton_5_1);
	}
}
