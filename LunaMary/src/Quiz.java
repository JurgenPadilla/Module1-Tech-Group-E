import java.util.List;


class Quiz {

    private List<IQuestion> iQuestions;
    private TypeQuiz typeQuiz;

    private Integer ageRange;

    public Quiz() {
        this.iQuestions = null;
        this.typeQuiz = null;
    }

    public Quiz(List<IQuestion> iQuestions, TypeQuiz typeQuiz, Integer ageRange) {
        this.iQuestions = iQuestions;
        this.typeQuiz = typeQuiz;
        this.ageRange = ageRange;
    }

    public List<IQuestion> getiQuestions() {
        return iQuestions;
    }

    public TypeQuiz getTypeQuiz() {
        return typeQuiz;
    }
}

