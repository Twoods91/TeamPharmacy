package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm extends JFrame{

    public loginForm(){
        final JFrame frame = new JFrame();
        frame.setSize(750, 500);
        frame.setTitle("Login");
        frame.setIconImage(new ImageIcon("src/main/java/org/example/icon.png").getImage());
        frame.setResizable(false);


        final JLabel label = new JLabel("PHARMACY STORE MANAGEMENT");
        label.setForeground(Color.BLUE);
        label.setFont(new Font("",Font.BOLD,25));
        label.setBounds(100,20,500,75);


        final  JLabel userid  = new JLabel("UserID:  ");
        userid.setBounds(100,100,80,25);
        userid.setFont(new Font("",Font.BOLD,15));
       final JTextField useridTextField = new JTextField(25);
       useridTextField.setBounds(200,100,165,20);


        final  JLabel password = new JLabel("Password: ");
        password.setBounds(100,150,80,25);
        password.setFont(new Font("",Font.BOLD,15));
        final JPasswordField passwordField = new JPasswordField(25);
       passwordField.setBounds(200,150,165,25);

        JButton loginBttn = new JButton("Login");
        loginBttn.setForeground(Color.black);
        loginBttn.setFont(new Font("",Font.BOLD,15));
        loginBttn.setBounds(250,250,80,25);

        loginBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = useridTextField.getText();
                String pass = passwordField.getText();
                String userHint = "user1";
                String passHint = "fake123";
                if(user.equals(userHint)&&pass.equals(passHint)) {
                    GuiForm GUI = new GuiForm();
                    GUI.setVisible(true);
                    System.out.println("button clicked");
                    JOptionPane.showMessageDialog(GUI, "Welcome to Pharmacy Store Management!");
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Please enter valid user id and valid password!");
                }
            }


        } );

        frame.add(label);
        frame.add(userid);
        frame.add(useridTextField);
        frame.add(password);
        frame.add(passwordField);
        frame.setBackground(Color.PINK);
        frame.add(loginBttn);


        frame.setLayout(null);
        frame.setVisible(true);
    }
}
