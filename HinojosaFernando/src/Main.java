import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.lang.String;

public class Main {


    private static Scanner scanner = new Scanner(System.in);


    public static void print(String something) {
        System.out.println(something);
    }

    private static void getBook(Library library) {
        print("Please enter a Book name");
        String introducedName = scanner.nextLine();
        Book resultbook = library.getBook(introducedName);
        if (resultbook == null) {
            print("The introduced name is not valid.");
            return;
        }
        print(resultbook.toString());
    }


    private static void registerBook(Library library) {

        print("Please enter the title of the book");
        String titleBook = scanner.nextLine();
        print("Please enter the lenguage of the book");
        String lenguage = scanner.nextLine();
        print("Please enter the genre of the book");
        validateGenre();
        Genres genreEnum = null;

        Author author = new Author("Test");
        Book currentBook = new Book(titleBook, genreEnum, author, lenguage);
        //System.out.println(currentBook);
        library.addBook(currentBook);


    }
    private static void getMovie(Library library) {
        print("Please enter a Movie title");
        String introducedName = scanner.nextLine();
        Movie resultMovie =library.getMovie(introducedName);
        if (resultMovie == null) {
            print("The introduced name is not valid.");
            return;
        }
        print(resultMovie.toString());
    }

    private static void registerMovie(Library library) {

        print("Please enter the title of the Movie");
        String titleMovie = scanner.nextLine();
        print("Please enter the genre of the Movie");
        validateGenre();
        Genres genreEnum=null;

        print("Please enter the release date of the Movie");
        String releaseDate = scanner.nextLine();


        Movie currentMovie = new Movie(titleMovie, genreEnum, releaseDate);
        library.addMovie(currentMovie);


    }

    private static void validateGenre() {
        String genre = scanner.nextLine();
        Genres genreEnum = null;
        try {
            genreEnum = Genres.valueOf(genre);
        } catch (Exception e) {
            print("Please enter a valid value of Genre, the correct values are:");
            for(Genres gen : Genres.values()) {
                System.out.println(gen.name());
            }
        }
    }

    private static void getByGenere(Library library) {
        print("Please enter the genre of the book");
        Genres genreEnum = null;
        String genre = scanner.nextLine();
        try {
            genreEnum = Genres.valueOf(genre); //add validation for genre
        } catch (Exception e) {
            print("Please enter a valid value of Genre");
            genreEnum.toString();

        }

        List<String> list = library.getAllStoryByGenere(genreEnum);
        if (list!=null){
            print(list.toString());
        }


    }


    public static void main(String[] args) throws IOException {


        Library library = new Library();

        print("Welcome to your Movie Database");
        while (true) {
            print("Please enter an option");
            print("1. Register Book");
            print("2. Register Movie");
            print("3. Get Movie Information");
            print("4. Get Book Information");
            print("5. Get Books and Movies by Genre");
            print("6. Total quantity of Movies");
            print("7. Total quantity of Books");
            print("8. Exit");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    registerBook(library);
                    break;
                case "2":
                    registerMovie(library);
                    break;
                case "3":
                    getMovie(library);
                    break;
                case "4":
                    getBook(library);
                    break;
                case "5":
                    getByGenere(library);
                    break;
                case "6":
                    System.out.println("The quality of movies is: " + library.getSizeMovie());
                    break;
                case "7":
                    System.out.println("The quality of books is: " + library.getSizeBook());
                    break;
                case "8":
                    return;
                default:
                    print("Invalid option");
            }

        }
    }

}