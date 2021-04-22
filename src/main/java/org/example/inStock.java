package org.example;
import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

public class inStock {
    public inStock(){
        final JFrame f = new JFrame();
        f.setTitle("In Stock");
        f.setResizable(false);
        f.setIconImage(new ImageIcon("src/main/java/org/example/icon.png").getImage());
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());

        final  JLabel idLable  = new JLabel("Medication_ID: ");
        final JTextField idTextField = new JTextField(15);
        final JLabel medNameLable  = new JLabel("Medication Name: ");
        final JTextField medNameTextField = new JTextField(20);
        final JLabel quantityLable  = new JLabel("Quantity: ");
        final JTextField quantityTextField = new JTextField(20);
        final JLabel searchLable  = new JLabel("Search");
        final JTextField searchTextField = new JTextField(20);

        final Object[][] rowData = {};
        final Object[] columnNames = {"ID", "MEDICATION","QUANTITY"};

        final JTable table;
        final DefaultTableModel model;
        model = new DefaultTableModel(rowData, columnNames){

            public boolean isCellEditable(int rowData, int columnNames){
                return false;
            }
        };
        table = new JTable();
        table.setModel(model);


        JButton add = new JButton("Add");
        JButton remove = new JButton("Remove");
        JButton update = new JButton("Update");
        JButton CloseButton = new JButton("Close");
        final JButton search = new JButton("Find");



        add.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
              if(idTextField.getText().equals("")||medNameTextField.getText().equals("")||quantityTextField.getText().equals("")){
                  JOptionPane.showMessageDialog(table,"Please enter all data!");
              }else {
                  String data[] = {idTextField.getText().toUpperCase(),medNameTextField.getText().toUpperCase(),quantityTextField.getText()};
                  model.addRow(data);
                  JOptionPane.showMessageDialog(table,"add data successfully!");
                  idTextField.setText("");
                  medNameTextField.setText("");
                  quantityTextField.setText("");
              }
               // model.addRow(rowData[0]);
            }
                });
        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
             int[] rows = table.getSelectedRows();
             for(int i=0; i < rows.length; i++){
                 model.removeRow(rows[i]- i);
             }
                JOptionPane.showMessageDialog(table,"Remove data Successfully!");
            }
        });
        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(table.getSelectedRowCount()==1){

                    String id = idTextField.getText().toUpperCase();
                    String medName = medNameTextField.getText().toUpperCase();
                    String qnty = quantityTextField.getText();

                    model.setValueAt(id,table.getSelectedRow(),0);
                    model.setValueAt(medName,table.getSelectedRow(),1);
                    model.setValueAt(qnty,table.getSelectedRow(),2);

                    JOptionPane.showMessageDialog(table,"Update successfully!");
                }else {
                    if(table.getSelectedRowCount()==0){
                        JOptionPane.showMessageDialog(table,"Table is Empty!");
                    }else{
                        JOptionPane.showMessageDialog(table,"Please select a row for update!");
                    }
                }
            }
        });
        searchTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String ser = searchTextField.getText().toUpperCase();
                TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
                table.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(ser));

            }

        });

        CloseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                    }
                });

                JPanel panel = new JPanel();
                JPanel subPanel = new JPanel();
                panel.add(idLable);
                panel.add(idTextField);
                panel.add(medNameLable);
                panel.add(medNameTextField);
                panel.add(quantityLable);
                panel.add(quantityTextField);
                subPanel.add(CloseButton);
                subPanel.add(add);
                subPanel.add(remove);
                subPanel.add(update);
                subPanel.add(searchLable);
                subPanel.add(searchTextField);




                c.add(panel, BorderLayout.NORTH);
                c.add(subPanel, BorderLayout.SOUTH);
                c.add(new JScrollPane(table), BorderLayout.CENTER);

                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);


        }
}
