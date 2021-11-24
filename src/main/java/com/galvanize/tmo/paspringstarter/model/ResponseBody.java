package com.galvanize.tmo.paspringstarter.model;

import com.galvanize.tmo.paspringstarter.controller.BookController;

import java.util.List;

public class ResponseBody {

    public ResponseBody() {
        // TODO Auto-generated constructor stub
    }

    private List<Book> books = null;

    /**
     * @return the books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(List<Book> books) {
        books.sort(new BookController.bookSorter());
        this.books = books;
    }



}
