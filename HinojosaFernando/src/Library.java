import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Library {
    private Person owner;
    private Map<String, Book> bookMap;
    private Map<String, Movie> movieMap;
    private Map<Genres, List<String>> byGenre;
    private Map<String, Person> creatorCollection;
    private String row;

    public Library() {
        bookMap = new HashMap<>();
        movieMap = new HashMap<>();
        byGenre = new HashMap<>();
        loadBooks();
        loadMovies();
    }

    public void addBook(Book book) {
        bookMap.put(book.getTitle(), book);
        if (!byGenre.containsKey(book.getGenres())) {
            byGenre.put(book.getGenres(), new ArrayList<>());
            //byGenre.get(book.getGenres()).add(book.getTitle());
        }
        byGenre.get(book.getGenres()).add(book.getTitle());
    }

    public List<String> getAllStoryByGenere(Genres gen) {

        if (byGenre.containsKey(gen)) {
            return byGenre.get(gen);
        } else {
            System.out.println("Genres is not present");
            return null;
        }

    }

    public void addMovie(Movie movie) {
        movieMap.put(movie.getTitle(), movie);
        if (!byGenre.containsKey(movie.getGenres())) {
            byGenre.put(movie.getGenres(), new ArrayList<>());
        }
        byGenre.get(movie.getGenres()).add(movie.getTitle());
    }

    public void loadMovies() {
        BufferedReader readerMovie = null;
        Movie loadMovies;
        try {
            readerMovie = new BufferedReader(new FileReader("/home/fernando_hinojosa/Documents/Story/movie.csv"));
            while ((row = readerMovie.readLine()) != null) {
                String[] data = row.split(",");
                Genres genreEnum = Genres.valueOf(data[1]);

                loadMovies = new Movie(data[0], genreEnum, data[3]);
                addMovie(loadMovies);

            }
        } catch (IOException e) {
            System.out.println("Could not find file");

        }
    }

    public void loadBooks() {
        BufferedReader readerBook = null;
        Book bookload;
        try {
            readerBook = new BufferedReader(new FileReader("/home/fernando_hinojosa/Documents/Story/book.csv"));
            while ((row = readerBook.readLine()) != null) {
                String[] data = row.split(",");
                Genres genreEnum = Genres.valueOf(data[1]);
                Author author = new Author(data[2]);

                bookload = new Book(data[0], genreEnum, author, data[3]);
                addBook(bookload);

                // do something with the data
            }
        } catch (IOException e) {
            System.out.println("Could not find file");

        }
    }

    public Integer getSizeMovie() {
        return movieMap.size();
    }

    public Integer getSizeBook() {
        return bookMap.size();
    }

    public Book getBook(String name) {
        return bookMap.get(name);
    }

    public Movie getMovie(String name) {
        return movieMap.get(name);
    }

    public void removeBook(String title) {
        bookMap.remove(title);

    }

    public void removeMovie(String title) {
        movieMap.remove(title);

    }

    public Person getOwner() {
        return owner;
    }


}