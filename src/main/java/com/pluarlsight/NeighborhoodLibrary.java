package com.pluarlsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    // Initialize Array to Hold Inventory at least 20 books.
    private static Book[] books = new Book[20];

    // Number of Books currently stored in Library.
    private static int numBooks = 15;

    //Main Method where program execution starts.
    public static void main(String[] args) {
        // Creating and initializing Books Information
        books[0] = new Book(100, "1000-000000-011", "The Frog", true, "Remo");
        books[1] = new Book(101, "1000-000000-012", "I Love Lucy", false, "");
        books[2] = new Book(102, "1000-000000-013", "Game of Thrones", true, "Rickelvi");
        books[3] = new Book(103, "1000-000000-014", "The Winner", true, "Gerald");
        books[4] = new Book(104, "1000-000000-015", "Snow White", false, "");
        books[5] = new Book(105, "1000-000000-016", "Old McDonald", true, "Kezia");
        books[6] = new Book(106, "1000-000000-017", "Judy Blume", true, "Brandon");
        books[7] = new Book(107, "1000-000000-018", "The Dog", false, "");
        books[8] = new Book(108, "1000-000000-019", "The Cat", false, "");
        books[9] = new Book(109, "1000-000000-020", "The Bird", false, "");
        books[10] = new Book(110, "1000-000000-021", "The Snake", false, "");
        books[11] = new Book(111, "1000-000000-022", "The Frog", false, "");
        books[12] = new Book(112, "1000-000000-023", "The Frog", false, "");
        books[13] = new Book(113, "1000-000000-024", "The Frog", false, "");
        books[14] = new Book(114, "1000-000000-025", "The Frog", false, "");
        books[15] = new Book(115, "1000-000000-026", "The Frog", false, "");
        books[16] = new Book(116, "1000-000000-027", "The Frog", false, "");
        books[17] = new Book(117, "1000-000000-028", "The Frog", false, "");
        books[18] = new Book(118, "1000-000000-031", "The Frog", false, "");
        books[19] = new Book(119, "1000-000000-031", "The Frog", false, "");

        // Create Scanner object to read user input.
        Scanner myScanner = new Scanner(System.in);





listAvailableBooks();
    }
    public static void checkOut(Scanner scanner){
        // Prompt user to enter name.
        System.out.println("enter name: ");
        String isCheckedout = scanner.nextLine();

        // boolean variable checkout to true
    boolean isOut = false;

    // loop to go through the books array.
        for (int i = 0; i <numBooks ; i++) {
            if (books[i].getCheckedOutTo().equalsIgnoreCase(isCheckedout)){
                System.out.println(books[i]);
                isOut = true;
            }

        }if (!isOut){
            System.out.println("");
        }

    }

public static void listAvailableBooks(){
        //Header
    System.out.println("Books Available: ");
    boolean isOut;
    // Iterate over array of books and print book details.
    do {
        System.out.println("Books Available: ");
        isOut = true;
    }while (isOut = true);
    for (int i = 0; i < numBooks ; i++) {
        System.out.println(books[i]);
    }

}
}
