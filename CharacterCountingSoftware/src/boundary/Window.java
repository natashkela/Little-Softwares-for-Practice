package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.CountIt;
import entities.Charcount;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static Charcount model;
	private JLabel label;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window(model);
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
	public Window(Charcount model) {
		this.model = model;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(27, 65, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPleaseEnterA = new JLabel("Please enter a string to count its characters");
		lblPleaseEnterA.setBounds(27, 26, 273, 16);
		contentPane.add(lblPleaseEnterA);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new CountIt(model,this));
		btnSubmit.setBounds(306, 62, 103, 29);
		contentPane.add(btnSubmit);
		
		label = new JLabel("0");
		label.setBounds(27, 103, 61, 16);
		contentPane.add(label);
		
	}
	
	public String getString(){
		return textField.getText();
	}
	
	public void setLabel(int num){
		label.setText(Integer.toString(num));
	}
}
