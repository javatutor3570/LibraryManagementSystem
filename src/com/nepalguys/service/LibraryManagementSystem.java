package com.nepalguys.service;

import com.nepalguys.model.Book;

public interface LibraryManagementSystem {
    Book boorrowBook(Book b);
    void returnBook(Book b);
}
