package com.pluarlsight;

public class NeighborhoodLibrary {
    // Initialize Array to Hold Inventory at least 20 books.
    private static Book[] books = new Book[20];

    // Number of Books currently stored in Library.
    private static int numBooks = 6;

    //Main Method where program execution starts.
    public static void main(String[] args) {
        // CReating and initializing Books Information
        books[0] = new Book(100, "1011", "The Frog", false, "Remo");
        books[1] = new Book(100, "1011", "The Frog", false, "Remo");
        books[2] = new Book(100, "1011", "The Frog", false, "Remo");
        books[3] = new Book(100, "1011", "The Frog", false, "Remo");
        books[4] = new Book(100, "1011", "The Frog", false, "Remo");
        books[5] = new Book(100, "1011", "The Frog", false, "Remo");
        books[6] = new Book(100, "1011", "The Frog", false, "Remo");
    }
}
