package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiForm extends JFrame {
    private JPanel RootPanel;
    private JButton newPatientButton;
    private JButton inStockButton;
    private JButton prescriptionFormButton;
    private JButton recordsButton;
    private JButton exitButton;


    public GuiForm() {

        add(RootPanel);
        setTitle("Pharmacy Store Management");
        setSize(640, 480);
        setResizable(false); //make the frame not resizable
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        
        newPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newFrame = new JFrame();
                newFrame.setSize(750,500);
                newFrame.setResizable(false);

                JPanel panel = new JPanel();
                panel.setBackground(Color.lightGray);

                JLabel NameLabel = new JLabel("Patient Name: ");
                JTextField NameTextField = new JTextField(15);

                JLabel AddressLabel = new JLabel("Patient Address: ");
                JTextField AddressTextField = new JTextField(15);

                JLabel PhoneNumberLabel = new JLabel("Patient Phone Number: ");
                JTextField PhoneNumberTextField = new JTextField(15);



                panel.add(NameLabel);
                panel.add(NameTextField);
                panel.add(AddressLabel);
                panel.add(AddressTextField);
                panel.add(PhoneNumberLabel);
                panel.add(PhoneNumberTextField);

                newFrame.getContentPane().add(panel);
                newFrame.setVisible(true);

            }
        });
    }

}


