public class Book extends Story {
    private Author author;
    private String publishing;
    private TypeBook type;
    private String lenguage;

    public Book(String title, Genres genres, Author author, String lenguage){
        super(title,genres);
        this.author = author;
        this.lenguage = lenguage;
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
        return "Book [author=\" + author + \", type=\" + type + \", lenguage=\" + lenguage + \"]";
    }

    public void playBook() {
    }

    public String display(){
        String result = "Book ";
        result += getTitle() + "\n";
        result += "and has a language: " + getLenguage();
        return  result;
    }

}
