public class Book extends Story {
    private Integer codeBook;
    private Author author;
    private String publishing;
    private TypeBook type;
    private String lenguage;

    public Book(String title, Genres genres, Author author, String lenguage){
        super(title,genres);
        this.author = author;
        this.lenguage = lenguage;
    }
    public Book(String title,String lenguage){
        super(title);
        this.lenguage = lenguage;
    }
    public void playBook() {
    }

    public Integer getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(Integer codeBook) {
        this.codeBook = codeBook;
    }

    public String display(){
        String result = "Book ";
        result += getTitle() + "\n";
        result += "and has a language: " + getLenguage();
        return  result;
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

    public String getLenguage() {
        return lenguage;
    }

    public String toString(){
        return "Book [codeBook=\" + codeBook + \", author=\" + author + \", publishing=\" + publishing + \", type=\" + type + \", lenguage=\" + lenguage + \"]";
    }
}
