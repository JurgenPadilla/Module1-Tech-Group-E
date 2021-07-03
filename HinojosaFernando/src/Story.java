public abstract class Story {
    private String title;
    private Genres genres;

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

    public String toString() {
        return  "Title is='" + title + '\'' + "\n" +
                "Genre is=" + genres;
    }

    public Genres getGenres() {
        return genres;
    }

}
