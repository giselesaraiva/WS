package Testednv;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CheckList extends JPanel {
	/**
	 * 
	 */
	
	Connection conn = null;

	Statement stmt = null;

	ResultSet rs = null;

	PreparedStatement ps = null;

	
	private static final long serialVersionUID = 1L;
	
	JButton btnFeitas;
	JButton btnAdicionar;
	JButton btnFazer;
	JButton btnSalvar;
	JButton btnVoltarInicio;
	JLabel checklist;
	JLabel mngCheck;
	JPanel panelAlgumaCoisa;
	Container contentPane;
	JTextField txtFields;
	List <JCheckBox> checkBox = new ArrayList<>();
	String tarefaSalva;
	private JTextArea taTexto;
	private final static String novaLinha = "\n";

	CheckList() {
		inicializaComponentes();
		definirEventos();
	}

	public void inicializaComponentes() {
		setLayout(null);

		
		btnAdicionar = new JButton("Adicionar tarefa");
		btnFeitas = new JButton("Tarefas concluidas");
		btnFazer = new JButton("Tarefas a fazer");
		btnSalvar = new JButton("Salvar tarefa");
		btnVoltarInicio = new JButton("Voltar");
		checklist = new JLabel("CHECKLIST");
		mngCheck = new JLabel("Adicione uma tarefa: ");
		txtFields = new JTextField();
		checkBox = new ArrayList<>();
		taTexto = new JTextArea(5, 20);
		panelAlgumaCoisa = new JPanel();

		taTexto.setEditable(false);

		checklist.setBounds(250, -220, 500, 500);
		btnFazer.setBounds(40, 90, 150, 25);
		btnFeitas.setBounds(205, 90, 150, 25);
		btnAdicionar.setBounds(380, 90, 150, 25);

		add(checklist);
		add(btnFazer);
		add(btnFeitas);
		add(btnAdicionar);
	}

	private void definirEventos() {
		btnAdicionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnFazer.setVisible(false);
				btnAdicionar.setVisible(false);
				btnFeitas.setVisible(false);

				add(panelAlgumaCoisa);
				panelAlgumaCoisa.setLayout(null);
				panelAlgumaCoisa.setBounds(0, 0, 580, 250);

				btnSalvar.setBounds(320, 130, 150, 25);
				btnVoltarInicio.setBounds(100,130,150,25);
				mngCheck.setBounds(50, 30, 150, 20);
				txtFields.setBounds(200, 15, 200, 50);
				taTexto.append(txtFields.getText() + novaLinha);
				taTexto.setCaretPosition(taTexto.getDocument().getLength());

				panelAlgumaCoisa.add(mngCheck);
				panelAlgumaCoisa.add(txtFields);
				panelAlgumaCoisa.add(btnSalvar);
				panelAlgumaCoisa.add(btnVoltarInicio);

				tarefaSalva = txtFields.getText();
			}
		});

		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				adicionarTarefa();
			}
		});
		
		btnVoltarInicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(CheckList.this);
		        frame.getContentPane().removeAll();
		        frame.getContentPane().add(new CheckList());
		        frame.revalidate();

			}
		});
		
		btnFazer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnAdicionar.setVisible(false);
				btnFazer.setVisible(false);
				btnFeitas.setVisible(false);
				checklist.setVisible(false);
				

				Container contentPane = getParent();
		        contentPane.add(panelAlgumaCoisa);

				verTarefas();
			}
		});
	

	}

	public void adicionarTarefa() {

			try {
				
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testes","root","souza0868");
				
				String cadastrar = "insert into checklist (descricao,status) values (?,?)";
				
				String descricao = txtFields.getText();
				String status = "fazer";
				
				ps = conn.prepareStatement(cadastrar);
				
				ps.setString(1, descricao);
				ps.setString(2, status);
				int check = ps.executeUpdate();
				
				if(check>0) {
					
					txtFields.setText(null);
					txtFields.requestFocus();
					
					
				}
				
				
			}catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
			
		}
	
	private void verTarefas() {
		
		try {
			
			btnVoltarInicio.setBounds(100,500,150,25);
			panelAlgumaCoisa.add(btnVoltarInicio);
			
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testes","root","souza0868");
		
		stmt = conn.createStatement();
		
		String consultar = "select descricao from checklist";
		
		rs = stmt.executeQuery(consultar);
		
		panelAlgumaCoisa.setLayout(null);
		panelAlgumaCoisa.setPreferredSize(new Dimension(580, 250));

		int y = 30;
		
		while(rs.next()) {
			
				String descricao = rs.getString("descricao");
				JCheckBox checkBoxItem = new JCheckBox(descricao);
				checkBoxItem.setBounds(50, y, 400, 20);
			    panelAlgumaCoisa.add(checkBoxItem);
			    checkBoxItem.setVisible(true);
			    y += 25;
			    
		}
		
		
		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("CheckList");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new CheckList());
		frame.setBounds(0, 0, 700, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}