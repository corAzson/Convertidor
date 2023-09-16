package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;
import java.util.Hashtable;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField importe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel background = new JPanel();
		background.setBounds(0, 0, 788, 364);
		background.setBackground(new Color(255, 255, 255));
		contentPane.add(background);
		background.setLayout(null);
		
		JPanel fondoazul = new JPanel();
		fondoazul.setBackground(new Color(0, 51, 102));
		fondoazul.setBounds(0, 56, 788, 253);
		background.add(fondoazul);
		fondoazul.setLayout(null);
		
		JLabel lblDe = new JLabel("De:");
		lblDe.setForeground(Color.WHITE);
		lblDe.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lblDe.setBounds(253, 43, 95, 41);
		fondoazul.add(lblDe);
		
		JLabel lblNewLabel = new JLabel("Importe:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 40, 95, 41);
		fondoazul.add(lblNewLabel);
		
		JComboBox origen = new JComboBox();
		origen.setBounds(253, 71, 224, 22);
		fondoazul.add(origen);
		origen.addItem("USD");
		origen.addItem("EUR");
		origen.addItem("MXN");
		origen.addItem(getIconImage("/imagenes/mexico.png"));
			
		
		JComboBox destino = new JComboBox();
		destino.setBounds(537, 71, 241, 22);
		fondoazul.add(destino);
		
		importe = new JTextField();
		importe.setBounds(10, 71, 193, 20);
		fondoazul.add(importe);
		importe.setColumns(10);
		
		JLabel lblA = new JLabel("a:");
		lblA.setForeground(Color.WHITE);
		lblA.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lblA.setBounds(537, 43, 31, 41);
		fondoazul.add(lblA);
	}
}
