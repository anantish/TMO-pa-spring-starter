package com.galvanize.tmo.paspringstarter.controller;

import java.util.Comparator;
import java.util.List;

import com.galvanize.tmo.paspringstarter.model.Book;
import com.galvanize.tmo.paspringstarter.model.ResponseBody;
import com.galvanize.tmo.paspringstarter.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class BookController {


    @GetMapping("api/books")
    public ResponseBody getAllBooks(){

        ResponseBody response = new ResponseBody();

        response.setBooks(BookService.getAllBooks());

        return response;
    }


    public static class bookSorter implements Comparator<Book>
    {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareToIgnoreCase(o2.getTitle());
        }
    }







    @GetMapping("api/books/{id}")
    public Book getBookDetails(@PathVariable Long id) {

        return BookService.getBookDetails(id);

    }

    @PostMapping("api/books")
    public ResponseEntity<Object> addBook(@RequestBody Book book) {

        return new ResponseEntity<>(BookService.addBook(book), HttpStatus.CREATED);

    }

    @PostMapping("api/books/addListOfBooks")
    public ResponseBody addListOfBooks(@RequestBody List<Book> bookList){
        ResponseBody response = new ResponseBody();
        response.setBooks(BookService.addListOfBooks(bookList));
        return response;

    }

    @PutMapping("api/books/updateBook/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {

        return BookService.updateBook(id, book);

    }

    @DeleteMapping("api/books/deleteBook/{id}")
    public Book deleteBook(@PathVariable Long id) {

        return BookService.deleteBook(id);

    }

    @DeleteMapping("api/books")
    public ResponseEntity<Void> deleteAllBooks() {

        BookService.deleteAllBooks();
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

    }


}
