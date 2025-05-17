/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectmanagementformative;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lauragarcia
 */
public class ProjectManagementFormative {

    public static String displayMenu(String prompt) {
        String sOption = JOptionPane.showInputDialog(prompt);
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

    public static void takeQuiz() {
        int count = 0;
        QuizQuestion questions[] = new QuizQuestion[6];
        String question;
        String answer1;
        String answer2;
        String answer3;
        String answer4;
        String correctAns;
        
        String testAns;

        try {
            File f = new File("src/projectmanagementformative/notes.txt");
            Scanner s = new Scanner(f);
            for (int i = 0; i < questions.length; i++) {

                question = s.nextLine();
                answer1 = s.nextLine();
                answer2 = s.nextLine();
                answer3 = s.nextLine();
                answer4 = s.nextLine();
                correctAns = s.nextLine();

                questions[i] = new QuizQuestion(question, answer1, answer2, answer3, answer4, correctAns);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        
        for (int i = 0; i < questions.length; i++) {
            testAns = displayMenu(questions[i].getQuestion());
            if (questions[i].check(testAns)) {
                count++;
            }
            
        }
    }

    public static void studyNotes() {
        Notes studyGuide[] = new Notes[2];
        String split[];
        String topic;
        String information = "";
        String informationSplit;

        try {
            File f = new File("src/projectmanagementformative/notes.txt");
            Scanner s = new Scanner(f);
            for (int i = 0; i < studyGuide.length; i++) {

                topic = s.nextLine();
                informationSplit = s.nextLine();
                split = informationSplit.split("-");
                for (int j = 0; j < split.length; j++) {
                    information += split[j] + "\n";
                }
                studyGuide[i] = new Notes(topic, information);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        boolean errorCheck = false;
        String sOption = "";
        while (!errorCheck) {
            sOption = displayMenu("Study Notes:\n1. Maintenance\n2. System Analysis\n3. Planning\n4. System Design\n5. Development\n6. Testing");
            errorCheck = errorCheck(sOption);
        }

        int option = Integer.parseInt(sOption);

        JOptionPane.showMessageDialog(null, studyGuide[option - 1]);
    }

    public static void main(String[] args) {
        String sOption = "";
        int option = -1;
        boolean errorCheck = false;
        while (option != 3) {
            while (!errorCheck) {
                sOption = displayMenu("Homepage\n1. Take Quiz\n2. Review Notes\n3. Quit Program");
                errorCheck = errorCheck(sOption);
            }

            if (sOption == null) {
                option = 3;
            } else {
                option = Integer.parseInt(sOption);

            }

            if (option == 1) {
                takeQuiz();
            } else if (option == 2) {
                studyNotes();
            } else if (option == 3) {
                JOptionPane.showMessageDialog(null, "Good Luck!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input! Try again", "Error", JOptionPane.ERROR_MESSAGE);
            }

            errorCheck = false;
        }
    }

}
