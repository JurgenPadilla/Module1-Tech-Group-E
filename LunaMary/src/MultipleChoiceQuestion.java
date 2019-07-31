import java.util.Map;


class MultipleChoiceQuestion implements IQuestion {

    private String title;
    private Map<String, Option> optionMap;

    public MultipleChoiceQuestion(String title, Map<String, Option> optionMap) {
        this.title = title;
        this.optionMap = optionMap;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, Option> getOptionMap() {
        return optionMap;
    }


    public void answer(String resp) {

    }

    public String display() {

        // P1 automatico
        String result = "P1. " + getTitle() + "\n";
        result += displayOptions(optionMap);

        return result;
    }

    public String displayOptions(Map<String, Option> optionMap) {
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

