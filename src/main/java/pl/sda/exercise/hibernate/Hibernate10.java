package pl.sda.exercise.hibernate;

import java.util.stream.Collectors;

import pl.sda.exercise.hibernate.service.BookService;

/**
 * Exercise 10: categories for books
 */
public class Hibernate10 {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		System.out.println("Books:");
		bookService.getBooks().forEach(book -> {
			System.out.println(book + "; " + book.getCategories()
					.stream().map(c -> c.getSetOfBooks().toString())
					.collect(Collectors.joining("; ")));
		});
	}

}
