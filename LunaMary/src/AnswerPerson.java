public class AnswerPerson {
    private Quiz quiz;
    private Person person;
    private Integer nota = new Integer(0);

    public AnswerPerson(Quiz quiz, Person person) {
        this.quiz = quiz;
        this.person = person;
    }

    public AnswerPerson() {
        this.quiz = null;
        this.person = null;
    }


    public void saveNota(Integer nota) {
        this.nota = this.nota + nota;
    }

    public Integer getNota() {
        return nota;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
