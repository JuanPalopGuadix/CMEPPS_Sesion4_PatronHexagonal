package MiHexagonal.core.domain;

public class Book {
	private Long id;
    private String name;
    
	public Book(long ID, String NAME) {
		super();
		this.id = ID;
		this.name=NAME;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
   
}
