package com.kodnest.cmposition;

class Book {
	Page page;
	public Book(String content) {
		this.page =new Page(content);
	}
	
	void readpage() {
		System.out.println("reading the page");
		page.displaycontent();
	}
	
	
	class Page{
		String content;
		public Page(String content) {
			this.content = content;
		}
		void displaycontent() {
			System.out.println("content");
			
		}
	}
}



public class CompositionDemo {
	public static void main(String[] args) {
		Book b= new Book("reading.....");
	   b.readpage();
	   b=null;
	}
	
}





