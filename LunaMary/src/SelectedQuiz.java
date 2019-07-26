import java.util.List;


class SelectedQuiz implements IQuestion {
    private String title;
    private List<Option> optionList;

    public SelectedQuiz(String title, List<Option> optionList) {
        this.title = title;
        this.optionList=optionList;
    }

}

