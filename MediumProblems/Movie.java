/* Movie Details Manager Create a Movie class with attributes: name, 
language, rating (out of 5). Create a method displayMovieDetails(). 
In main(), create 4 Movie objects and call displayMovieDetails(). */
public class Movie{
  
    public String name;
    public String language;
    public double rating;

    public Movie( String name, String language, double rating){
        this.name = name;
        this.language = language;
        this.rating = rating;
    }
    
    public void  displayMovieDetails(){
        System.out.println("name:" + name);
        System.out.println("language:" + language);
        System.out.println("rating:" + rating + "/5");
        System.out.println();
    }
    public static void main(String[] args){
        Movie m1 = new Movie("puspha2", "Hindi", 5);
        Movie m2 = new Movie("DJ","Hindi", 5);
        Movie m3 = new Movie("Bahubali", "Hindi", 3.5);
        Movie m4 = new Movie("Pk", "Hindi", 4.5);

        m1.displayMovieDetails();
        m2.displayMovieDetails();
        m3.displayMovieDetails();
        m4.displayMovieDetails();
    }
}


