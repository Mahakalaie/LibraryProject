import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library()
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookException
    {
        if(book == null)
            throw new InvalidBookException("Book should not be null");

        books.add(book);
    }

    private Book findBook(String title)
    {
        for(Book book : books)
        {
            if(title.equals(book.getTitle()))
                 return book;
        }

        return null;
    }

    public void borrowBook(String title) throws BookNotFoundException, EmptyLibraryException
    {
        if(books.isEmpty())
            throw new EmptyLibraryException("Library is empty, no books to borrow");

        if(findBook(title) == null)
            throw new BookNotFoundException("Book with title " + title + "not found.");

        System.out.println("The Book: " + findBook(title).toString() + " borrowed successfully");
    }

    public void returnBook(String title) throws BookNotFoundException
    {
        if(findBook(title) == null)
            throw new BookNotFoundException("Cannot return.Book with title " + title + " not found.");

        System.out.println("The Book: " + findBook(title).toString() + " returned successfully");
    }

    public void listBooks() throws EmptyLibraryException
    {
        if(books.isEmpty())
            throw new EmptyLibraryException("Library is empty.");

        System.out.println("Books in the library:");
        for(Book book : books)
        {
            System.out.println(book.toString());
        }
        System.out.println("----------");
    }

    public ArrayList<Book> getBooks()
    {
        return books;
    }
}
