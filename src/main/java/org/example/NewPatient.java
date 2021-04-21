package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;




public class NewPatient {


    public NewPatient(){

        final JFrame f1 = new JFrame();
        f1.setSize(750,500);
        f1.setTitle("Add New Patient");
        f1.setResizable(false);
        f1.setIconImage(new ImageIcon("src/main/java/org/example/icon.png").getImage());
        final JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);


        final JLabel FirstNameLabel = new JLabel("Patient's First Name: ");
        final JTextField FirstNameTextField = new JTextField(15);

        final JLabel MiddleNameLabel = new JLabel("Patient's Middle Name: ");
        final JTextField MiddleNameTextField = new JTextField(15);

        final JLabel LastNameLabel = new JLabel("Patient's Last Name: ");
        final JTextField LastNameTextField = new JTextField(15);

        final JLabel SuffixLabel = new JLabel("Suffix: ");
        final JTextField SuffixTextField = new JTextField(6);

        final JLabel DOBLable = new JLabel("DOB: ");
        final JTextField DOBTextField = new JFormattedTextField("MM/DD/YYYY");

        final JLabel GenderLabel = new JLabel("Gender: ");
        final JRadioButton MaleBox = new JRadioButton("Male");
        final JRadioButton FemaleBox = new JRadioButton("Female");
        MaleBox.setActionCommand("MALE");
        FemaleBox.setActionCommand("FEMALE");
        final ButtonGroup group = new ButtonGroup();
        group.add(MaleBox);
        group.add(FemaleBox);


        final JLabel AddressLabel1 = new JLabel("Patient's Address: ");
        final JTextField AddressTextField = new JTextField(30);
        final JLabel AddressLabel2 = new JLabel("Street Address2 (Optional): ");
        final JTextField Address2TextField = new JTextField(30);

        final JLabel CityLabel = new JLabel("City: ");
        final JTextField CityTextField = new JTextField(25);

        final JLabel StateLabel = new JLabel("State: ");
        final JTextField StateTextField = new JTextField(4);

        final JLabel ZipLabel = new JLabel("Zip: ");
        final JTextField ZipTextField = new JTextField(6);

        final JLabel PhoneNumberLabel = new JLabel("Patient's Phone Number: ");
        final JTextField PhoneNumberTextField = new JTextField(20);

        final JLabel AllergiesLable = new JLabel("Patient's Allergies: ");
        final JTextField AllergiesTextField = new JTextField(30);

        final JLabel MedicationNameLabel = new JLabel("Medicines Name: ");
        final JTextField MedicationNameTextField = new JTextField(15);

        final JLabel MedicationReasonsLabel = new JLabel("Medicines Reason Of Taking:");
        final JTextField MedicationReasonsTextField = new JTextField(15);

        final JLabel MedicationFrequencyLabel = new JLabel("Times of taking: ");
        final JTextField MedicationFrequencyTextField = new JTextField(15);

        final JLabel PhysicianNameLable  = new JLabel("Physician's Name: ");
        final JTextField PhysicianNameTextField = new JTextField(30);

        final JLabel PhysicianPhoneNumberLable  = new JLabel("Physician's Phone Number: ");
        final JTextField PhysicianPhoneNumberTextField = new JTextField(20);


        panel.add(FirstNameLabel);
        panel.add(FirstNameTextField);
        panel.add(MiddleNameLabel);
        panel.add(MiddleNameTextField);
        panel.add(LastNameLabel);
        panel.add(LastNameTextField);
        panel.add(SuffixLabel);
        panel.add(SuffixTextField);
        panel.add(DOBLable);
        panel.add(DOBTextField);
        panel.add(GenderLabel);
        panel.add(MaleBox);
        panel.add(FemaleBox);
        panel.add(AddressLabel1);
        panel.add(AddressTextField);
        panel.add(AddressLabel2);
        panel.add(Address2TextField);
        panel.add(CityLabel);
        panel.add(CityTextField);
        panel.add(StateLabel);
        panel.add(StateTextField);
        panel.add(ZipLabel);
        panel.add(ZipTextField);
        panel.add(PhoneNumberLabel);
        panel.add(PhoneNumberTextField);
        panel.add(AllergiesLable);
        panel.add(AllergiesTextField);
        panel.add(MedicationNameLabel);
        panel.add(MedicationNameTextField);
        panel.add(MedicationFrequencyLabel);
        panel.add(MedicationFrequencyTextField);
        panel.add(MedicationReasonsLabel);
        panel.add(MedicationReasonsTextField);
        panel.add(PhysicianNameLable);
        panel.add(PhysicianNameTextField);
        panel.add(PhysicianPhoneNumberLable);
        panel.add(PhysicianPhoneNumberTextField);

