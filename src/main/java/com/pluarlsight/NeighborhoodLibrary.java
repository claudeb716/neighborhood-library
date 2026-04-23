package com.pluarlsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    // Initialize Array to Hold Inventory at least 20 books.
    private static final Book[] books = new Book[20];

    // Number of Books currently stored in Library.
    private static final int numBooks = 15;

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

        boolean isDone = false;

        while (!isDone) {
            // Home Screen

            System.out.println("Welcome to The Library, choose an option: ");
            System.out.println(" 1 - Available Books");
            System.out.println(" 2 - Checked Out Books");
            System.out.println(" 3 - Exit( Close App ) ");
            System.out.println(" Enter 1, 2, or 3:");
            // User's input command.
            int command = myScanner.nextInt();
            // add scanner to consume line.
            myScanner.nextLine();

            // Switch/Case
            switch (command) {
                case 1:
                    listAvailableBooks(myScanner);
                    break;
                case 2:
                    listCheckedOutBooks(myScanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    isDone = true;
                    break;
                default:
                    System.out.println("Invaild Number.");
                    break;
            }

        }
    }

    public static void listAvailableBooks(Scanner scanner) {

        //Header
        System.out.println("Books Available: ");

        // flag to find any matching books.
        boolean isOut = false;

        // Iterate over array of books and print book details.
        while (isOut) {
            for (int i = 0; i < numBooks; i++) {

                // if statement if book is equal to checkedout.
                if (books[i].isCheckedOut()) {
                    System.out.println("ID: " + books[i].getId() + " ISBN: " + books[i].getIsbn() + " Title: " + books[i].getTitle());
                    isOut = true;
                } else {
                    System.out.println("No Books are available");

                }
                // ask user to check out or go back to homescreen.
                System.out.println("Enter a book ID to check out, or type X to go back to homescreen.");
                String userInput = scanner.nextLine();

                System.out.println("Enter your Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();

                if (userInput.equalsIgnoreCase("X")) {
                    isOut = false;
                }else {
                    books[i].setCheckedOutTo(name);
                    books[i].setCheckedOut(true);
                }

            } // End of for Loop
        }
    }
    public static void listCheckedOutBooks(Scanner scanner){
        //Header
        System.out.println("Books Checked Out: ");

        // flag to find any matching books.
        boolean isOut = true;

        // Iterate over array of books and print book details.
        while (isOut){
            for (int i = 0; i < numBooks; i++) {
            // if statement if book is equal to checkedout.
            if (!books[i].isCheckedOut()) {
                System.out.println("ID: " + books[i].getId() + " ISBN: " + books[i].getIsbn() + " Title: " + books[i].getTitle());

            }
            // ask user to check out or go back to homescreen.
            System.out.println("Check in book by pushing (C) or (X) to go back to the  homescreen.");
            String  checkIn = scanner.nextLine();

            System.out.println("Enter Book ID: ");
            int idNum = scanner.nextInt();
            scanner.nextLine();
            if (checkIn.equalsIgnoreCase("x")){
                isOut = false;
            }else {
                books[i].setCheckedOutTo("");
                books[i].setCheckedOut(false);
            }
            }

        } // End of for loop

    }
}

