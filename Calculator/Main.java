package calculatorproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {
    Container con;
    JTextField tf;
    Cursor cursor,cursor1;
    Font font;
    JPanel panel1,panel2;
    GridLayout gbl,gbl1;
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,clear;
    static double value1=0,value2=0,result=0;
    int choice;
    ImageIcon img;
    Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(200, 200, 440, 420);
        this.setTitle("Calculator");
        this.setResizable(false);
        con=this.getContentPane();
        
        cursor=new Cursor(Cursor.DEFAULT_CURSOR);
        cursor1=new Cursor(Cursor.HAND_CURSOR);
        font=new Font("Arial",Font.BOLD,25);
        
        img=new ImageIcon(getClass().getResource("L22.png"));
        
        this.setIconImage(img.getImage());
        
        tf=new JTextField();
        tf.setBounds(95, 5, 335, 60);
        tf.setBackground(Color.GRAY);
        tf.setCursor(cursor);
        tf.setFont(font);
        con.add(tf);
        
        clear=new JButton("CLR");
        
        bt1=new JButton("9");
        bt2=new JButton("8");
        bt3=new JButton("7");
        bt4=new JButton("6");
        bt5=new JButton("5");
        bt6=new JButton("4");
        bt7=new JButton("3");
        bt8=new JButton("2");
        bt9=new JButton("1");
        bt10=new JButton("0");
        bt11=new JButton(".");
        bt12=new JButton("=");
        bt13=new JButton("/");
        bt14=new JButton("*");
        bt15=new JButton("-");
        bt16=new JButton("+");
        
        bt1.setFont(font);
        bt2.setFont(font);
        bt3.setFont(font);
        bt4.setFont(font);
        bt5.setFont(font);
        bt6.setFont(font);
        bt7.setFont(font);
        bt8.setFont(font);
        bt9.setFont(font);
        bt10.setFont(font);
        bt11.setFont(font);
        bt12.setFont(font);
        bt13.setFont(font);
        bt14.setFont(font);
        bt15.setFont(font);
        bt16.setFont(font);
        clear.setFont(font);
        
        bt1.setCursor(cursor1);
        bt2.setCursor(cursor1);
        bt3.setCursor(cursor1);
        bt4.setCursor(cursor1);
        bt5.setCursor(cursor1);
        bt6.setCursor(cursor1);
        bt7.setCursor(cursor1);
        bt8.setCursor(cursor1);
        bt9.setCursor(cursor1);
        bt10.setCursor(cursor1);
        bt11.setCursor(cursor1);
        bt12.setCursor(cursor1);
        clear.setCursor(cursor1);
        clear.setBounds(5, 5, 90, 60);
        con.add(clear);
        
        gbl=new GridLayout(3,2,5,5);
        gbl1=new GridLayout(4,0,5,5);
        
        panel1=new JPanel();
        panel1.setBounds( 5, 80, 310, 300);
        panel1.setBackground(Color.GRAY);
        panel1.setLayout(gbl);
        con.add(panel1);
        
        panel1.add(bt1);
        panel1.add(bt2);
        panel1.add(bt2);
        panel1.add(bt3);
        panel1.add(bt4);
        panel1.add(bt5);
        panel1.add(bt6);
        panel1.add(bt7);
        panel1.add(bt8);
        panel1.add(bt9);
        panel1.add(bt10);
        panel1.add(bt11);
        panel1.add(bt12);
        
        panel2=new JPanel();
        panel2.setBounds( 330, 80, 100, 300);
        panel2.setBackground(Color.GRAY);
        panel2.setLayout(gbl1);
        panel2.setFont(font);
        panel2.setCursor(cursor1);
        con.add(panel2);
        
        panel2.add(bt13);
        panel2.add(bt14);
        panel2.add(bt15);
        panel2.add(bt16);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt15.addActionListener(this);
        bt16.addActionListener(this);
        clear.addActionListener(this);
        
        
    }
    
    public static void main(String[] args) {
        Main main=new Main();
        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
          if(ae.getSource() == bt1){
              tf.setText(tf.getText().concat("9"));
          }
          if(ae.getSource() == bt2){
              tf.setText(tf.getText().concat("8"));
          }
          if(ae.getSource() == bt3){
              tf.setText(tf.getText().concat("7"));
          }
          if(ae.getSource() == bt4){
              tf.setText(tf.getText().concat("6"));
          }
          if(ae.getSource() == bt5){
              tf.setText(tf.getText().concat("5"));
          }
          if(ae.getSource() == bt6){
              tf.setText(tf.getText().concat("4"));
          }
          if(ae.getSource() == bt7){
              tf.setText(tf.getText().concat("3"));
          }
          if(ae.getSource() == bt8){
              tf.setText(tf.getText().concat("2"));
          }
          if(ae.getSource() == bt9){
              tf.setText(tf.getText().concat("1"));
          }
          if(ae.getSource() == bt10){
              tf.setText(tf.getText().concat("0"));
          }
          if(ae.getSource() == bt11){
              tf.setText(tf.getText().concat("."));
          }
          if(ae.getSource() == bt13){
              value1=Double.parseDouble(tf.getText());
              tf.setText("");
              choice=1;
          }
          if(ae.getSource() == bt14){
              value1=Double.parseDouble(tf.getText());
              tf.setText("");
              choice=2;
          }
          if(ae.getSource() == bt15){
              value1=Double.parseDouble(tf.getText());
              tf.setText("");
              choice=3;
          }
          if(ae.getSource() == bt16){
              value1=Double.parseDouble(tf.getText());
              tf.setText("");
              choice=4;
          }
          if(ae.getSource() == bt12){
              value2=Double.parseDouble(tf.getText());
              switch(choice){
                  
                  case 1:
                      result=value1/value2;
                      tf.setText(""+result);
                      break;
                  case 2:
                      result=value1*value2;
                      tf.setText(""+result);
                      break;
                  case 3:
                      result=value1-value2;
                      tf.setText(""+result);
                      break;
                  case 4:
                      result=value1+value2;
                      tf.setText(""+result);
                      break;
                  default:
                      result=0;
                      tf.setText(""+result);
              }
          }
           if(ae.getSource() == clear){
              tf.setText("");
          }
    }
    
}
