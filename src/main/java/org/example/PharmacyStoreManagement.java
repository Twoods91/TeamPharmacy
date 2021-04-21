package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * PSM
 *
 */
public class PharmacyStoreManagement
{
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, SQLException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            GuiForm GUI = new GuiForm();
            GUI.setVisible(true);
        }
    }

