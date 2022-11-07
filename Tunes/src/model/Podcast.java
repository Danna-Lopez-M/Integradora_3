package model;

public abstract class Podcast extends Audio {
	
	private String description;
	private Category category;
	
	public Podcast(String name, String url, double duration, int numReprod, String description, int category) {
		super(name, url, duration, numReprod);
		this.description = description;
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

	@Override
	public String toString() {
		return "Podcast [description=" + description + ", category=" + category + "]";
	}
	
	
	
}
