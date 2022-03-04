package com.company;

import java.util.Scanner;

public class Main {
    //creating a new series, which is inheriting through streaming and series.
    public static series TheWitcher = new series();
    public static void main(String[] args) {
        controls();
        menu();
    }
    public static void controls() {
        //creating test which uses "gets"
        System.out.println("Welcome to the service.");
        System.out.println("The Program you currently have: " + TheWitcher.getTitle());
        System.out.println("Details about the selected title.");
        System.out.println("Title: " + TheWitcher.getTitle());
        System.out.println("Age Rating: " + TheWitcher.getAgeRating());
        System.out.println("Rating: " + TheWitcher.getRating() + " Star raiting.");
        System.out.println("Genres: " + TheWitcher.getGenre());
        System.out.println("Number of season currently on: " + TheWitcher.getNoSeries());
        System.out.println("Number of episode currently on: " + TheWitcher.getNoEpisode());
    }
    public static void menu() {
        int menuChoice;
        int editInt;
        String menuName;
        String edit;
//This creates the menu which can be used to edit
        System.out.println("Please select what you want to edit.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1 - Title");
        System.out.println("2 - Age Rating");
        System.out.println("3 - Genre");
        System.out.println("4 - Rating");
        System.out.println("5 - Season Number");
        System.out.println("6 - Episode Number");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner number_input = new Scanner(System.in);
        menuChoice = number_input.nextInt();
//This is the switch statement used to navigate the menu created above.
        switch (menuChoice) {
            case 1:
                menuName = "Title";
                System.out.println("Please enter the new " + menuName);
                edit = number_input.next();
                TheWitcher.title = edit;
                break;
            case 2:
                menuName = "Age Rating";
                System.out.println("Please enter the new " + menuName);
                editInt = number_input.nextInt();
                TheWitcher.ageRating = editInt;
                break;
            case 3:
                menuName = "Genre";
                System.out.println("Please enter the new " + menuName);
                edit = number_input.next();
                TheWitcher.genre = edit;
                break;
            case 5:
                menuName = "Rating";
                System.out.println("Please enter the new " + menuName);
                editInt = number_input.nextInt();
                TheWitcher.rating = editInt;
                break;
            case 6:
                menuName = "Season Number";
                System.out.println("Please enter the new " + menuName);
                editInt = number_input.nextInt();
                TheWitcher.noSeries = editInt;
                break;
            case 7:
                menuName = "Episode Number";
                System.out.println("Please enter the new " + menuName);
                editInt = number_input.nextInt();
                TheWitcher.noEpisode = editInt;
                break;
        }
        controls();
    }
}
//creating a parent class, used for inheritance.
class Streaming {
    String title;
    int ageRating;
    String genre;
    int rating;
    //sets the initial values for the program, these can be edited.
    Streaming() {
        title = "The Witcher";
        ageRating = 17;
        genre = "Drama, Fantasy, Adventure";
        rating = 95;
    }
    //creating a function which can be called.
    String getTitle() {return title;}
    int getAgeRating() {return ageRating;}
    String getGenre() {return genre;}
    int getRating() {return rating;}
}
//creating a child class, inheriting from the streaming class.
class movie extends Streaming {
    double movieLength;
    String movieDescriptions;
    //sets the initial values for the program... can be edited.
    movie() {
        super();
        //super calls the functions created within the parent class.
        movieLength = 1.4;
        movieDescriptions = "MovieDesc";
    }
    //again creating a function to call the individual values.
    double getMovieLength() {return movieLength;}
    String getMovieDescriptions() {return  movieDescriptions;}

}
//creating a child class, inheriting from the streaming class.
class series extends Streaming {
    double seriesLength;
    int noSeries;
    int noEpisode;
    //sets the initial values for the program... can be edited.
    series() {
        super();
        //super calls the functions created within the parent class.
        seriesLength = 0.7;
        noSeries = 1;
        noEpisode = 3;
    }
    //again creating a function to call the individual values.
    double getSeriesLength() {return seriesLength;}
    int getNoSeries() {return noSeries;}
    int getNoEpisode() {return noEpisode;}
}
//creating a child class, inheriting from the streaming class.
class special extends Streaming {
    double movieLength;
    String reasonSpecial;
    //sets the initial values for the program... can be edited.
    special() {
        super();
        //super calls the functions created within the parent class.
        movieLength = 1.3;
        reasonSpecial = "airs for 3 months";
    }
    //again creating a function to call the individual values.
    double getMovieLength() {return movieLength;}
    String getReasonSpecial() {return reasonSpecial;}
}