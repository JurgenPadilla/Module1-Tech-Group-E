import java.util.List;


class Quiz {

    List<SelectedQuiz> selectedQuizs;
    private String ask;
    private String sigla;

    public Quiz(List<SelectedQuiz> selectedQuizs,
                String ask, String sigla) {
        this.selectedQuizs = selectedQuizs;
        this.ask = ask;
        this.sigla = sigla;
    }

    public List<SelectedQuiz> getSelectedQuizs() {
        return selectedQuizs;
    }

    public void setSelectedQuizs(List<SelectedQuiz> selectedQuizs) {
        this.selectedQuizs = selectedQuizs;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}

