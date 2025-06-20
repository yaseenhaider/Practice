class Movie1 {
    String title;
    String mpaaRating;
    int idNumber;

    public Movie1(String title, String mpaaRating, int idNumber) {
        this.title = title;
        this.mpaaRating = mpaaRating;
        this.idNumber = idNumber;
    }

    public double calcLateFees(int daysLate) {
        return 2.0 * daysLate; // Default late fee
    }
}

class Action1 extends Movie1 {
    public Action1(String title, String mpaaRating, int idNumber) {
        super(title, mpaaRating, idNumber);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 3.0 * daysLate; // Late fee for Action movies
    }
}

public class Task2 {
    public static void main(String[] args) {
        Movie1 actionMovie = new Action1("mula jatt", "R", 101);

        System.out.println("Late fee for mula jatt(3 days late): $" + actionMovie.calcLateFees(3));
    }
}