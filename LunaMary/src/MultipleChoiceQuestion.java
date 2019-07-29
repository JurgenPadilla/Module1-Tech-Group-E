import java.util.List;


class MultipleChoiceQuestion implements IQuestion {

    private String title;
    private List<Option> optionList;

    public MultipleChoiceQuestion(String title, List<Option> optionList) {
        this.title = title;
        this.optionList = optionList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }


    public void answer(String resp) {

    }

    public String display() {

        // P1 automatico
        String result = "P1. " + getTitle() + "\n";
        result += displayOptions(optionList);

        return result;
    }

    public String displayOptions(List<Option> optionList) {
        String result = "";
        for (Option op : optionList) {
            result += " " + op.getSigla() + ": " + op.getOption() + "\n";
        }

        return result;
    }

    public Integer evaluate() {
        return 1;
    }

    @Override
    public void saveAnswer(String resp) {
        int i = 0;
        while (i < optionList.size()) {
            if (resp.equalsIgnoreCase(optionList.get(i).getSigla().toString())) {
                optionList.get(i).setStatus(true);
                i = optionList.size();
            } else
                i++;
        }


    }
}

