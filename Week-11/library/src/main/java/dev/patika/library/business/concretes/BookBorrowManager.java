package dev.patika.library.business.concretes;

import dev.patika.library.business.abstracts.IBookBorrowService;
import dev.patika.library.core.exception.NotFoundException;
import dev.patika.library.core.utilies.Msg;
import dev.patika.library.dao.BookBorrowRepo;
import dev.patika.library.entities.BookBorrow;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookBorrowManager implements IBookBorrowService {

    private final BookBorrowRepo bookBorrowRepo;

    public BookBorrowManager(BookBorrowRepo bookBorrowRepo) {
        this.bookBorrowRepo = bookBorrowRepo;
    }

    @Override
    public BookBorrow save(BookBorrow bookBorrow) {
        return this.bookBorrowRepo.save(bookBorrow);
    }

    @Override
    public BookBorrow update(BookBorrow bookBorrow) {
        this.get(bookBorrow.getId());
        return this.bookBorrowRepo.save(bookBorrow);
    }

    @Override
    public BookBorrow get(int id) {
        return this.bookBorrowRepo.findById(id).orElseThrow(() -> new NotFoundException(Msg.NOT_FOUND));
    }

    @Override
    public boolean delete(int id) {
        BookBorrow bookBorrow = this.get(id);
        this.bookBorrowRepo.delete(bookBorrow);
        return true;
    }

    @Override
    public Page<BookBorrow> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return this.bookBorrowRepo.findAll(pageable);
    }
}
