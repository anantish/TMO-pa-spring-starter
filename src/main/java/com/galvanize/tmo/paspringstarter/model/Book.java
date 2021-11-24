package com.galvanize.tmo.paspringstarter.model;

public class Book {

    private Long id;
    private String author;
    private String title;
    private String yearPublished;



    public Book() {
        // TODO Auto-generated constructor stub
    }



    /**
     * @param id
     * @param author
     * @param title
     * @param yearPublished
     */
    public Book(Long id, String author, String title, String yearPublished) {
        super();
        this.id = id;
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }



    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }



    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }



    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }



    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }



    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }



    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }



    /**
     * @return the yearPublished
     */
    public String getYearPublished() {
        return yearPublished;
    }



    /**
     * @param yearPublished the yearPublished to set
     */
    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }



}
