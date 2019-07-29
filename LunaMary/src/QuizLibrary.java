import java.util.List;

public class QuizLibrary {


    private List<Quiz> quizList;
    private List<AnswerPerson> answerPeople;
    private String type;

    public QuizLibrary(List<Quiz> quizList, List<AnswerPerson> answerPeople, String type) {
        this.quizList = quizList;
        this.answerPeople = answerPeople;
        this.type = type;
    }

    public QuizLibrary() {
        this.quizList = null;
    }

    public List<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(List<Quiz> quizList) {
        this.quizList = quizList;
    }

    public List<AnswerPerson> getAnswerPeople() {
        return answerPeople;
    }

    public void setAnswerPeople(List<AnswerPerson> answerPeople) {
        this.answerPeople = answerPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
