package kr.ac.kopo.pcu.bookmarket.repository;

import kr.ac.kopo.pcu.bookmarket.domain.Book;
import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
