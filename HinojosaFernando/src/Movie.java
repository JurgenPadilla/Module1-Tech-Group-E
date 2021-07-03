public class Movie extends Story {
    private String mainActor;
    private String mainActress;
    private Filmmaker person;
    private Integer year;
    private Integer duration;
    private String releaseDate;
    private Book baseOn;

    public Movie(String title, Genres genres,Filmmaker filmmaker, Book baseOn,String releaseDate){
        super(title,genres);
        this.person = filmmaker;
        this.baseOn = baseOn;
        this.releaseDate =releaseDate;

    }
    public Movie(String title, Genres genres, String releaseDate){
        super(title,genres);
        this.releaseDate =releaseDate;


    }
    public String toString() {
        return "Movie" + "\n" +
                super.toString() + "\n" +
                "The Filmmaker of this movie is=" + person + "\n" +
                "Release Date='" + releaseDate + '\'' + "\n" +
                "This movie was base on this book=" + baseOn + "\n";
    }

    public String getMainActor() {
        return mainActor;
    }

    public String getMainActress() {
        return mainActress;
    }

    public Filmmaker getPerson() {
        return person;
    }

    public void setPerson(Filmmaker person) {
        this.person = person;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Book getBaseOn() {
        return baseOn;
    }

    public void setBaseOn(Book baseOn) {
        this.baseOn = baseOn;
    }
}
