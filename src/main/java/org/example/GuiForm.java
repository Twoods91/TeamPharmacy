package org.example;



import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
                NewPatient MyNewPatient = new NewPatient();
            }
        });


     //   recordsButton.addActionListener(new ActionListener() {
       //     @Override
         //   public void actionPerformed(ActionEvent e) {

        //    }
       // });


        inStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final Object[][] rowData = {
                        {"", "",""},
                        {"", "",""},
                        {"", "",""},
                        {"", "",""},
                        {"", "",""},
                        {"", "",""},
                        {"", "",""},
                        {"", "",""},
                        {"", "",""}
                };

                Object[] columnNames = {"ID", "MEDICATION","QUANTITY"};

                final JTable table;
                final DefaultTableModel model;
                model = new DefaultTableModel(rowData, columnNames);
                table = new JTable();
                table.setModel(model);


                JButton add = new JButton("Add");
                JButton remove = new JButton("Remove");
                JButton CloseButton = new JButton("Close");


                add.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        model.addRow(rowData[0]);
                    }
                });
                remove.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {

                        int[] rows = table.getSelectedRows();
                        for(int i=0; i < rows.length; i++){
                            model.removeRow(rows[i]- i);
                        }
                    }
                });

                final JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Container c = f.getContentPane();
                c.setLayout(new BorderLayout());

                CloseButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    f.dispose();
                    }
                });

                JPanel subPanel = new JPanel();
                subPanel.add(add);
                subPanel.add(remove);
                subPanel.add(CloseButton);

                c.add(subPanel, BorderLayout.SOUTH);
                c.add(subPanel, BorderLayout.SOUTH);
                c.add(new JScrollPane(table), BorderLayout.CENTER);

                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);

            }
        });
    }
}

