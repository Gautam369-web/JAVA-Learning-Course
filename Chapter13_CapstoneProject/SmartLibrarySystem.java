import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * CHAPTER 9: FINAL CAPSTONE PROJECT
 * SMART LIBRARY SYSTEM
 * 
 * This project integrates all previous chapters:
 * 1-2. Basics & Loops (Menu system)
 * 3. OOP (Book class)
 * 4. Collections (ArrayList storage)
 * 5. Exception Handling (Try-catch for I/O and Input)
 * 6. File I/O (Persistence)
 * 7. Functional Programming (Searching via Streams)
 * 8. Multithreading (Background Auto-save)
 */

// 1. DATA MODEL (Chapter 3: OOP)
class Book implements Serializable {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("Title: %-15s | Author: %-10s | Price: $%.2f", title, author, price);
    }
}

// 2. LOGIC LAYER (Chapter 4 & 6: Collections & File I/O)
class Library {
    private List<Book> books = new ArrayList<>();
    private final String FILE_NAME = "library_data.txt";

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully!");
    }

    public void displayAll() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        books.forEach(System.out::println);
    }

    // Chapter 7: Functional Programming (Streams)
    public void searchByAuthor(String author) {
        List<Book> results = books.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());

        if (results.isEmpty()) {
            System.out.println("No books found for author: " + author);
        } else {
            results.forEach(System.out::println);
        }
    }

    // Chapter 6: File I/O
    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Book b : books) {
                writer.println(b.getTitle() + "," + b.getAuthor() + "," + b.getPrice());
            }
        } catch (IOException e) {
            System.err.println("Error saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    books.add(new Book(parts[0], parts[1], Double.parseDouble(parts[2])));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }
}

// 3. BACKGROUND TASK (Chapter 8: Multithreading)
class AutoSaveTask implements Runnable {
    private Library library;

    public AutoSaveTask(Library lib) { this.library = lib; }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30000); // Wait 30 seconds
                library.saveToFile();
                System.out.println("\n[SYSTEM]: Background Auto-Save completed.");
            } catch (InterruptedException e) {
                break; // Stop thread if interrupted
            }
        }
    }
}

// 4. USER INTERFACE (Chapter 1, 2, & 5)
public class SmartLibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.loadFromFile(); // Load existing data on start

        // Start background auto-save (Multithreading)
        Thread autoSaveThread = new Thread(new AutoSaveTask(library));
        autoSaveThread.setDaemon(true); // Close if main program closes
        autoSaveThread.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("--- Welcome to the Smart Library System ---");

        while (true) {
            System.out.println("\n1. Add Book | 2. View All | 3. Search Author | 4. Exit");
            System.out.print("Choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine()); // Exception Handling

                if (choice == 1) {
                    System.out.print("Enter Title: "); String t = sc.nextLine();
                    System.out.print("Enter Author: "); String a = sc.nextLine();
                    System.out.print("Enter Price: "); double p = Double.parseDouble(sc.nextLine());
                    library.addBook(new Book(t, a, p));
                } 
                else if (choice == 2) {
                    library.displayAll();
                } 
                else if (choice == 3) {
                    System.out.print("Enter Author Name: ");
                    library.searchByAuthor(sc.nextLine());
                } 
                else if (choice == 4) {
                    library.saveToFile();
                    System.out.println("Data saved. Goodbye!");
                    break;
                } 
                else {
                    System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: Please enter valid input.");
            }
        }
        sc.close();
    }
}
