package com.galvanize.tmo.paspringstarter.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.galvanize.tmo.paspringstarter.model.Book;


public class BookService {

    private static Map<Long, Book> bookMap = new HashMap<>();
    private static Long index = 0L;

    /*
     * static { Book book1 = new Book(1L, "Douglas Adams",
     * "The Hitchhiker's Guide to the Galaxy", "1979"); Book book2 = new Book(2L,
     * "Philip K. Dick", "Do Androids Dream of Electric Sheep?", "1968"); Book book3
     * = new Book(3L, "William Gibson", "Neuromancer", "1984");
     *
     * bookMap.put(1L, book1); bookMap.put(2L, book2); bookMap.put(3L, book3); }
     */

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

//
//
//{
//    books: [
//                {
//                    "id": 2,
//                    "author": "Philip K. Dick",
//                    "title": "Do Androids Dream of Electric Sheep?",
//                    "yearPublished": 1968
//                },
//                {
//                    "id": 3,
//                    "author": "William Gibson",
//                    "title": "Neuromancer",
//                    "yearPublished": 1984
//                },
//                {
//                    "id": 1,
//                    "author": "Douglas Adams",
//                    "title": "The Hitchhiker's Guide to the Galaxy",
//                    "yearPublished": 1979
//                }
//    ]
//}