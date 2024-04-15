 import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Movie> movies = new ArrayList<Movie>();

    public static void addMovies() {
        movies.add(new Movie("Spiderman: Into the Spiderverse", 2018, "Sony Pictures"));
        movies.add(new Movie("Big Hero 6", 2014, "Disney"));
        movies.add(new Movie("Enchanted", 2007, "Disney"));
        movies.add(new Movie("Puss In Boots: The Last Wish", 2022, "Dreamworks"));
        movies.add(new Movie("WALL-E", 2008, "PIXAR"));
        movies.add(new Movie("Suzume", 2022, "Toho"));
        movies.add(new Movie("Belle", 2021, "Toho"));
        movies.add(new Movie("Ratatouille", 2007, "PIXAR"));
        movies.add(new Movie("Spiderman: Across the Spiderverse", 2023, "Sony Pictures"));
        movies.add(new Movie("How to Train Your Dragon", 2010, "Dreamworks"));
    }

    public static void print() {
        System.out.println();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
    
    public static void insertionSortByTitle(List<Movie> movies, int sort){
        for(int i = 1; i < movies.size(); i++){
            Movie movie = movies.get(i);
            int j = i - 1;
            if(sort == 1){
                while(j >= 0 && movies.get(j).getTitle().compareTo(movie.getTitle()) > 0){
                    movies.set(j+1, movies.get(j));
                    j--;
                }
            }
            else if(sort == 2){
                while(j >= 0 && movies.get(j).getTitle().compareTo(movie.getTitle()) < 0){
                    movies.set(j+1, movies.get(j));
                    j--;
                }
            }
            movies.set(j+1,movie);
        }
    }
    
    public static void insertionSortByStudio(List<Movie> movies, int sort){
        for(int i = 1; i < movies.size(); i++){
            Movie movie = movies.get(i);
            int j = i - 1;
            if(sort == 1){
                while(j >= 0 && movies.get(j).getStudio().compareTo(movie.getStudio()) > 0){
                    movies.set(j+1, movies.get(j));
                    j--;
                }
            }
            else if(sort == 2){
                while(j >= 0 && movies.get(j).getStudio().compareTo(movie.getStudio()) < 0){
                    movies.set(j+1, movies.get(j));
                    j--;
                }
            }
            movies.set(j+1,movie);
        }
    }
    
    public static void insertionSortByYear(List<Movie> movies, int sort){
        for(int i = 1; i < movies.size(); i++){
            Movie movie = movies.get(i);
            int j = i - 1;
            if(sort == 1){
                while(j >= 0 && movies.get(j).getYear() > movie.getYear()){
                    movies.set(j+1, movies.get(j));
                    j--;
                }
            }
            else if(sort == 2){
                while(j >= 0 && movies.get(j).getYear() < movie.getYear()){
                    movies.set(j+1, movies.get(j));
                    j--;
                }
            }
            movies.set(j+1,movie);
        }
    }

    public static void main(String[] args) {
        addMovies();
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by their Title A-Z:");
        insertionSortByTitle(movies, 1);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by the name of the Studio A-Z:");
        insertionSortByStudio(movies, 1);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by Year released oldest-newest:");
        insertionSortByYear(movies, 1);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by their Title Z-A:");
        insertionSortByTitle(movies, 2);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by the name of the Studio Z-A:");
        insertionSortByStudio(movies,2);
        print();
        System.out.println();
        System.out.println("Sorting your list of movies by Year released newest-oldest:");
        insertionSortByYear(movies, 2);
        print();
    }
} 