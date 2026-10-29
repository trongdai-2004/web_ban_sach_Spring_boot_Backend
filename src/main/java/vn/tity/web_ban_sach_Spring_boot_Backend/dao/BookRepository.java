package vn.tity.web_ban_sach_Spring_boot_Backend.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import vn.tity.web_ban_sach_Spring_boot_Backend.entity.Book;

@RepositoryRestResource(path = "book")
public interface BookRepository extends JpaRepository<Book, Integer> {
        Page<Book> findByBookNameContaining(@RequestParam("bookName") String bookName, Pageable pageable);
}
