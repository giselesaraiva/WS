package Testednv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CadastroFinal extends javax.swing.JFrame {
	
	int check = 0;

    /**
     * Creates new form Cadastro
     */
    public CadastroFinal() {
        initComponents();
        this.verSenha.setVisible(false);
         this.verSenhaConfirma.setVisible(false);
         setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnVoltaLogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BoxGrau = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pwdSenha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        pwdSenhaConfima = new javax.swing.JPasswordField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        verSenha = new javax.swing.JLabel();
        naoVerSenha = new javax.swing.JLabel();
        verSenhaConfirma = new javax.swing.JLabel();
        naoVerSenhaConfirma = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 6, 69));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("LOGIN");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 6, 59));
        jLabel4.setText("Nome de usuário: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 240, 236));

        jPanel2.setBackground(new java.awt.Color(190, 227, 219));

        btnVoltaLogin.setBackground(new java.awt.Color(171, 202, 194));
        btnVoltaLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVoltaLogin.setForeground(new java.awt.Color(50, 75, 70));
        btnVoltaLogin.setText("CONTINUAR");
        btnVoltaLogin.setBorder(null);
        btnVoltaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(648, 648, 648))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVoltaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(190, 227, 219));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 73, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CADASTRO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(569, 569, 569))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 62, 58));
        jLabel5.setText("Data de nascimento:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 62, 58));
        jLabel6.setText("Nome: ");

        txtNome.setBackground(new java.awt.Color(240, 255, 249));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 62, 58));
        jLabel7.setText("Sobrenome: ");

        txtSobrenome.setBackground(new java.awt.Color(240, 255, 249));
        txtSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtSobrenome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 27)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 62, 58));
        jLabel8.setText("Grau de escolaridade: ");

        BoxGrau.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        BoxGrau.setForeground(new java.awt.Color(34, 50, 47));
        BoxGrau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma das opções:", " ", "Ainda estou no Ensino Fundamental", "1º Ano do Ensino Médio", "2º Ano do Ensino Médio", "3º Ano do Ensino Médio", "Já me formei ", " " }));
        BoxGrau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxGrauActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 27)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 62, 58));
        jLabel9.setText("Confirmar senha:");

        txtNomeUsuario.setBackground(new java.awt.Color(240, 255, 249));
        txtNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtNomeUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(233, 246, 243));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 27)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 62, 58));
        jLabel10.setText("Nome de usuário: ");

        pwdSenha.setBackground(new java.awt.Color(240, 255, 249));
        pwdSenha.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        pwdSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 27)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(42, 62, 58));
        jLabel11.setText("Senha:");

        pwdSenhaConfima.setBackground(new java.awt.Color(240, 255, 249));
        pwdSenhaConfima.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        pwdSenhaConfima.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jFormattedTextField1.setBackground(new java.awt.Color(240, 255, 249));
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        verSenha.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\FERNANDA ESCOLA 2023\\POO\\TesteLogin\\OlhoVerSenha.png")); // NOI18N
        verSenha.setText("jLabel3");
        verSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verSenhaMousePressed(evt);
            }
        });

        naoVerSenha.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\FERNANDA ESCOLA 2023\\POO\\TesteLogin\\OlhoNaoVerSenha.png")); // NOI18N
        naoVerSenha.setText("jLabel12");
        naoVerSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                naoVerSenhaMousePressed(evt);
            }
        });

        verSenhaConfirma.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\FERNANDA ESCOLA 2023\\POO\\TesteLogin\\OlhoVerSenha.png")); // NOI18N
        verSenhaConfirma.setText("jLabel3");
        verSenhaConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verSenhaConfirmaMousePressed(evt);
            }
        });

        naoVerSenhaConfirma.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\FERNANDA ESCOLA 2023\\POO\\TesteLogin\\OlhoNaoVerSenha.png")); // NOI18N
        naoVerSenhaConfirma.setText("jLabel12");
        naoVerSenhaConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                naoVerSenhaConfirmaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BoxGrau, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel8)))
                        .addGap(436, 436, 436)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(naoVerSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pwdSenhaConfima, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verSenhaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(naoVerSenhaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(801, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BoxGrau, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verSenha)
                            .addComponent(naoVerSenha))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdSenhaConfima, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(naoVerSenhaConfirma)
                            .addComponent(verSenhaConfirma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(614, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @SuppressWarnings("deprecation")
	private void cadastroBD() {
		// TODO Auto-generated method stub
    	Connection conn = null;

		Statement stmt = null;

		PreparedStatement ps = null;
		
		try {
			check = 0;
			String geSelectd = (String) BoxGrau.getSelectedItem();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_winxstudies","root","souza0868");
			stmt = conn.createStatement();
			String cadastrar = "insert into usuario (nome,sobrenome,datanas,usuario,senha,grauescola) values (?,?,?,?,?,?)";
			ps = conn.prepareStatement(cadastrar);
			
			ps.setString(1, txtNome.getText());
			ps.setString(2, txtSobrenome.getText());
			ps.setString(3, jFormattedTextField1.getText());
			ps.setString(4, txtNomeUsuario.getText());
			String combo = BoxGrau.getSelectedItem().toString();
			
			if(pwdSenha.getText().equals(pwdSenhaConfima.getText())) {
			
				ps.setString(5, pwdSenha.getText());
			
				
			}	else {
					
					JOptionPane.showMessageDialog(null, "Você não confirmou sua senha corretamente");
					
				}
				
				if(txtNome.getText()==null || txtSobrenome.getText()==null || jFormattedTextField1.getText()==null || txtNomeUsuario.getText()==null || pwdSenha.getText()==null || combo.equals("Selecionar")) {
					
					JOptionPane.showMessageDialog(null, "Campos obrigatorios não preenchidos!");
					return;
			
				}else if(txtNome.getText().isEmpty() || txtSobrenome.getText().isEmpty() || jFormattedTextField1.getText().isEmpty() || txtNomeUsuario.getText().isEmpty() || pwdSenha.getText().isEmpty() || combo.equals("Selecionar")) {
					
					JOptionPane.showMessageDialog(null, "Campos obrigatorios não preenchidos!");
					return;
					
				}
				
				else if (!combo.equals("Escolha uma das opções:")){
					ps.setString(6, combo);
					check = ps.executeUpdate();
				}
		
		} catch (SQLException e) {

			e.printStackTrace();

		} 
		}

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    
    private void btnVoltaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaLoginActionPerformed
        // TODO add your handling code here:
      
    	cadastroBD();
    	
    	if(check > 0) {
    		
    		CadastroConcluido cadastroCon = new CadastroConcluido();
    		cadastroCon.setVisible(true);
    		
    	}else {
    		
    		CadastroIndeferido cadastroIn = new CadastroIndeferido();
    		cadastroIn.setVisible(true);
    		
    		
    	}
    	
    }//GEN-LAST:event_btnVoltaLoginActionPerformed

    private void verSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verSenhaMousePressed
        naoVerSenha.setVisible(true);
        verSenha.setVisible(false);
        pwdSenha.setEchoChar((char)0);
    }//GEN-LAST:event_verSenhaMousePressed

    private void naoVerSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naoVerSenhaMousePressed
        verSenha.setVisible(true);
        naoVerSenha.setVisible(false);
        pwdSenha.setEchoChar('*');
    }//GEN-LAST:event_naoVerSenhaMousePressed

    private void verSenhaConfirmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verSenhaConfirmaMousePressed
        naoVerSenhaConfirma.setVisible(true);
        verSenhaConfirma.setVisible(false);
        pwdSenhaConfima.setEchoChar((char)0);
    }//GEN-LAST:event_verSenhaConfirmaMousePressed

    private void naoVerSenhaConfirmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naoVerSenhaConfirmaMousePressed
        verSenhaConfirma.setVisible(true);
        naoVerSenhaConfirma.setVisible(false);
        pwdSenhaConfima.setEchoChar('*');
    }//GEN-LAST:event_naoVerSenhaConfirmaMousePressed

    private void BoxGrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxGrauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxGrauActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxGrau;
    private javax.swing.JButton btnVoltaLogin;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel naoVerSenha;
    private javax.swing.JLabel naoVerSenhaConfirma;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JPasswordField pwdSenhaConfima;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JLabel verSenha;
    private javax.swing.JLabel verSenhaConfirma;
    // End of variables declaration//GEN-END:variables
}