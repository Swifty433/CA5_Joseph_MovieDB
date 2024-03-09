import java.lang.runtime.SwitchBootstraps;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

/**
 * Main author: Joseph Byrne
 * Other contributors: Ema Eiliakas, Julius Odeyami, Brandon...
 *
 */


public class MainApp {
    public static void main(String[] args) throws SQLException {

        Scanner keyboard = new Scanner(System.in);
        DatabaseSetUp databaseSetUp = DatabaseSetUp.getInstance();

        System.out.println("Hello there and welcome to our movie database");

        int choice;
        do {
            System.out.println("1. View all movies.");
            System.out.println("2. Exit.");

            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    ShowMovies(databaseSetUp);
                    break;
                case 2:
                    System.out.println("Exiting Code now.");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 2); //Exits Loop
    }

    private static void ShowMovies(DatabaseSetUp databaseSetUp) throws SQLException {
        System.out.println("All Movies:");
        List<Movie> allMovies = databaseSetUp.getAllMovies();
        System.out.println(allMovies);
    }
}
