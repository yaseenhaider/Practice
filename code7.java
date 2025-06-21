class Movie {
    private String title;
    private String mpaaRating;
    private int idNumber;

    public Movie(String title, String mpaaRating, int idNumber) {
        this.title = title;
        this.mpaaRating = mpaaRating;
        this.idNumber = idNumber;
    }

    public double calcLateFees(int daysLate) {


        return 2.0 * daysLate; // Default late fee
    }
}

class Action extends Movie {
    public Action(String title, String mpaaRating, int idNumber) {

        super(title, mpaaRating, idNumber);
    }

    @Override
    public double calcLateFees(int daysLate) {

        return 3.0 * daysLate; // Late fee for Action movies
    }
}

class Comedy extends Movie {
    public Comedy(String title, String mpaaRating, int idNumber) {
        super(title, mpaaRating, idNumber);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 2.5 * daysLate; // Late fee for Comedy movies
    }
}

class Drama extends Movie {
    public Drama(String title, String mpaaRating, int idNumber) {
        super(title, mpaaRating, idNumber);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 2.0 * daysLate; // Late fee for Drama movies
    }
}

public class code7 {
    public static void main(String[] args) {
        Movie actionMovie = new Action("chl mera putt", "R", 101);
        Movie comedyMovie = new Comedy("wekh barata chliya", "PG-1", 102);
        Movie dramaMovie = new Drama("Kurulus osman", "R", 103);

        System.out.println("Late fee for chl mera putt (3 days late): $" + actionMovie.calcLateFees(3));
        System.out.println("Late fee for wekh barata chliya(2 days late): $" + comedyMovie.calcLateFees(2));
        System.out.println("Late fee for Kurulus osman (5 days late): $" + dramaMovie.calcLateFees(5));
    }
}