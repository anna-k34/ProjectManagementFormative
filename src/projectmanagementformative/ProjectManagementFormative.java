/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectmanagementformative;

import javax.swing.JOptionPane;

/**
 *
 * @author lauragarcia
 */
public class ProjectManagementFormative {

    public static String displayMenu() {
        String sOption = JOptionPane.showInputDialog("Homepage\n1. Take Quiz\n2. Review Notes\n3. Quit Program(q to exit)");
        return sOption;
    }

    public static boolean errorCheck(String sOption) {
        int option;

        try {
            if (sOption == null) {
                return true;
            }

            option = Integer.parseInt(sOption);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input! Try again", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public static void main(String[] args) {
        String sOption = "";
        int option = -1;
        boolean errorCheck = false;
        while (option != 3) {
            while (!errorCheck) {
                sOption = displayMenu();
                errorCheck = errorCheck(sOption);
            }
            
           if (sOption == null) {
                option = 3;
            } else {
                option = Integer.parseInt(sOption);
            
           }
           
           if (option == 1) {
               
           } else if (option == 2) {
               
           }
        }
    }

}
