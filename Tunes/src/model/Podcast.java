package model;

public class Podcast extends Audio {
	
	private String description;
	private Category category;
	private String nameCC;
	
	public Podcast(String name, String url, double duration, String description, int category, String nameCC) {
		super(name, url, duration);
		this.description = description;
		this.nameCC = nameCC;
		this.category = Category.values()[category];
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String reproduce() {
		String msg = "";
		
		msg = "Reproducing the podcast ";
		
		return msg;
	}
	
	@Override
	public String toString() {
		return "Podcast [description=" + description + ", category=" + category + "]";
	}
	
	
}
