import java.lang.String;
public class Book extends Libreria {
    private String title;
    private String description;
    private String editorial;
    private int year;
    private Author fauthor;
    private int codeBook;
    private typeBook type;

    public String getTitle(){
        return title;
    }
    public void setTitle(String ftitle){
        this.title = ftitle;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription (String Descrip){
        this.description = Descrip;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String feditorial){
        this.editorial = feditorial;
    }
    public int getYear(){
        return year;
    }
    public void setYear (int x){
        this.year = x;
    }
    public Author getAuthor(){
        return fauthor;
    }
    public void setAuthor(Author gauthor){
        this.fauthor = gauthor;
    }
    public int getCodeBook(){
        return codeBook;
    }
    public void setCodeBook(int code){
        this.codeBook = code;
    }
    public typeBook getType() {
        return type;
    }
    public void setType(typeBook ty){
        this.type = ty;
    }
}
