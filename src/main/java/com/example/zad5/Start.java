package com.example.zad5;
        import com.example.zad5.entity.Author;
        import com.example.zad5.entity.Book;
        import com.example.zad5.entity.BookCategory;
        import com.example.zad5.repo.AuthorRepo;
        import com.example.zad5.repo.BookRepo;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;

        import java.util.stream.Collectors;
        import java.util.stream.Stream;

@Component
public class Start {
    private AuthorRepo authorRepo;
    private BookRepo bookRepo;

    @Autowired
    public Start(AuthorRepo authorRepo, BookRepo bookRepo){
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        Book book = new Book();
        book.setBookCategory(BookCategory.BIOGRAFIE);
        book.setTitle("Tytul");
        book.setIsbn("ISBN1");
        Book book1 = new Book();
        book1.setBookCategory(BookCategory.KOMEDIE);
        book1.setIsbn("ISBN2");
        book1.setTitle("Tytul drugi");
        Book book2 = new Book();
        book2.setTitle("Tytul3");
        book2.setIsbn("ISBN3");
        book2.setBookCategory(BookCategory.OBYCZAJOWE);
        Book book3 = new Book();
        book3.setBookCategory(BookCategory.OBYCZAJOWE);
        book3.setTitle("Tytul 4");
        book3.setIsbn("ISNM4");
        Author author = new Author();
        author.setName("Jan");
        author.setSurname("Kowalski");
        author.setBooks(Stream.of(book).collect(Collectors.toSet()));
        bookRepo.save(book);
        bookRepo.save(book1);
        bookRepo.save(book2);
        bookRepo.save(book3);
        authorRepo.save(author);
    }

    public Start() {

    }
}
