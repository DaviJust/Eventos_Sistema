	/**
	 * Classe responsável por mostrar os alunos cadastrados para os eventos, seus dados e etc..
	 */
package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Cadastros extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame;
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane barraScroll;
	private JButton adicionar;
	private JTextField name;
	private JTextField matricula;
	private JTextField curso;
	private JComboBox eventoOpcoes;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastros frame = new Cadastros();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastros() {
	
        frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(755, 475);
        frame.getContentPane().setLayout(null);

        String[] columnNames = {"Nome","Matricula","Curso","Evento"};
        Object[][] data = {
            {"Davi", 4455252, "Ciencia da computa", "IA"},
       
        };

        model = new DefaultTableModel(data, columnNames);

        barraScroll = new JScrollPane();
        barraScroll.setBounds(388, 76, 343, 362);
        frame.getContentPane().add(barraScroll);
        table = new JTable(model);
        barraScroll.setViewportView(table);

       
        
        JLabel cadastroLabel = new JLabel("Cadastro");
        cadastroLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
        cadastroLabel.setBounds(109, 10, 105, 35);
        frame.getContentPane().add(cadastroLabel);
        
        JLabel nomeLabel = new JLabel("Nome");
        nomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
        nomeLabel.setBounds(10, 54, 64, 28);
        frame.getContentPane().add(nomeLabel);
        
        name = new JTextField();
        name.setFont(new Font("Arial", Font.PLAIN, 16));
        name.setColumns(10);
        name.setBounds(10, 91, 312, 28);
        frame.getContentPane().add(name);
        
        JLabel matriculaLabel = new JLabel("Matricula");
        matriculaLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
        matriculaLabel.setBounds(10, 129, 83, 28);
        frame.getContentPane().add(matriculaLabel);
        
        matricula = new JTextField();
        matricula.setFont(new Font("Arial", Font.PLAIN, 16));
        matricula.setColumns(10);
        matricula.setBounds(10, 167, 312, 28);
        frame.getContentPane().add(matricula);
        
        JLabel cursoLabel = new JLabel("Curso");
        cursoLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
        cursoLabel.setBounds(10, 205, 83, 28);
        frame.getContentPane().add(cursoLabel);
        
        curso = new JTextField();
        curso.setFont(new Font("Arial", Font.PLAIN, 16));
        curso.setColumns(10);
        curso.setBounds(10, 243, 312, 28);
        frame.getContentPane().add(curso);
        
        JLabel eventoDesejado = new JLabel("Evento Desejado");
        eventoDesejado.setFont(new Font("Times New Roman", Font.BOLD, 19));
        eventoDesejado.setBounds(10, 281, 204, 28);
        frame.getContentPane().add(eventoDesejado);
        
        String[] opcoesDoEventos = { "Pensamento Computacional", "Empregabilidade e IA", "Habilidades ou networking?" };
        JComboBox eventoOpcoes = new JComboBox<>(opcoesDoEventos);
        eventoOpcoes.setFont(new Font("Arial", Font.PLAIN, 16));
        eventoOpcoes.setBounds(10, 313, 312, 35);
        String chosenName = eventoOpcoes.getSelectedItem().toString();

		frame.getContentPane().add(eventoOpcoes);
        
        JButton limpar = new JButton("Limpar");
        limpar.setFont(new Font("SansSerif", Font.BOLD, 19));
        limpar.setBounds(10, 388, 146, 40);
        frame.getContentPane().add(limpar);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 2, 2);
        frame.getContentPane().add(scrollPane);
        
        JLabel cadastradosLabel = new JLabel("Cadastrados");
        cadastradosLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
        cadastradosLabel.setBounds(479, 10, 146, 35);
        frame.getContentPane().add(cadastradosLabel);
        
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setForeground(new Color(0, 0, 0));
        separator.setBackground(new Color(0, 0, 0));
        separator.setBounds(351, 10, 2, 428);
        frame.getContentPane().add(separator);
        adicionar = new JButton("Adicionar");
        adicionar.setFont(new Font("SansSerif", Font.BOLD, 19));
        adicionar.setBounds(183, 388, 146, 40);
        adicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] dados = {name.getText(),matricula.getText(),curso.getText(),chosenName};
                model.addRow(dados);;
            }
        });
        frame.getContentPane().add(adicionar);
        frame.setVisible(true);
    }

  
}
