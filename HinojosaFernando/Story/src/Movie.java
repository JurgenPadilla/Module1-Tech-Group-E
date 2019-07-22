public class Movie extends Story {
    private String mainActor;
    private String mainActress;
    private Integer idMovie;
    private Filmmaker person;
    private Integer year;
    private Integer duration;
    private Person stars;
    private String releaseDate;
    private Book baseOn;

    public String getMainActor() {
        return mainActor;
    }

    public String getMainActress() {
        return mainActress;
    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
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

    public Person getStars() {
        return stars;
    }

    public void setStars(Person stars) {
        this.stars = stars;
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
