package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class telaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField nome;
	/**
	 * Nome do participante
	 */
	private JTextField matricula;
	/**
	 * matrícula do participante
	 */
	private JTextField curso;
	/**
	 * curso do participante
	 */
	private JComboBox comboBoxEventos;
	/**
	 * Declaração dos componentes Swing
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastro frame = new telaCadastro();
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
	public telaCadastro() {
		getContentPane().setForeground(new Color(191, 191, 191));
		setBounds(100, 100, 466, 547);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel nomeLabel = new JLabel("Nome");
		nomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		nomeLabel.setBounds(10, 50, 64, 28);
		getContentPane().add(nomeLabel);
		
		nome = new JTextField();
		nome.setFont(new Font("Arial", Font.PLAIN, 16));
		nome.setBounds(10, 88, 410, 28);
		getContentPane().add(nome);
		nome.setColumns(10);
		
		JLabel cadastroLabel = new JLabel("Cadastro");
		cadastroLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		cadastroLabel.setBounds(175, 10, 105, 35);
		getContentPane().add(cadastroLabel);
		
		JLabel matriculaLabel = new JLabel("Matricula");
		matriculaLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		matriculaLabel.setBounds(10, 140, 83, 28);
		getContentPane().add(matriculaLabel);
		
		matricula = new JTextField();
		matricula.setFont(new Font("Arial", Font.PLAIN, 16));
		matricula.setColumns(10);
		matricula.setBounds(10, 178, 410, 28);
		getContentPane().add(matricula);
		
		JLabel cursoLabel = new JLabel("Curso");
		cursoLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		cursoLabel.setBounds(10, 229, 83, 28);
		getContentPane().add(cursoLabel);
		
		curso = new JTextField();
		curso.setFont(new Font("Arial", Font.PLAIN, 16));
		curso.setColumns(10);
		curso.setBounds(10, 267, 410, 28);
		getContentPane().add(curso);
		
		JLabel eventoDesejado = new JLabel("Evento Desejado");
		eventoDesejado.setFont(new Font("Times New Roman", Font.BOLD, 19));
		eventoDesejado.setBounds(10, 321, 204, 28);
		getContentPane().add(eventoDesejado);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		limpar.setFont(new Font("SansSerif", Font.BOLD, 19));
		limpar.setBounds(10, 429, 146, 40);
		getContentPane().add(limpar);

		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cadastrar.setFont(new Font("SansSerif", Font.BOLD, 19));
		cadastrar.setBounds(274, 429, 146, 40);
		getContentPane().add(cadastrar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 353, 410, 35);
		getContentPane().add(comboBox);

	}
}
