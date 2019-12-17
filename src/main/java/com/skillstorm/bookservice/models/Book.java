package com.skillstorm.bookservice.models;

import java.awt.image.BufferedImage;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="BOOKTAB")
public class Book {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="BOOK_ID")
		private int id;
		@Column(name="IMAGE")
		private Byte[] image;
		@Column(name="AUTHOR")
		private String author;
		@Column(name="TITLE")
		private String title;		
		@Column(name="PRICE")
		private double price;
		public Book () {};
		public Book(int id, Byte[] image, String title, String author, double price) {
			super();
			this.id = id;
			this.image = image;
			this.title = title;
			this.author = author;
			this.price = price;
		}
		public long getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Byte[] getImage() {
			return image;
		}
		public void setImage(Byte[] image) {
			this.image = image;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", image=" + image + ", title=" + title + ", author=" + author + ", price="
					+ price + "]";
		}	
}