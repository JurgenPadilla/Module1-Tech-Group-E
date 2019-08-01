class Option {
    private String option;
    private Integer point;

    public Option(String option,
                  Integer point
    ) {

        this.option = option;
        this.point = point;

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


}

