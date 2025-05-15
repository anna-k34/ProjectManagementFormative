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
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }
    
    public String getAnswer1() {
        return answer1;
    }
    
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
    
    public String getAnswer2() {
        return answer2;
    }
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }
    
    public String getAnswer3() {
        return answer3;
    }
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }
    
    public String getAnswer4() {
        return answer4;
    }
    
    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }
    
    public String getCorrectAns() {
        return correctAns;
    }
    
    public boolean check(String answer) {
        return answer.equalsIgnoreCase(correctAns);
    }
    
    public QuizQuestion clone() {
        QuizQuestion q = new QuizQuestion(question, answer1, answer2, answer3, answer4, correctAns);
        return q;
    }
    
    public boolean equals(QuizQuestion q) {
        return (q.question.equalsIgnoreCase(question) && q.answer1.equalsIgnoreCase(answer1) && q.answer2.equalsIgnoreCase(answer2) && q.answer3.equalsIgnoreCase(answer3) && q.answer4.equalsIgnoreCase(answer4) && q.correctAns.equalsIgnoreCase(correctAns));
            
    }
    
    public String toString() {
        return "Question: " + question + "\n\na. " + answer1 + "\nb. " + answer2 + "\nc. " + answer3 + "\nd. " + answer4;
    }
    
}
