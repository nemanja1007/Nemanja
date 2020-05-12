package Webshop;

import java.io.File;

public class Item {

	String name;
	String owner;
	String description;
	int id;
	File image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public Item(String name, String owner, String description, int id) {
		super();
		this.name = name;
		this.owner = owner;
		this.description = description;
		this.id = id;
	}

}
