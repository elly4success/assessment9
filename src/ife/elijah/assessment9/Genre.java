package ife.elijah.assessment9;
import java.util.Scanner;

public class Genre {


    public static class Movie {
        private int cost;
        private String name;

        public Movie(String name, int cost) {
            this.cost = cost;
            this.name = name;
        }

        public int getCost() {
            return cost;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        //Declare Variables
        Scanner keyboard = new Scanner(System.in);
        int userChoice;
        Map<Integer, Movie> movies = new HashMap<Integer, Movie>();
        movies.put(1, new Movie("Iron Man", 5));
        movies.put(2, new Movie("Transformers", 4));
        movies.put(3, new Movie("Godzilla", 3));
        // ...

        //Welcome the user
        System.out.println("Hello, Welcome to TC Movies OnDemand.");

        //Display the listed movies so the user can know with movie they want to watch
        System.out.println("\nChoose which movie you want to watch: ");
        Set<Integer> keys = movies.keySet();
        for (Integer key : keys) {
            Movie movie = movies.get(key);
            System.out.println(key + ": " + movie.getName());
            System.out.println("\t" + "Price: $" + movie.getCost());
        }

}
