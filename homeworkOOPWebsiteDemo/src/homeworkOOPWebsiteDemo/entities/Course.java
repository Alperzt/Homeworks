package homeworkOOPWebsiteDemo.entities;

public class Course{
	private String name;
	private String description;
	private Instructor instructor;
	private double price;
	private String photo;
	private Category category;
	
	public Course(String name, String description, Instructor instructor, double price, String photo, Category category) {
		super();
		this.name = name;
		this.description = description;
		this.instructor = instructor;
		this.price = price;
		this.photo = photo;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
