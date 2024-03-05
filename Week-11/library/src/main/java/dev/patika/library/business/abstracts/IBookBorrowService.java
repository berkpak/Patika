package dev.patika.library.business.abstracts;

import dev.patika.library.entities.BookBorrow;
import org.springframework.data.domain.Page;

public interface IBookBorrowService {

    BookBorrow save(BookBorrow bookBorrow);
    BookBorrow update(BookBorrow bookBorrow);
    BookBorrow get(int id);
    boolean delete(int id);
    Page<BookBorrow> cursor(int page, int pageSize);
}
