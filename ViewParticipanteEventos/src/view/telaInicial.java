package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class telaInicial extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JTextField login;
	/**
	 * login de quem vai realizar o cadastro do estudante
	 */
	private JTextField senha;
	/**
	 *senha de quem vai realizar o cadastro do estudante
	 */
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
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
	public telaInicial() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		senhaLabel.setBounds(20, 102, 98, 41);
		getContentPane().add(senhaLabel);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		loginLabel.setBounds(20, 10, 98, 41);
		getContentPane().add(loginLabel);
		
		login = new JTextField();
		login.setText("Digite seu login");
		login.setToolTipText("");
		login.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		login.setBounds(20, 54, 387, 41);
		getContentPane().add(login);
		login.setColumns(10);
		
		senha = new JTextField();
		senha.setText("Digite a sua senha");
		senha.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		senha.setColumns(10);
		senha.setBounds(20, 153, 387, 41);
		getContentPane().add(senha);
		
		JButton limpar = new JButton("Limpar");

		limpar.setFont(new Font("Arial", Font.BOLD, 20));
		limpar.setBounds(20, 212, 156, 41);
		getContentPane().add(limpar);
		
		JButton Entrar = new JButton("Entrar");
		Entrar.setFont(new Font("Arial", Font.BOLD, 20));
		Entrar.setBounds(232, 212, 156, 41);
		getContentPane().add(Entrar);

	}
}
