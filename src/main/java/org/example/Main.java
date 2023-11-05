

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Book1", "Author1", "7410852369", 2001));
        library.addBook(new Book("Book2", "Author2", "9874563215", 2002));
        library.addBook(new Book("Book3", "Author3", "9517534862", 2003));

        System.out.println("All Books:");
        library.showAllBooks();

        String searchTitle = "Book2";
        Book foundBook = library.findBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Found Book: " + foundBook.toString());
        } else {
            System.out.println("Book with title \"" + searchTitle + "\" not found.");
        }

        String isbnToRemove = "7410852369";
        if (library.removeBookByIsbn(isbnToRemove)) {
            System.out.println("Book with ISBN " + isbnToRemove + " removed successfully.");
        } else {
            System.out.println("Book with ISBN " + isbnToRemove + " not found.");
        }

        System.out.println("Updated Books:");
        library.showAllBooks();
    }
}
