package com.galvanize.tmo.paspringstarter.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.galvanize.tmo.paspringstarter.model.Book;


public class BookService {

    private static Map<Long, Book> bookMap = new HashMap<>();
    private static Long index = 0L;


    public static List<Book> getAllBooks(){
        return new ArrayList<>(bookMap.values());
    }

    public static Book getBookDetails(Long id) {
        return bookMap.get(id);

    }

    public static Book addBook(Book book) {
        index +=1;
        book.setId(index);
        bookMap.put(index, book);
        return book;
    }

    public static Book updateBook(Long id, Book book) {
        book.setId(id);
        bookMap.put(id, book);
        return book;

    }

    public static Book deleteBook(Long id) {
        return bookMap.remove(id);
    }

    public static void deleteAllBooks() {
        bookMap.clear();
    }

    public static List<Book> addListOfBooks(List<Book> bookList) {

        for(Book book: bookList) {
            addBook(book);
        }
        return getAllBooks();
    }
}

