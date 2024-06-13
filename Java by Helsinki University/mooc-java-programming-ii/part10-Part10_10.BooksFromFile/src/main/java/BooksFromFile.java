
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .forEach(book -> {
                        String[] bookParts = book.split(",");
                        
                        String name = bookParts[0];
                        int year = Integer.valueOf(bookParts[1]);
                        int pages = Integer.valueOf(bookParts[2]);
                        String author = bookParts[3];
                        
                        books.add(new Book(name, year, pages, author));
                    });
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return books;
    }

}
