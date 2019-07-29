import java.util.Scanner;
import java.util.List;
import java.util.Map;
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
        print(resultbook.display());
    }

    private static void registerBook(Library library) {

        print("Please enter the title of the book");
        String titleBook = scanner.nextLine();
        print("Please enter the lenguage of the book");
        String lenguage = scanner.nextLine();
        print("Please enter the genre of the book");
        String genre = scanner.nextLine();
        Genres genreEnum = null;
        try {
            genreEnum = Genres.valueOf(genre); //add validation for genre
        } catch (Exception e) {
            print("Please enter a valid value of Genre");
        }


        Author author = new Author();
        Book currentBook = new Book(titleBook, genreEnum, author, lenguage);
        //System.out.println(currentBook);
        library.addBook(currentBook);


    }
    private static void getByGenere(Library library) {
        print("Please enter the genre of the book");
        String genre = scanner.nextLine();
        Genres genreEnum = null;
        try {
            genreEnum = Genres.valueOf(genre); //add validation for genre
        } catch (Exception e) {
            print("Please enter a valid value of Genre");
        }

        List<String> list = library.getAllStoryByGenere(genreEnum);
        print(list.toString());

    }


    public static void main(String[] args) {
        Library library = new Library();
        print("Welcome to your Movie Database");
        while (true) {
            print("Please enter an option");
            print("1. Register Book");
            print("2. Register Movie");
            print("3. Get Movie Information");
            print("4. Get Book Information");
            print("5. Get Books and Movies by Genre");
            print("6. Exit");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    registerBook(library);
                    break;
                case "2":

                    break;
                case "3":
                    print("The size of your dex is: ");
                    break;
                case "4":
                    getBook(library);
                    break;
                case "5":
                    getByGenere(library);
                    break;
                case "6":
                    return;
                default:
                    print("Invalid option");
            }

        }
    }

}