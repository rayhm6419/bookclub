package com.bookclub;


import org.junit.jupiter.api.Test;

import com.bookclub.model.Book;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void testBookProperties() {
        Book book = new Book();
        book.setIsbn("978-0134685991");
        book.setTitle("Effective Java");
        book.setDescription("A comprehensive guide to programming in Java.");
        book.setNumOfPages(416);
        book.setInfoUrl("https://example.com/effective-java");

        assertEquals("978-0134685991", book.getIsbn());
        assertEquals("Effective Java", book.getTitle());
        assertEquals("A comprehensive guide to programming in Java.", book.getDescription());
        assertEquals(416, book.getNumOfPages());
        assertEquals("https://example.com/effective-java", book.getInfoUrl());
    }
    @Test
    public void testToStringFormat() {
        Book book = new Book();
        book.setIsbn("978-0134685991");
        book.setTitle("Effective Java");
        book.setDescription("A comprehensive guide to programming in Java.");
        book.setNumOfPages(416);
        book.setInfoUrl("https://example.com/effective-java");

        String expected = String.format(
            "Book{isbn=%s, title=%s, description=%s, infoUrl=%s, numOfPages=%s}",
            book.getIsbn(), book.getTitle(), book.getDescription(), book.getInfoUrl(), book.getNumOfPages()
        );
        assertEquals(expected, book.toString());
    }
}


