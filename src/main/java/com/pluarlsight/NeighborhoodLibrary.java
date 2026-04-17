package com.pluarlsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    // Initialize Array to Hold Inventory at least 20 books.
    private static Book[] books = new Book[20];

    // Number of Books currently stored in Library.
    private static int numBooks = 6;

    //Main Method where program execution starts.
    public static void main(String[] args) {
        // CReating and initializing Books Information
        books[0] = new Book(100, "1011", "The Frog", true, "Remo");
        books[1] = new Book(101, "1012", "I Love Lucy", true, "Chris");
        books[2] = new Book(102, "1013", "Game of Thrones", true, "Rickelvi");
        books[3] = new Book(103, "1014", "The Winner", true, "Gerald");
        books[4] = new Book(104, "1015", "Snow White and 7 Dwarfs", true, "Nurbu");
        books[5] = new Book(105, "1016", "Old McDonald", true, "Kezia");
        books[6] = new Book(106, "1017", "Judy Blume", true, "");

        // Create Scanner object to read user input.
        Scanner myScanner = new Scanner(System.in);




    }
}
