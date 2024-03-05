package dev.patika.library.dao;

import dev.patika.library.entities.BookBorrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowRepo extends JpaRepository<BookBorrow, Integer> {
}
