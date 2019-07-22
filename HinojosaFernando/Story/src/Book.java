public class Book extends Story {
    private Integer codeBook;
    private Author author;
    private String publishing;
    private TypeBook type;
    private String lenguage;

    public void playBook() {
    }

    public Integer getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(Integer codeBook) {
        this.codeBook = codeBook;
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

    public TypeBook getType() {
        return type;
    }

    public void setType(TypeBook type) {
        this.type = type;
    }
}
