package br.edu.ifpr.agenda.view;
import javax.swing.*;

public class gui {
    public static void main(String[] args) {
        // 1. Cria a janela (JFrame)
        JFrame frame = new JFrame("Minha Janela Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 2. Cria um componente (JButton)
        JButton botao = new JButton("ai ze da manga ");
        
        // 3. Adiciona o componente ao frame
        frame.getContentPane().add(botao); 
        // Em muitos casos simples, o layout padrão funciona.

        // 4. Tratamento de evento (o que acontece ao clicar)
        botao.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Botão Clicado!");
        });
        
        // 5. Define o tamanho e torna visível
        frame.pack(); // Ajusta o tamanho da janela para os componentes
        frame.setVisible(true);
    }
}