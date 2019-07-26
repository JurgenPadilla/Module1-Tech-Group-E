class Option {
    private String option;
    private Integer point;
    private Sigla sigla;
    private Boolean status;

    public Option(String option,
                  Integer point,
                  Sigla sigla,
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

    public Sigla getSigla() {
        return sigla;
    }

    public void setSigla(Sigla sigla) {
        this.sigla = sigla;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}

