package com.jbs.second_springbootv1.model;

public class Book {
	private int bookid;
	private String title;
	private String author;
	public Book(int bookid, String title, String author) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
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
	public void setAuther(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + "]";
	}
}