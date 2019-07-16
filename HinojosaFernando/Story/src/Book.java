public class Book extends Story {
    private Integer codeBook;
    private Author author;
    private String publishing;
    private TypeBooks type;

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

    public TypeBooks getType() {
        return type;
    }

    public void setType(TypeBooks type) {
        this.type = type;
    }
}
