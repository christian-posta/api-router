package org.example;

public class Product {

	private int id;
	private String artist;
	private String album;
	private int category;
	
	Product() {
		
	}
	
	Product(int id, String artist, String album, int category) {
		this.id = id;
		this.artist = artist;
		this.album = album;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
}
