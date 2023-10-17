package MiHexagonal.db_driven_adapter.domain;

import javax.persistence.*;

import MiHexagonal.core.domain.Book;

@Entity
public class BookEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;

	@Column(name = "name")

	private String name;

	   
	//constructors //getters and setters 
	   

	public Book toBook(){

	return new Book(this.id, this.name);   

	}
}
