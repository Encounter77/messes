package com.ex.DI;

public class BookServiceImpl implements BookService {
	private BookDao bookdao;
	
	public void setBookdao(BookDao bookdao) {
		this.bookdao = bookdao;
	}
	
	@Override
	public void add() {
		this.bookdao.save();
	}

}
