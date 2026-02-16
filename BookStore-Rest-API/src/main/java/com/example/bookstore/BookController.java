
package com.example.bookstore;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<Book> getBooks() {
        return Arrays.asList(
                new Book(1L, "Clean Code", "Robert C. Martin"),
                new Book(2L, "Effective Java", "Joshua Bloch"),
                new Book(3L, "Spring in Action", "Craig Walls")
        );
    }
}
