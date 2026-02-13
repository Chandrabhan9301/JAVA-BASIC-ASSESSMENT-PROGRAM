package Assignment6;

class Question{
    int queNo;
    String question;
    String optionA, optionB, optionC, optionD, answer;
    

    void setQuestion(int no, String que, String optA, String optB, String optC, String optD, String ans){
        queNo = no;

        question = que;

        optionA = optA;
        optionB = optB;
        optionC = optC;
        optionD = optD;

        answer = ans;
    }
    void displayQuestion(){
        System.out.println(queNo+"."+question);
        System.out.println("A. "+optionA);
        System.out.println("B. "+optionB);
        System.out.println("C. "+optionC);
        System.out.println("D. "+optionD);

        System.out.println("Answer = "+answer);
    }
    
    

}

public class RepresentQuestion {
    public static void main(){
        Question obj = new Question();

        obj.setQuestion(1,"How many Days are in week ?",
                                 "8 Days", "15 Days", "7 Days",
                                  "10 Days", "7 Days");
        obj.displayQuestion();
    }
}