        //** Creating buttons for 1st frame(f1).

        JButton AddToRecordButton = new JButton("Add to Records");
        panel.add(AddToRecordButton);
        JButton PrintButton = new JButton("Print Registration Form");
        panel.add(PrintButton);
        JButton ClearButton = new JButton("Reset Fields");
        panel.add(ClearButton);
        JButton F1_CloseButton = new JButton("Close");
        panel.add(F1_CloseButton);

        // ** (AddToRecordButton) action listener **

        AddToRecordButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                FileWriter fw = null;
                try {
                    fw = new FileWriter("C:\\Users\\Huda\\Desktop\\records\\record.txt");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                PrintWriter pw = new PrintWriter(fw);

                pw.println(FirstNameTextField.getText());
                pw.println(MiddleNameTextField.getText());
                pw.println(LastNameTextField.getText());
                pw.println(SuffixTextField.getText());
                pw.println(DOBTextField.getText());
                pw.println(group.getSelection().getActionCommand());
                pw.println(AddressTextField.getText());
                pw.println(Address2TextField.getText());
                pw.println(CityTextField.getText());
                pw.println(StateTextField.getText());
                pw.println(ZipTextField.getText());
                pw.println(PhoneNumberTextField.getText());
                pw.println(AllergiesTextField.getText());
                pw.println(MedicationNameTextField.getText());
                pw.println(MedicationFrequencyTextField.getText());
                pw.println(MedicationReasonsTextField.getText());
                pw.println(PhysicianNameTextField.getText());
                pw.println(PhysicianPhoneNumberTextField.getText());

                pw.close();
                JOptionPane.showMessageDialog(null,"Successfully added");
            }

        });

        // ** (PrintButton) action listener **

        PrintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Calendar cal = Calendar.getInstance();
                final JFrame f2 = new JFrame();
                f2.setTitle("Prescription Form");
                f2.setSize(850,750);
                f2.setResizable(false);
                f2.setIconImage(new ImageIcon("src/main/java/org/example/icon.png").getImage());
                f2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                final JTextArea a = new JTextArea();
                a.append("\t\t Prescription Form \n\n" +
                        "\n=========================================================\n" +
                        "First Name:\t\t\t" + FirstNameTextField.getText() + "\n\n" +
                        "Middle Name:\t\t\t" + MiddleNameTextField.getText() + "\n\n" +
                        "Last Name:\t\t\t" + LastNameTextField.getText() + "\n\n" +
                        "Suffix:\t\t\t" + SuffixTextField.getText() + "\n\n" +
                        "Date of Birth:\t\t\t" + DOBTextField.getText() + "\n\n" +
                        "Gender:\t\t\t\t" + group.getSelection().getActionCommand() + "\n\n" +

                        //*** Add other fields here... ***

                        "\n**********************************************************\n" +
                        "Current Date:\t\t\t\t" + dateFormat.format(cal.getTime()) + "\n\n");


                // ** (Internal print & exit buttons) action listener **

                JButton F2_print = new JButton("Print Form");
                JButton F2_CloseButton = new JButton("Close");
                F2_print.setBounds(100,600,95,25);
                F2_CloseButton.setBounds(300,600,95,25);
                f2.add(F2_print);
                f2.add(F2_CloseButton);

                F2_print.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            a.print(); }
                         catch (PrinterException printerException) {
                            Logger.getLogger(GuiForm.class.getName()).log(Level.SEVERE,null,printerException);
                        }

                    }
                });

                F2_CloseButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (JOptionPane.showConfirmDialog(f2, "Do you want to exit this window?", "Confirm",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                            f2.dispose();
                        }
                    }
                });

                f2.add(a);
                f2.setVisible(true);

            }
        });

        // **  (ClearButton) action listener **

        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstNameTextField.setText("");
                MiddleNameTextField.setText("");
                LastNameTextField.setText("");
                SuffixTextField.setText("");
                DOBTextField.setText("");
            }
        });

        // **  (F1_CloseButton) action listener **

        F1_CloseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(f1, "Do you want to exit this window?", "Confirm",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    f1.dispose();
                }
            }
        });


        f1.getContentPane().add(panel);
        f1.setVisible(true);
    }
}
