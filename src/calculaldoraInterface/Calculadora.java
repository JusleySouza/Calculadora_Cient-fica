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
	
	private Double num1, num2, total;
	private int exibicao;
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
		setBounds(100, 100, 533, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmpValores = new JTextField();
		cmpValores.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cmpValores.setBounds(10, 78, 495, 62);
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
				 exibir(num1, "*");
			}
		});
		btnMultiplicar.setBounds(266, 232, 70, 31);
		contentPane.add(btnMultiplicar);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "-";
				 exibir(num1, "-");
			}
		});
		btnSubtrair.setBounds(266, 275, 70, 31);
		contentPane.add(btnSubtrair);
		
		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "+";
				 exibir(num1, "+");
			}
		});
		btnSomar.setBounds(266, 313, 70, 31);
		contentPane.add(btnSomar);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 =  Double.parseDouble(cmpValores.getText());
				
				if (operacao == "+") {
					total = num1 + num2;
					exibir(num1, num2, total, "+");
				}
				else if (operacao == "-") {
					total = num1 - num2;
					exibir(num1, num2, total, "-");
				}
				else if (operacao == "x") {
					total = num1 * num2;
					exibir(num1, num2, total, "*");
				}
				else if (operacao == "/") {
					if(num2 ==0) {
						cmpValores.setText("Não é possível dividir por zero");
					}else {
					total= num1 / num2;
					exibir(num1, num2, total, "/");
					}
				}
				else if (operacao == "%") {
					total = (num1 * num2) / 100;
					exibir(num1, num2, total, "%");
				}
				else if(operacao == "xⁿ") {
					total = Math.pow(num1 , num2);
					exibir(num1, num2, total, "^");
				}
								
			}
		});
		btnResultado.setBounds(370, 354, 121, 31);
		contentPane.add(btnResultado);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "/";
				 exibir(num1, "/");
			}
		});
		btnDividir.setBounds(266, 190, 70, 31);
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
				 exibir(num1, "%");
			}
		});
		btnPorcentagem.setBounds(423, 190, 68, 31);
		contentPane.add(btnPorcentagem);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			}
		});
		btnSair.setBounds(198, 354, 148, 30);
		contentPane.add(btnSair);
		
		cmpDisplay = new JTextField();
		cmpDisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cmpDisplay.setEditable(false);
		cmpDisplay.setBounds(10, 23, 495, 55);
		contentPane.add(cmpDisplay);
		cmpDisplay.setColumns(10);
		
		JButton btnRaizQuadrada = new JButton("\u221Ax");
		btnRaizQuadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cmpValores.getText());
				total = Math.sqrt(num1);
				exibir(num1, total, "√");
			}
		});
		btnRaizQuadrada.setBounds(346, 190, 68, 30);
		contentPane.add(btnRaizQuadrada);
		
		JButton btnXElevadoAoQuadrado = new JButton("x\u00B2");
		btnXElevadoAoQuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cmpValores.getText());
				total = Math.pow(num1,2);
				exibir(num1, total, "sqr");
			}
		});
		btnXElevadoAoQuadrado.setBounds(346, 275, 68, 30);
		contentPane.add(btnXElevadoAoQuadrado);
		
		JButton btnXElevadoAoN = new JButton("xⁿ");
		btnXElevadoAoN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(cmpValores.getText());
				 operacao = "xⁿ";
				 cmpDisplay.setText(""+num1 + " ^");
				 cmpValores.setText("");
			}
		});
		btnXElevadoAoN.setBounds(346, 313, 68, 30);
		contentPane.add(btnXElevadoAoN);
		
		JButton btnXElevadoaMenosUm = new JButton("1/x");
		btnXElevadoaMenosUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cmpValores.getText());
				total = (1/num1);
				exibir(num1, total, " 1/");
			}
		});
		btnXElevadoaMenosUm.setBounds(346, 232, 68, 30);
		contentPane.add(btnXElevadoaMenosUm);
		
		JButton btnSeno = new JButton("sin");
		btnSeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cmpValores.getText());
				total = Math.sin(Math.toRadians(num1));
				exibir(num1, total, "sin");
			}
		});
		btnSeno.setBounds(423, 232, 68, 30);
		contentPane.add(btnSeno);
		
		JButton btnCosseno = new JButton("cos");
		btnCosseno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cmpValores.getText());
				total = Math.cos(Math.toRadians(num1));
				exibir(num1, total, "cos");
			}
		});
		btnCosseno.setBounds(423, 274, 68, 30);
		contentPane.add(btnCosseno);
		
		JButton btnTangente = new JButton("tan");
		btnTangente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cmpValores.getText());
				total = Math.tan(Math.toRadians(num1));
				exibir(num1, total, "tan");
			}
		});
		btnTangente.setBounds(424, 313, 68, 30);
		contentPane.add(btnTangente);
	}
	
	private void exibir(Double num1, Double result, String operacao ) {
		int valor = num1.intValue();
		double resto = num1 - valor;
		
		int valorResultado = result.intValue();
		double restoResultado = result - valorResultado;
		
		if(resto > 0) {
			cmpDisplay.setText(operacao + "(" + num1 + ")");
		}else {
			cmpDisplay.setText(operacao + "(" + num1.intValue() + ")");
		}
		
		if (restoResultado > 0)
		{
			cmpValores.setText("" + result);
		}else {
			cmpValores.setText("" + result.intValue());
		}
	}
	
	private void exibir(Double num1,Double num2, Double result, String operacao ) {
		int valor1 = num1.intValue();
		double resto = num1 - valor1;
		
		int valor2 = num2.intValue();
		double resto2 = num2 - valor2;
		
		int valorResultado = result.intValue();
		double restoResultado = result - valorResultado;
		
		if(resto > 0 && resto2 > 0) {
			cmpDisplay.setText(num1 + " " + operacao + " " + num2);
		} 
		else if(resto > 0 && resto2 == 0) {
			cmpDisplay.setText(num1 + " " + operacao + " " + num2.intValue());
		} 
		else if(resto == 0 && resto2 > 0) {
			cmpDisplay.setText(num1.intValue() + " " + operacao + " " + num2);
		}
		else {
			cmpDisplay.setText(num1.intValue() + " " + operacao + " " + num2.intValue());
		}
		
		
		if (restoResultado > 0)
		{
			cmpValores.setText("" + result);
		}else {
			cmpValores.setText("" + result.intValue());
		}
	}
	
	private void exibir(Double num1, String operacao) {
		int valor = num1.intValue();
		double resto = num1 - valor;
		
		if(resto > 0) {
			 cmpDisplay.setText(num1 + " "+ operacao);
		}else {
			 cmpDisplay.setText(num1.intValue() + " "+ operacao);
		}
		cmpValores.setText("");
	
	}
}
