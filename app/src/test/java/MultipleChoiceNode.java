/**
 * Created by georgewpurnell on 4/1/17.
 */

class MultipleChoiceNode {
    String question;
    String[] answerList;

    private void multipleChoiceNode(String newQuestion, String... newAnswerList){
        question = newQuestion;
        answerList = newAnswerList;

    }

    private void commitToRepository(String newQuestion, String newAnswer){

    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswerList() {
        return answerList;
    }


}
