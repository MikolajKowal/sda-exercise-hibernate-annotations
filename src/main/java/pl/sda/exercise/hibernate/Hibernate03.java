package pl.sda.exercise.hibernate;

import pl.sda.exercise.hibernate.service.BookService;

/**
 * Exercise 03: get book by id
 */
public class Hibernate03 {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		int id = 3;
		System.out.println("Book by id:" + bookService.getBookById(id));
	}

}
