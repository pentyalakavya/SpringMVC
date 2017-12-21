package com.accenture.helloworldEx;

import org.springframework.beans.factory.annotation.Autowired;

public class BookStore {

@Autowired
private Book book;

public Book getBook() {
	return book;
}

public void setBook(Book book) {
	this.book = book;
}

public void display()
{
	System.out.println("Title:" +this.book.getTitle());
}
}
