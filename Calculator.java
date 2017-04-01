package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 252, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 211, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Zero row-----------------------------------------------------------------
		JButton btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				
				if(textField.getText().length()>0){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnBack.setBounds(10, 55, 44, 37);
		frame.getContentPane().add(btnBack);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(64, 55, 44, 37);
		frame.getContentPane().add(btnCancel);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnPer.setBounds(118, 55, 44, 37);
		frame.getContentPane().add(btnPer);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.setBounds(174, 55, 47, 37);
		frame.getContentPane().add(btnDiv);
		
		//first row--------------------------------------------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(10, 110, 44, 37);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(64, 110, 44, 37);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(118, 110, 44, 37);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.setBounds(174, 110, 47, 37);
		frame.getContentPane().add(btnPlus);
		
		//second row-----------------------------------------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(10, 165, 44, 37);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(64, 165, 44, 37);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(118, 165, 44, 37);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(174, 165, 47, 37);
		frame.getContentPane().add(btnMinus);
		
		//third row-----------------------------------------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(10, 220, 44, 37);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(64, 220, 44, 37);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(118, 220, 44, 37);
		frame.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMult.setBounds(174, 220, 47, 37);
		frame.getContentPane().add(btnMult);
		
		//third fourth-----------------------------------------------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber= textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(10, 275, 44, 37);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBounds(64, 275, 44, 37);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops= Double.parseDouble(String.valueOf(textField.getText()));
				ops= ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 5));
		btnPM.setBounds(118, 275, 44, 37);
		frame.getContentPane().add(btnPM);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum = Double.parseDouble(textField.getText());
				if (operations == "+"){
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "-"){
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "*"){
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "/"){
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "%"){
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEquals.setBounds(174, 275, 47, 37);
		frame.getContentPane().add(btnEquals);
	}
}
