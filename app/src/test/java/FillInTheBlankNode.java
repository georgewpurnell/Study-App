/**
 * Created by georgewpurnell on 4/1/17.
 */

class FillInTheBlankNode {


    String question;
    String answer;


    private  void fillInTheBlank(String newQuestion, String newAnswer){
        question = newQuestion;
        answer = newAnswer;

    }

    private void commitToRepository(String newQuestion, String newAnswer){

    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
