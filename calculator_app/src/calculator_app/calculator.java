package calculator_app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(10, 11, 206, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JRadioButton onButton = new JRadioButton("ON");
		onButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		onButton.setBounds(10, 38, 45, 23);
		contentPane.add(onButton);
		
		JRadioButton offButton = new JRadioButton("OFF");
		offButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		offButton.setBounds(10, 64, 45, 23);
		contentPane.add(offButton);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(61, 42, 56, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(116, 42, 45, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBounds(171, 194, 45, 39);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("7");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setBounds(10, 94, 45, 39);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("8");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3.setBounds(61, 94, 45, 39);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("9");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_4.setBounds(116, 94, 45, 39);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("-");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_5.setBounds(171, 144, 45, 39);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("4");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_6.setBounds(10, 144, 45, 39);
		contentPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("5");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_7.setBounds(61, 144, 45, 39);
		contentPane.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("6");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_8.setBounds(116, 144, 45, 39);
		contentPane.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("*");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_9.setBounds(171, 94, 45, 39);
		contentPane.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("1");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_10.setBounds(10, 194, 45, 39);
		contentPane.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("2");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_1_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_11.setBounds(61, 194, 45, 39);
		contentPane.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_12 = new JButton("3");
		btnNewButton_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_1_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_12.setBounds(116, 194, 45, 39);
		contentPane.add(btnNewButton_1_12);
		
		JButton btnNewButton_1_13 = new JButton("/");
		btnNewButton_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		btnNewButton_1_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_13.setBounds(171, 42, 45, 39);
		contentPane.add(btnNewButton_1_13);
		
		JButton btnNewButton_1_14 = new JButton("0");
		btnNewButton_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_1_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_14.setBounds(10, 244, 45, 39);
		contentPane.add(btnNewButton_1_14);
		
		JButton btnNewButton_1_15 = new JButton(".");
		btnNewButton_1_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnNewButton_1_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_15.setBounds(61, 244, 45, 39);
		contentPane.add(btnNewButton_1_15);
		
		JButton btnNewButton_1_16 = new JButton("=");
		btnNewButton_1_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "=");
			}
		});
		btnNewButton_1_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_16.setBounds(116, 244, 100, 39);
		contentPane.add(btnNewButton_1_16);
	}
}
