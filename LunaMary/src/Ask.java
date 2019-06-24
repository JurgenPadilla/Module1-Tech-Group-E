import java.util.List;
import java.util.Scanner;


class Ask {

    List<OptionAsk> optionAsks;
    private String ask;
    private String sigla;

    public Ask(List<OptionAsk> optionAsks,
               String ask, String sigla) {
        this.optionAsks = optionAsks;
        this.ask = ask;
        this.sigla = sigla;
    }

    public List<OptionAsk> getOptionAsks() {
        return optionAsks;
    }

    public void setOptionAsks(List<OptionAsk> optionAsks) {
        this.optionAsks = optionAsks;
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

