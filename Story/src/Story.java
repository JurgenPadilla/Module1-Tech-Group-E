public class Story {
    private String title;
    private Genres genres;
    private String description;

    public Story(String title, Genres genres) {
        this.title = title;
        this.genres = genres;
    }

    public Story(String title) {
        this.title = title;
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
