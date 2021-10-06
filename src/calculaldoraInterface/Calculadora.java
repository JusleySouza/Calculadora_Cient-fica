package calculaldoraInterface;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField cmpValores;
	
	private double num1, num2, total;
	private String operacao;
	private JTextField cmpDisplay;
	
	
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

	
	public Calculadora() {
		setTitle("Calculadora Ju");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmpValores = new JTextField();
		cmpValores.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cmpValores.setBounds(10, 64, 343, 64);
		contentPane.add(cmpValores);
		cmpValores.setColumns(10);
		
		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+"7");
			}
		});
		btnSete.setBounds(27, 190, 68, 31);
		contentPane.add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+"8");
			}
		});
		btnOito.setBounds(105, 190, 73, 31);
		contentPane.add(btnOito);
		
		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+"9");
			}
		});
		btnNove.setBounds(188, 190, 68, 31);
		contentPane.add(btnNove);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+"4");
			}
		});
		btnQuatro.setBounds(27, 232, 68, 31);
		contentPane.add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText("");
				cmpValores.setText(valor+"5");
			}
		});
		btnCinco.setBounds(105, 232, 73, 31);
		contentPane.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText("");
				cmpValores.setText(valor+"6");
			}
		});
		btnSeis.setBounds(188, 232, 68, 31);
		contentPane.add(btnSeis);
		
		JButton btnUm = new JButton("1");
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+"1");
			}
		});
		btnUm.setBounds(27, 275, 68, 31);
		contentPane.add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+"2");
			}
		});
		btnDois.setBounds(105, 274, 73, 31);
		contentPane.add(btnDois);
		
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+"3");
			}
		});
		btnTres.setBounds(188, 274, 68, 31);
		contentPane.add(btnTres);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+"0");
			}
		});
		btnZero.setBounds(105, 313, 73, 31);
		contentPane.add(btnZero);
		
		JButton btnMultiplicar = new JButton("x");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "x";
				 cmpDisplay.setText(""+num1 + " x");
				 cmpValores.setText("");
			}
		});
		btnMultiplicar.setBounds(266, 190, 70, 31);
		contentPane.add(btnMultiplicar);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "-";
				 cmpDisplay.setText(""+num1 + " -");
				 cmpValores.setText("");
			}
		});
		btnSubtrair.setBounds(266, 232, 70, 31);
		contentPane.add(btnSubtrair);
		
		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "+";
				 cmpDisplay.setText(""+num1 + " +");
				 cmpValores.setText("");
			}
		});
		btnSomar.setBounds(266, 274, 70, 31);
		contentPane.add(btnSomar);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 =  Double.parseDouble(cmpValores.getText());
				
				if (operacao == "+") {
					total = num1 + num2;
				}
				else if (operacao == "-") {
					total = num1 - num2;
				}
				else if (operacao == "x") {
					total = num1 * num2;
				}
				else if (operacao == "/") {
					total= num1 / num2;
				}
				else if (operacao == "%") {
					total = (num1 * num2) / 100;
				}
				else if (operacao == "x²") {
					total = num1 * num1;
				}
				
				cmpDisplay.setText("");
				cmpDisplay.setText(""+num1 + " " + operacao + " " + num2);
				cmpValores.setText("");
				cmpValores.setText("" + total);
				
			}
		});
		btnResultado.setBounds(266, 313, 70, 31);
		contentPane.add(btnResultado);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "/";
				 cmpDisplay.setText(""+num1 + " /");
				 cmpValores.setText("");
			}
		});
		btnDividir.setBounds(266, 148, 70, 31);
		contentPane.add(btnDividir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpValores.setText("");
				cmpDisplay.setText("");
			}
		});
		btnLimpar.setBounds(27, 354, 151, 31);
		contentPane.add(btnLimpar);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor;
				valor = cmpValores.getText();
				cmpValores.setText(valor+".");	
			}
		});
		btnPonto.setBounds(188, 313, 68, 31);
		contentPane.add(btnPonto);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpValores.setText("");
			}
		});
		btnCE.setBounds(27, 313, 68, 31);
		contentPane.add(btnCE);
		
		JButton btnPorcentagem = new JButton("%");
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "%";
				 cmpDisplay.setText(""+num1 + " %");
				 cmpValores.setText("");
			}
		});
		btnPorcentagem.setBounds(27, 148, 68, 31);
		contentPane.add(btnPorcentagem);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			}
		});
		btnSair.setBounds(188, 355, 148, 28);
		contentPane.add(btnSair);
		
		cmpDisplay = new JTextField();
		cmpDisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cmpDisplay.setEditable(false);
		cmpDisplay.setBounds(10, 11, 343, 55);
		contentPane.add(cmpDisplay);
		cmpDisplay.setColumns(10);
	}
}
