package pl.sda.exercise.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="book")
@NamedQueries(value={
		@NamedQuery(name="ourQueryForAllBooks", query="from Book"),
		@NamedQuery(name="countBooksQuery", query="select count(*) from Book"),
		@NamedQuery(name="getById", query="from Book b where b.id = :id")
})
public class Book {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="title")
	private String title;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="author_id")
	private Author bookAuthor;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public Author getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(Author bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}
	
	
	
	
}
