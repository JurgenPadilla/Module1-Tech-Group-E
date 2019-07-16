public class Story {
    private String title;
    private Genres genres;
    private String description;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Genres getGenres() {
        return genres;
    }

    public String getDescription() {
        return description;
    }
}
