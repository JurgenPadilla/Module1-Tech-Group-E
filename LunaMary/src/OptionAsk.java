import java.util.Scanner;


class OptionAsk {
    private String option;
    private Integer point;
    private String sigla;
    private Boolean status;

    public OptionAsk(String option,
                     Integer point,
                     String sigla,
                     Boolean status) {

        this.option = option;
        this.point = point;
        this.sigla = sigla;
        this.status = status;
    }


    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}

