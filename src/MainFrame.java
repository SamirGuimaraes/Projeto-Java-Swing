import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Arial", Font.BOLD, 18);
    JTextField tfNome, tfSobrenome, tfProfissao, tfIdade;
    JLabel lbMensagemFinal, lbTitulo;

    public MainFrame() {
        // Configuração do rótulo "Nome"
        JLabel lbNome = new JLabel("Nome");
        lbNome.setFont(mainFont);

        // Configuração do campo de texto "Nome"
        tfNome = new JTextField(15);
        tfNome.setFont(mainFont);

        // Configuração do rótulo "Sobrenome"
        JLabel lbSobrenome = new JLabel("Sobrenome");
        lbSobrenome.setFont(mainFont);

        // Configuração do campo de texto "Sobrenome"
        tfSobrenome = new JTextField(15);
        tfSobrenome.setFont(mainFont);

        // Configuração do rótulo "Profissão"
        JLabel lbProfissao = new JLabel("Profissão");
        lbProfissao.setFont(mainFont);

        // Configuração do campo de texto "Profissão"
        tfProfissao = new JTextField(15);
        tfProfissao.setFont(mainFont);

        // Configuração do rótulo "Idade"
        JLabel lbIdade = new JLabel("Idade");
        lbIdade.setFont(mainFont);

        // Configuração do campo de texto "Idade"
        tfIdade = new JTextField(15);
        tfIdade.setFont(mainFont);

        // Painéis para agrupar os campos de entrada
        JPanel nomePanel = new JPanel();
        nomePanel.add(lbNome);
        nomePanel.add(tfNome);

        JPanel sobrenomePanel = new JPanel();
        sobrenomePanel.add(lbSobrenome);
        sobrenomePanel.add(tfSobrenome);

        JPanel profissaoPanel = new JPanel();
        profissaoPanel.add(lbProfissao);
        profissaoPanel.add(tfProfissao);

        JPanel idadePanel = new JPanel();
        idadePanel.add(lbIdade);
        idadePanel.add(tfIdade);

        // Título do formulário
        lbTitulo = new JLabel("Insira Suas Informações", SwingConstants.CENTER);
        lbTitulo.setFont(mainFont);

        // Painel do formulário com layout em grade
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 1, 5, 10));
        formPanel.add(lbTitulo);
        formPanel.add(nomePanel);
        formPanel.add(sobrenomePanel);
        formPanel.add(profissaoPanel);
        formPanel.add(idadePanel);

        // Mensagem final
        lbMensagemFinal = new JLabel();
        lbMensagemFinal.setFont(mainFont);

        // Botão "OK"
        JButton btOK = new JButton("OK");
        btOK.setFont(mainFont);
        btOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfNome.getText();
                String sobrenome = tfSobrenome.getText();
                String profissao = tfProfissao.getText();
                String idade = tfIdade.getText();
                int idadeInt = Integer.valueOf(idade);
                lbMensagemFinal.setText("<html>Inscrição Realizada com sucesso<br>Nome: " + nome + "<br>Sobrenome: " + sobrenome + "<br>Profissão: " + profissao + "<br>Idade:" + idadeInt +"</html>");
            }
        });

        // Botão "Limpar"
        JButton btLimpar = new JButton("Limpar");
        btLimpar.setFont(mainFont);
        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNome.setText("");
                tfSobrenome.setText("");
                tfProfissao.setText("");
                lbMensagemFinal.setText("");
            }
        });

        // Painel dos botões
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btOK);
        buttonsPanel.add(btLimpar);

        // Painel principal
        JPanel mainPainel = new JPanel();
        mainPainel.setLayout(new BorderLayout());
        mainPainel.setBackground(new Color(211, 211, 211));
        mainPainel.add(formPanel, BorderLayout.NORTH);
        mainPainel.add(lbMensagemFinal, BorderLayout.CENTER);
        mainPainel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPainel);

        // Configuração da janela
        setTitle("Cadastro");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setMaximumSize(new Dimension(700, 800));
        setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MainFrame(); // Exibe a interface gráfica
    }
}
