package com.arraylistpract;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
	private int bookid;
	private String bookname, aname;
	private int price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookid, String bookname, String aname, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.aname = aname;
		this.price = price;
	}
	
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", aname=" + aname + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1,"war","suraj",2300);
		Book b2 = new Book(2,"loap","abhishek",2900);
		Book b3 = new Book(3,"caeos","ram",2700);
		Book b4 = new Book(4,"wheel","abhishek",2400);
		Book b5 = new Book(5,"games","ram",6700);
		
		ArrayList<Book>list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		for (int i=0; i<list.size(); i++) {
			int count=0;
			for (int j=0; j<list.size(); j++) {
				if(list.get(i).aname.equals(list.get(j).aname)&&j<i) 
					break;
				
				if(list.get(i).aname.equals(list.get(j).aname))
					count++;
			}
			if (count>0)
			System.out.println(list.get(i).aname +" : "+count );
		}
		
		
		
	}

}
