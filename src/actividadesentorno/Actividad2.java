package actividadesentorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Actividad2 extends JFrame {

	private JPanel contentPane;
	private JTextField nombreproducto;
	private JTextField precioproducto;
	private JRadioButton superextra;
	private JRadioButton extra;
	private JRadioButton primera;
	private JRadioButton segunda;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton iva4;
	private JRadioButton iva10;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JCheckBox tasa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad2 frame = new Actividad2();
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
	public Actividad2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Entrada de datos de Texto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Producto:");
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo producto:");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Precio del Producto:");
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Categoría:");
		
		extra = new JRadioButton("Extra");
		buttonGroup.add(extra);
		ButtonModel ex=extra.getModel();
		extra.setBackground(new Color(128, 128, 128));
		
		primera = new JRadioButton("Primera");
		buttonGroup.add(primera);
		ButtonModel pri=primera.getModel();
		primera.setBackground(new Color(128, 128, 128));
		
		segunda = new JRadioButton("Segunda");
		buttonGroup.add(segunda);
		ButtonModel segu=segunda.getModel();
		segunda.setBackground(new Color(128, 128, 128));
		
		superextra = new JRadioButton("Super-Extra");
		buttonGroup.add(superextra);
		ButtonModel superex=superextra.getModel();
		superextra.setBackground(new Color(128, 128, 128));
		
		JLabel lblNewLabel_2 = new JLabel("IVA");
		
		iva4 = new JRadioButton("4%");
		buttonGroup_1.add(iva4);
		ButtonModel ivva4=iva4.getModel();
		iva4.setBackground(new Color(128, 128, 128));
		
		iva10 = new JRadioButton("10%");
		buttonGroup_1.add(iva10);
		ButtonModel ivva10=iva10.getModel();
		iva10.setBackground(new Color(128, 128, 128));
		
		JRadioButton iva21 = new JRadioButton("21%");
		buttonGroup_1.add(iva21);
		ButtonModel ivva21=iva21.getModel();
		iva21.setBackground(new Color(128, 128, 128));
		
		tasa = new JCheckBox("Aplicar Tasa");
		buttonGroup_2.add(tasa);
		
		tasa.setBackground(new Color(128, 128, 128));
		
		
		
		JComboBox tipodeproducto = new JComboBox();
		tipodeproducto.setModel(new DefaultComboBoxModel(new String[] {"De temporada", "Importado", "Consumo popular", "Durarero", "No duradero"}));
		tipodeproducto.setToolTipText("");
		
		
		JButton datostecleados = new JButton("Ver datos tecleados");
	
		datostecleados.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton limpiardatos = new JButton("Limpiar datos");
		limpiardatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreproducto.setText(" ");
				precioproducto.setText(" ");
				
			}
		});
		limpiardatos.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		

		
		nombreproducto = new JTextField();
		nombreproducto.setColumns(10);
		

		
		precioproducto = new JTextField();
		precioproducto.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(85)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(89)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nombreproducto, 133, 133, 133))
								.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tipodeproducto, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addGap(63)
									.addComponent(tasa))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(precioproducto, 137, 137, 137))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(iva4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(iva10)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(iva21)))
							.addGap(85))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(93)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(primera, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(extra, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(segunda, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
										.addComponent(superextra, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(104)
									.addComponent(datostecleados)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(limpiardatos, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
					.addGap(172))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(nombreproducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1)
						.addComponent(tipodeproducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tasa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1)
						.addComponent(precioproducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(lblNewLabel_1_1_1_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(extra)
						.addComponent(segunda))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(superextra)
						.addComponent(primera))
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(iva4)
						.addComponent(iva21)
						.addComponent(iva10))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(datostecleados)
						.addComponent(limpiardatos))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
		);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		contentPane.setLayout(gl_contentPane);
		
		datostecleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("LOS DATOS TECLEADOS SON:");
				textArea.append("\n===================================");
				textArea.append("\nEl nombre del producto es: " +nombreproducto.getText());
				textArea.append("\nEl precio del producto es: "+precioproducto.getText());
				textArea.append ("\nEl tipo de producto es: "+tipodeproducto.getSelectedItem());
				textArea.append("\n===================================");
				
				
				
				
				
				
				if(buttonGroup.getSelection()!=null) {
					if(buttonGroup.getSelection().equals(ex)) {
						textArea.append("\nPulsaste Extra");
					}
					if(buttonGroup.getSelection().equals(pri)) {
						textArea.append("\nPulsaste Primera");
					}
					if(buttonGroup.getSelection().equals(segu)) {
						textArea.append("\nPulsaste Segunda");
					}
					if(buttonGroup.getSelection().equals(superex)) {
						textArea.append("\nPulsaste Super-extra");
					}
					
						
				}else {
					textArea.append("\nNo has seleccionado ninguna categoría");
				}
				
				
				if(buttonGroup_2.getSelection()!=null) {
					textArea.append("Añadiste la Tasa");
				}else {
					textArea.append("No añadiste la Tasa");
				}
	
				if(buttonGroup_1.getSelection()!=null) {
					
					if(buttonGroup_1.getSelection().equals(ivva4)) {
						textArea.append("\nPulsaste 4% de IVA");
					}
					if(buttonGroup_1.getSelection().equals(ivva10)) {
						textArea.append("\nPulsaste 10% de IVA");
					}
					if(buttonGroup_1.getSelection().equals(ivva21)) {
						textArea.append("\nPulsaste 21% de IVA");
					}
	
				}
	
				textArea.append("\n==============================");
			}
			
		});
		
	}
}
