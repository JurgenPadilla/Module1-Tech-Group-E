public class Filmmaker extends Person {
    private String notableWork;
    private String study;

    public Filmmaker(String name) {
        super(name);
    }

    public void setNotableWork(String notableWork) {
        this.notableWork = notableWork;
    }

    public void setStudy(String study) {
        this.study = study;
    }


    public String getStudy() {
        return study;
    }

    public String getNotableWork() {
        return notableWork;
    }


}
