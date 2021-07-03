
public class Book extends Story {
    private Author author;
    private String publishing;
    private BookType type;
    private String language;

    public Book(String title, Genres genres, Author author, String language){
        super(title,genres);
        this.author = author;
        this.language = language;
    }

    public String toString() {
        return "Book" + "\n" +
                super.toString() + "\n" +
                "The author is=" + author + "\n" +
                "The publishing was='" + publishing + '\'' + "\n" +
                "The language is=" + language + "\n";
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public String getLenguage() {
        return language;
    }


}
