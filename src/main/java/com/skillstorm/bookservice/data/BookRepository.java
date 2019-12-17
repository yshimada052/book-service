package com.skillstorm.bookservice.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.skillstorm.bookservice.models.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
