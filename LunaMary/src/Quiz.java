import java.util.List;


class Quiz {


    private List<IQuestion> iQuestions;
    private TypeQuiz typeQuiz;

    private Integer ageRange;

    public Quiz() {
        this.iQuestions = null;
        this.typeQuiz = null;
    }

    public Quiz(List<IQuestion> iQuestions, Integer ageRange) {
        this.iQuestions = iQuestions;
        this.ageRange = ageRange;
    }

    public void setiQuestions(List<IQuestion> iQuestions) {
        this.iQuestions = iQuestions;
    }

    public TypeQuiz getTypeQuiz() {
        return typeQuiz;
    }

    public void setTypeQuiz(TypeQuiz typeQuiz) {
        this.typeQuiz = typeQuiz;
    }

    public Integer getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(Integer ageRange) {
        this.ageRange = ageRange;
    }

    public List<IQuestion> getiQuestions() {
        return iQuestions;
    }


}

