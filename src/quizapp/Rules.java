
package quizapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {
    
    JButton b1, b2;
    String username;
    
    Rules(String username){
        this.username = username;
        setBounds(600, 200, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to Simple Minds");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
            "<html>"+ 
                "1. The test contains 10 questions" + "<br><br>" +
                "2. There is a time limit of 15 seconds" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. The test is not official, it's just a nice way to see how much you know, or don't know, about Java." + "<br><br>" +
                "5. The scoring will be percentage based" + "<br><br>" +
                "6. You will get 10 percentage for each correct answer." + "<br><br>" +
                "7. At the end of the Quiz, your total score will be displayed." + "<br><br>" +
                "8. Maximum score is 25 points. Good Luck" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new QuizApp().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quizzes(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
}
