/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagementformative;

/**
 *
 * @author lauragarcia
 */
public class QuizQuestion {
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAns;
    
    public QuizQuestion(String question) {
        this.question = question;
        answer1 = null;
        answer2 = null;
        answer3 = null;
        answer4 = null;
        
    }
    
    public QuizQuestion(String question, String answer1,String answer2, String answer3, String answer4, String correctAns) {
        this(question);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAns = correctAns;
        
    }
    
    
}
