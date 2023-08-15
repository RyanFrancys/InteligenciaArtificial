import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;



public class JogoDos8 implements ActionListener{
    private JFrame windown = new JFrame("Jogo dos 8");
    public JButton bt1 = new JButton("1");
    public JButton bt2 = new JButton("2");
    public JButton bt3 = new JButton("3");
    public JButton bt4 = new JButton("");
    public JButton bt5 = new JButton("5");
    public JButton bt6 = new JButton("6");
    public JButton bt7 = new JButton("7");
    public JButton bt8 = new JButton("8"); 
    public JButton bt9 = new JButton("9");
    
    private Container container;
    private String aux;
    public JogoDos8(){
        container = windown.getContentPane();
        windown.setSize(500, 500);
        windown.setVisible(true);
        windown.setLocationRelativeTo(null);
        windown.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bt1.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt1.setHorizontalAlignment(SwingConstants.CENTER);
        bt2.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt2.setHorizontalAlignment(SwingConstants.CENTER);
        bt3.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt3.setHorizontalAlignment(SwingConstants.CENTER);
        bt4.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt4.setHorizontalAlignment(SwingConstants.CENTER);
        bt5.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt5.setHorizontalAlignment(SwingConstants.CENTER);
        bt6.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt6.setHorizontalAlignment(SwingConstants.CENTER);
        bt7.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt7.setHorizontalAlignment(SwingConstants.CENTER);
        bt8.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt8.setHorizontalAlignment(SwingConstants.CENTER);
        bt9.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            bt9.setHorizontalAlignment(SwingConstants.CENTER);
        
        container.setLayout(new GridLayout(3,3));
        container.add(bt1);
        container.add(bt2);
        container.add(bt3);
        container.add(bt4);
        container.add(bt5);
        container.add(bt6);
        container.add(bt7);
        container.add(bt8);
        container.add(bt9);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
    }
    private void Troca(JButton b1,JButton b2){
        aux=b1.getText();
        b1.setText(b2.getText());
        b2.setText(aux);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt1){
            if(bt2.getText()==""){
                Troca(bt2, bt1);
            }else if(bt4.getText()==""){
                Troca(bt4, bt1);
            }
        }
        if(e.getSource() == bt2){
            if(bt1.getText()==""){
                Troca(bt1, bt2);
            }else if(bt3.getText()==""){
                Troca(bt3, bt2);
            }else if(bt5.getText()==""){
                Troca(bt5, bt2);
            }
        }
        if(e.getSource() == bt3){
            if(bt2.getText()==""){
                Troca(bt2, bt3);
            }else if(bt6.getText()==""){
                Troca(bt6, bt3);
            }
        }
        if(e.getSource() == bt4){
            if(bt1.getText()==""){
                Troca(bt1, bt4);
            }else if(bt5.getText()==""){
                Troca(bt5, bt4);
            }else if(bt7.getText()==""){
                Troca(bt7, bt4);
            }
        }
        if(e.getSource() == bt5){
            if(bt2.getText()==""){
                Troca(bt2, bt5);
            }else if(bt4.getText()==""){
                Troca(bt4, bt5);
            }else if(bt6.getText()==""){
                Troca(bt6, bt5);
            }else if(bt8.getText()==""){
                Troca(bt8, bt5);
            }
        }
        if(e.getSource() == bt6){
            if(bt3.getText()==""){
                Troca(bt3, bt6);
            }else if(bt5.getText()==""){
                Troca(bt5, bt6);
            }else if(bt9.getText()==""){
                Troca(bt9, bt6);
            }
        }
        if(e.getSource() == bt7){
            if(bt4.getText()==""){
                Troca(bt4, bt7);
            }else if(bt8.getText()==""){
                Troca(bt8, bt7);
            }
        }
        if(e.getSource() == bt8){
            if(bt5.getText()==""){
                Troca(bt5, bt8);
            }else if(bt7.getText()==""){
                Troca(bt7, bt8);
            }else if(bt9.getText()==""){
                Troca(bt9, bt8);
            }
        }
        if(e.getSource() == bt9){
            if(bt6.getText()==""){
                Troca(bt6, bt9);
            }else if(bt8.getText()==""){
                Troca(bt8, bt9);
            }
        }

        
    }
}