package com.jbs.second_springbootv1.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.jbs.second_springbootv1.model.Book;
@Service
public class BookServiceImpl implements BookService{
	HashSet<Book> bookList=new HashSet<>();
	@Override
	public HashSet<Book> findAllBooks() {
		if(bookList.isEmpty()) {
			return null;
		}else {
			return bookList;
		}
		
	}

	@Override
	public Book findById(long bookid) {
		Book book=bookList.stream().filter(b->b.getBookid()==bookid).findAny().orElse(null);
		return null;
	}

	@Override
	public void addBook(Book b) {
		bookList.add(b);
		
	}

	@Override
	public void deleteAllBooks() {
		bookList.clear();
		
	}

}