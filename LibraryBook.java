
public class LibraryBook {
    
     static int totalBooks = 0;

    
     String title;
     String author;
     String isbn;

    
     LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        
        totalBooks++;
    }

    
     static LibraryBook addNewBook(String title, String author, String isbn) {
       
        return new LibraryBook(title, author, isbn);
    }

    
     static void displayTotalBooks() {
        System.out.println("Total number of books in the library: " + totalBooks);
    }

    
     String getTitle() {
        return title;
    }

     String getAuthor() {
        return author;
    }

     String getIsbn() {
        return isbn;
    }
    
    public static void main(String[] args) {
        
        LibraryBook book1 = LibraryBook.addNewBook("1984", "George Orwell", "9780451524935");
        LibraryBook book2 = LibraryBook.addNewBook("To Kill a Mockingbird", "Harper Lee", "9780060935467");

        
        LibraryBook.displayTotalBooks();  
    }
}

