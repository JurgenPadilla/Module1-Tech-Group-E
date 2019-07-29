import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Integer numberBooks;
    private Person owner;
    private Map<String, Book> bookMap;
    private Map<String, Movie> movieMap;
    private Map<Genres, List<String>> byGenre;

    public Library() {
        bookMap = new HashMap<>();
        movieMap = new HashMap<>();
        byGenre = new HashMap<>();
    }

    public Integer getSizeMovie() {
        return movieMap.size();
    }

    public Integer getSizeBook() {
        return bookMap.size();
    }

    public void addBook(Book book) {
        bookMap.put(book.getTitle(), book);
        if (!byGenre.containsKey(book.getGenres())) {
            byGenre.put(book.getGenres(), new ArrayList<>());
            //byGenre.get(book.getGenres()).add(book.getTitle());
        }
        byGenre.get(book.getGenres()).add(book.getTitle());
    }

    public void addMovie(Movie movie) {
        movieMap.put(movie.getTitle(), movie);
    }

    public Book getBook(String name) {
        return bookMap.get(name);
    }

    public Movie getMovie(String name) {
        return movieMap.get(name);
    }

    public void removeBook(Book title) {
        bookMap.remove(title);

    }

    public void removeMovie(Movie title) {
        movieMap.remove(title);

    }

    public void showItem() {

    }

    public Integer getNumberBooks() {
        return numberBooks;
    }

    public Person getOwner() {
        return owner;
    }

    public List<String> getAllStoryByGenere(Genres gen) {
        return byGenre.get(gen);
    }
}