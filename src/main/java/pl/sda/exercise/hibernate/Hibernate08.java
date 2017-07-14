package pl.sda.exercise.hibernate;

import pl.sda.exercise.hibernate.service.BookService;

/**
 * Exercise 08: author for books
 */
public class Hibernate08 {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		System.out.println("Books:");
		bookService.getBooks()
		.forEach(book -> System.out.println(book + "; " + book.getBookAuthor()));
	}

}
