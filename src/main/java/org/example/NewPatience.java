package org.example;

import javax.swing.*;
import java.awt.*;

public class NewPatience {
    public NewPatience(){

        JFrame newFrame = new JFrame();
        newFrame.setSize(750,500);
        newFrame.setTitle("Add New Patience");
        newFrame.setResizable(false);
        newFrame.setIconImage(new ImageIcon("src/main/java/org/example/icon.png").getImage());

        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);


        JLabel FirstNameLabel = new JLabel("Patient's First Name: ");
        JTextField FirstNameTextField = new JTextField(15);

        JLabel MiddleNameLabel = new JLabel("Patient's Middle Name: ");
        JTextField MiddleNameTextField = new JTextField(15);

        JLabel LastNameLabel = new JLabel("Patient's Last Name: ");
        JTextField LastNameTextField = new JTextField(15);

        JLabel SuffixLabel = new JLabel("Suffix: ");
        JTextField SuffixTextField = new JTextField(6);

        JLabel DOBLable = new JLabel("DOB: ");
        JTextField DOBTextField = new JFormattedTextField("MM/DD/YYYY");

        JLabel GenderLabel = new JLabel("Gender: ");
        JCheckBox MaleBox = new JCheckBox("Male");
        JCheckBox FemaleBox = new JCheckBox("Female");

        JLabel AddressLabel1 = new JLabel("Patient's Address: ");
        JTextField AddressTextField = new JTextField(30);
        JLabel AddressLabel2 = new JLabel("Street Address2 (Optional): ");
        JTextField Address2TextField = new JTextField(30);

        JLabel CityLabel = new JLabel("City: ");
        JTextField CityTextField = new JTextField(25);

        JLabel StateLabel = new JLabel("State: ");
        JTextField StateTextField = new JTextField(4);

        JLabel ZipLabel = new JLabel("Zip: ");
        JTextField ZipTextField = new JTextField(6);

        JLabel PhoneNumberLabel = new JLabel("Patient's Phone Number: ");
        JTextField PhoneNumberTextField = new JTextField(20);

        JLabel AllergiesLable = new JLabel("Patient's Allergies: ");
        JTextField AllergiesTextField = new JTextField(30);

        JLabel MedicationNameLabel = new JLabel("Medicines Name: ");
        JTextField MedicationNameTextField = new JTextField(15);

        JLabel MedicationReasonsLabel = new JLabel("Medicines Reason Of Taking:");
        JTextField MedicationReasonsTextField = new JTextField(15);

        JLabel MedicationFrequencyLabel = new JLabel("Times of taking: ");
        JTextField MedicationFrequencyTextField = new JTextField(15);

        JLabel PhysicianNameLable  = new JLabel("Physician's Name: ");
        JTextField PhysicianNameTextField = new JTextField(30);

        JLabel PhysicianPhoneNumberLable  = new JLabel("Physician's Phone Number: ");
        JTextField PhysicianPhoneNumberTextField = new JTextField(20);

        JLabel DateCreatingLable = new JLabel("Date of Creating This Form: ");
        JTextField DateCreatingTextField = new JFormattedTextField("MM/DD/YYYY");





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
        panel.add(DateCreatingLable);
        panel.add(DateCreatingTextField);

        newFrame.getContentPane().add(panel);
        newFrame.setVisible(true);

    }
}
