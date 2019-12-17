package com.skillstorm.bookservice.controllers;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.bookservice.data.BookRepository;
import com.skillstorm.bookservice.data.OrderRepository;
import com.skillstorm.bookservice.models.Book;
import com.skillstorm.bookservice.models.Order;
@RestController // @Controller ... applies @ResponseBody to every single method in the class.
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/bookservice")
public class BookServiceController {
	@Autowired
	private BookRepository repository;
	@Autowired
	private OrderRepository orderRepository;
//	@GetMapping("/bookservice/books")
	@GetMapping("/books")
	public ResponseEntity<List<Book>> findAll(HttpSession session) {
		session.getAttribute("user");
		return new ResponseEntity<List<Book>>(repository.findAll(), HttpStatus.OK);
	}
//	@PostMapping("/bookservice/book")
	@PostMapping("/book")
	public ResponseEntity<Book> save(@RequestBody Book book) {
		// responseEntity (mainpulate the HttpResponse)
		// generic means the type of obj in the response body <Artist>
		// body (json), HttpStatus, HttpHeaders
		ResponseEntity<Book> response = new ResponseEntity<Book> (repository.save(book), HttpStatus.CREATED);
		return response;
	}
	@PostMapping("/order")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
		ResponseEntity<Order> response = new ResponseEntity<Order> (orderRepository.save(order), HttpStatus.CREATED);
		return response;
	}
}