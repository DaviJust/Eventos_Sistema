/**
 * Tela de login do usuário
 */
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class telaInicial extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JTextField login;
	private JTextField senha;
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
		/**
		 * limpa os campos de login e senha
		 */
		limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	login.setText("");
            	senha.setText("");
            	}
            });
		JButton entrar = new JButton("Entrar");
		entrar.setFont(new Font("Arial", Font.BOLD, 20));
		entrar.setBounds(232, 212, 156, 41);
		getContentPane().add(entrar);
		entrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	login.setText("");
            	senha.setText("");
            	}
            });

	}
}
