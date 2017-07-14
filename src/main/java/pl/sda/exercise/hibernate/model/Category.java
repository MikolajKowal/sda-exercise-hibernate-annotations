package pl.sda.exercise.hibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer id;
	
	private String name;
	
	@Transient
	private String subcategory;
	
	@ManyToMany(mappedBy="categories", fetch=FetchType.EAGER)
	private Set<Book> setOfBooks;
	
	public Set<Book> getSetOfBooks() {
		return setOfBooks;
	}
	public void setSetOfBooks(Set<Book> setOfBooks) {
		this.setOfBooks = setOfBooks;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
