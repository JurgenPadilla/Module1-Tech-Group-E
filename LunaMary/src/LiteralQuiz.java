class LiteralQuiz implements IQuestion {
    private String title;

    public LiteralQuiz(String title) {
        this.title = title;

    }

    public void answer(String resp) {

    }

    public String display() {
        return "";
    }

    public Integer evaluate() {
        return 1;
    }

    @Override
    public void saveAnswer(String resp) {

    }

}

