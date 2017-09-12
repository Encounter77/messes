package com.ex.DI;

public class BookDaoImpl implements BookDao {

	@Override
	public void save() {
		System.out.println("book is saved");
	}

}
