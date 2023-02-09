package actividadesentorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JScrollBar;

public class Actividad1 extends JFrame {

	private JPanel contentPane;
	private JTextField códigodepartamento;
	private JTextField nombredepartamento;
	private JTextField localidadepartamento;
	private JComboBox variablepais;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton gestion;
	private JRadioButton personal;
	private JRadioButton apoyo;
	private JRadioButton tecnologico;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad1 frame = new Actividad1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Actividad1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("CÓDIGO DE DEPARTAMENTO:");
		
		JLabel lblNewLabel_1_1 = new JLabel("NOMBRE DE DEPARTAMENTO:");
		
		JLabel lblNewLabel_1_2 = new JLabel("LOCALIDAD DEPARTAMENTO:");
		
		códigodepartamento = new JTextField();
		códigodepartamento.setColumns(10);
		
		nombredepartamento = new JTextField();
		nombredepartamento.setColumns(10);
		
		localidadepartamento = new JTextField();
		localidadepartamento.setColumns(10);
		
		gestion = new JRadioButton("Gestión");
		buttonGroup.add(gestion);
		ButtonModel gest=gestion.getModel();
		
		personal = new JRadioButton("Personal");
		buttonGroup.add(personal);
		ButtonModel perso=personal.getModel();
		
		apoyo = new JRadioButton("Apoyo");
		buttonGroup.add(apoyo);
		ButtonModel gestapo =apoyo.getModel();
		
		tecnologico = new JRadioButton("Tecnológico");
		buttonGroup.add(tecnologico);
		ButtonModel tecno= tecnologico.getModel();
		
		JButton btnInsertarDatos = new JButton("INSERTAR DATOS");//este es el boton de insertar
		
		btnInsertarDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		
		
		
		JButton btnNewButton = new JButton("LIMPIAR DATOS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				códigodepartamento.setText("");
				nombredepartamento.setText("");
				localidadepartamento.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		variablepais = new JComboBox();
		variablepais.setModel(new DefaultComboBoxModel(new String[] {"Nauru", "San Marino", "España", "Liechtenstein", "Ucrania", "Rusia"}));
		
		JLabel lblNewLabel_2 = new JLabel("PAÍS:");
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de departamento:");
		
		JScrollPane scrollPane = new JScrollPane();
		
		
	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(45)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(73)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(variablepais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(30)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(nombredepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(códigodepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(localidadepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(37)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_3)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(gestion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(personal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(apoyo, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
										.addComponent(tecnologico, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnInsertarDatos)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnNewButton))))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(139)
							.addComponent(lblNewLabel)))
					.addContainerGap(38, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1)
								.addComponent(nombredepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2)
								.addComponent(localidadepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(códigodepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(gestion)
								.addComponent(tecnologico))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(personal)
								.addComponent(apoyo))))
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(variablepais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnInsertarDatos)
						.addComponent(btnNewButton))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		contentPane.setLayout(gl_contentPane);
		
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(buttonGroup.getSelection()!=null) {
					if(buttonGroup.getSelection().equals(gest)) {
						System.out.println("Pulsaste Gestión");
					}
					if(buttonGroup.getSelection().equals(perso)) {
						System.out.println("Pulsaste Personal");
					}
					if(buttonGroup.getSelection().equals(gestapo)) {
						System.out.println("Pulsaste Apoyo");
					}
					if(buttonGroup.getSelection().equals(tecno)) {
						System.out.println("Pulsaste Tecnología");
					}
					
						
				}
				textArea.setText("El código de departamento es: "+códigodepartamento.getText());
				textArea.append("\nEl nombre del departamento es: "+nombredepartamento.getText());
				textArea.append("\nLa localidad del departamento es: "+localidadepartamento.getText());
				textArea.append("\nLa posición del país es: "+variablepais.getSelectedIndex());
				textArea.append("\nEl país seleccionado es: "+variablepais.getSelectedItem());
				


				
			}
		});
		
	}
}
