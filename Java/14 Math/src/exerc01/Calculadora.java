package exerc01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setLocation(208, 176);
		btnNewButton.setSize(50, 20);
		btnNewButton.setBackground(Color.WHITE);
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		JButton button = new JButton("-");
		button.setBackground(Color.WHITE);
		button.setBounds(208, 145, 50, 20);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setBounds(208, 110, 50, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("÷");
		btnNewButton_2.setBounds(208, 76, 50, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnSen = new JButton("Sen");
		btnSen.setBounds(28, 76, 50, 23);
		contentPane.add(btnSen);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setBounds(88, 76, 50, 23);
		contentPane.add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setBounds(148, 76, 50, 23);
		contentPane.add(btnTan);
		
		JButton btnLog = new JButton("Log");
		btnLog.setBounds(268, 110, 50, 23);
		contentPane.add(btnLog);
		
		JButton btnx = new JButton("\u221Ax");
		btnx.setBounds(268, 175, 50, 23);
		contentPane.add(btnx);
		
		JButton btnx_1 = new JButton("\u00B3\u221Ax");
		btnx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnx_1.setBounds(268, 144, 50, 23);
		contentPane.add(btnx_1);
		
		JButton button_1 = new JButton("0");
		button_1.setBounds(28, 209, 50, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.setBounds(28, 175, 50, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.setBounds(88, 175, 50, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.setBounds(148, 175, 50, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setBounds(28, 144, 50, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setBounds(88, 144, 50, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setBounds(148, 144, 50, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setBounds(28, 110, 50, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.setBounds(88, 110, 50, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.setBounds(148, 110, 50, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.setBounds(208, 209, 50, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.setBounds(88, 209, 50, 23);
		contentPane.add(button_12);
		
		JButton btnAns = new JButton("Ans");
		btnAns.setBounds(148, 209, 50, 23);
		contentPane.add(btnAns);
		
		JButton btnNewButton_3 = new JButton("Del");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(268, 76, 50, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnOnoff = new JButton("On");
		btnOnoff.setBounds(268, 209, 50, 23);
		contentPane.add(btnOnoff);
		
		textField = new JTextField();
		textField.setBounds(28, 11, 290, 40);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
