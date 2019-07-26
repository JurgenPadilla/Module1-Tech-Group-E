import java.util.List;


class Quiz {

    private List<IQuestion> iQuestions;
    private TypeQuiz typeQuiz;
//    private String ageRange;

    public Quiz(List<IQuestion> iQuestions, TypeQuiz typeQuiz) {
        this.iQuestions = iQuestions;
        this.typeQuiz = typeQuiz;
    }
}

