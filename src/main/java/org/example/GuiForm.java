package org.example;



import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class GuiForm extends JFrame {
    protected JPanel RootPanel;
    protected JButton newPatientButton;
    protected JButton inStockButton;
    protected JButton recordsButton;
    protected JButton exitButton;


    public GuiForm() {

        add(RootPanel);

        setTitle("Pharmacy Store Management");
        setSize(640, 480);
        setResizable(false); //make the frame not resizable
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/main/java/org/example/icon.png").getImage());


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        newPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewPatience MyNewPatience = new NewPatience();
            }
        });


        // prescriptionFormButton.addActionListener(new ActionListener() {
        //     @Override
        //      public void actionPerformed(ActionEvent e) {
        //        PrescriptionForm MyPrescriptionForm = new PrescriptionForm();


        //       }
        //  });


        //recordsButton.addActionListener(new ActionListener() {
        //  @Override
        //  public void actionPerformed(ActionEvent e) {
        //   Record MyRecord = new Record();

        //  }
        //  });

    }
}
