package org.example;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Records {
    public Records () {

        final JFrame newFrame = new JFrame();
        newFrame.setSize(750, 500);
        newFrame.setTitle("Records");
        newFrame.setIconImage(new ImageIcon("src/main/java/org/example/icon.png").getImage());
        newFrame.setResizable(false);

        final JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);



        newFrame.getContentPane().add(panel);
        newFrame.setVisible(true);


    }
}
