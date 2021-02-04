package org.example;

import javax.swing.*;

/**
 * PSM
 *
 */
public class PharmacyStoreManagement
{
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            GuiForm GUI = new GuiForm();
            GUI.setVisible(true);
        }
    }

