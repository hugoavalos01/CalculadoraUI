import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	double first, second, result;
	int num;
	boolean resultado;
	String operation, answer;
	Calculadora c = new Calculadora();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 761);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(10, 24, 526, 115);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn7.setBounds(20, 243, 84, 84);
		frame.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn4.setBounds(20, 337, 84, 84);
		frame.getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn1.setBounds(20, 431, 84, 84);
		frame.getContentPane().add(btn1);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn8.setBounds(165, 243, 84, 84);
		frame.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn5.setBounds(165, 337, 84, 84);
		frame.getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2.setBounds(165, 431, 84, 84);
		frame.getContentPane().add(btn2);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn9.setBounds(302, 243, 84, 84);
		frame.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn6.setBounds(302, 337, 84, 84);
		frame.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn3.setBounds(302, 431, 84, 84);
		frame.getContentPane().add(btn3);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn0.setBounds(20, 525, 84, 84);
		frame.getContentPane().add(btn0);

		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = textField.getText();
				if (texto.isEmpty()) {
					textField.setText("+");
				} else {
					try {
						first = Double.parseDouble(textField.getText());
						textField.setText("");
						operation = "+";
					} catch (Exception ex) {
						textField.setText("Accion invalida");
					}
				}
			}
		});
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSuma.setBounds(436, 149, 84, 84);
		frame.getContentPane().add(btnSuma);

		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = textField.getText();
				if (texto.isEmpty()) {
					textField.setText("-");
				} else {
					try {
						first = Double.parseDouble(textField.getText());
						textField.setText("");
						operation = "-";
					} catch (Exception ex) {
						textField.setText("Accion invalida");
					}
				}
			}
		});
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnResta.setBounds(436, 243, 84, 84);
		frame.getContentPane().add(btnResta);

		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "*";
				} catch (Exception ex) {
					textField.setText("Accion invalida");
				}

			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMult.setBounds(436, 337, 84, 84);
		frame.getContentPane().add(btnMult);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "/";
				} catch (Exception ex) {
					textField.setText("Accion invalida");
				}
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiv.setBounds(436, 431, 84, 84);
		frame.getContentPane().add(btnDiv);

		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.PLAIN, 16));
		btnB.setBounds(20, 149, 84, 84);
		frame.getContentPane().add(btnB);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);

			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC.setBounds(165, 149, 84, 84);
		frame.getContentPane().add(btnC);

		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn00.setBounds(302, 149, 84, 84);
		frame.getContentPane().add(btn00);

		JButton btnFact = new JButton("x!");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first = Double.parseDouble(textField.getText());
					num = (int) first;
					operation = "Fact";
					String number = textField.getText() + "!";
					textField.setText(number);
				} catch (Exception ex) {
					textField.setText("Accion invalida");
				}

			}
		});
		btnFact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFact.setBounds(436, 525, 84, 84);
		frame.getContentPane().add(btnFact);

		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty()) {
					textField.setText("0.");
				} else if (textField.getText().contains(".")) {

				} else {
					String number = textField.getText() + btnPunto.getText();
					textField.setText(number);
				}

			}
		});
		btnPunto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPunto.setBounds(165, 525, 84, 84);
		frame.getContentPane().add(btnPunto);

		JButton btnPrimo = new JButton("Primo");
		btnPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first = Double.parseDouble(textField.getText());
					num = (int) first;
					operation = "Primo";
					String number = textField.getText() + " es primo?";
					textField.setText(number);
				} catch (Exception ex) {
					textField.setText("Accion invalida");
				}

			}
		});
		btnPrimo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPrimo.setBounds(302, 525, 84, 84);
		frame.getContentPane().add(btnPrimo);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				if (operation == "+") {
					second = Double.parseDouble(textField.getText());
					result = c.suma(first, second);
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					second = Double.parseDouble(textField.getText());
					result = c.resta(first, second);
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					second = Double.parseDouble(textField.getText());
					result = c.mult(first, second);
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}

				else if (operation == "/") {
					second = Double.parseDouble(textField.getText());
					if (second == 0) {
						textField.setText("Math Error");
					} else {
						result = c.divide(first, second);
						answer = String.format("%.2f", result);
						textField.setText(answer);
					}
				}

				else if (operation == "Fact") {
					result = Double.valueOf(c.fact(num));
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}

				else if (operation == "Primo") {
					if (c.esPrimo(num) == true) {
						answer = "True";
					} else {
						answer = "False";
					}
					textField.setText(answer);
				}

			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEqual.setBounds(20, 619, 500, 84);
		frame.getContentPane().add(btnEqual);
	}
}
