package com.book;
import java.util.*;

public class BookStore {
	List<Book>BooksList=new ArrayList<Book>();
	public void addBook(Book b)
	{
		BooksList.add(b);
	}
	public List<Book> searchByTitle(String title)
	{
		List<Book> selectedList=new ArrayList<Book>();
		for(Book b:BooksList) 
		{
			if(b.getTitle().equals(title))
			{
				selectedList.add(b);
			}
		}
		return  selectedList;
	}
	public List<Book> searchByAuthor(String author)
	{
		List<Book> selectedList=new ArrayList<Book>();
		for(Book b:BooksList)
		{
			if(b.getAuthor().equals(author))
			{
				selectedList.add(b);
			}
		}
		return selectedList ;
		
	}
	public void display(List<Book> BooksList)
	{
		System.out.println("Books are:");
		System.out.println("---------------------------------------------------------");
		System.out.println("    BookID     Title    Author    Category    Price     ");
		for(Book b:BooksList)
		{
			System.out.println(b.getBookId()+"       "+b.getTitle()+"      "+b.getAuthor()+"    "+b.getCategory()+"     "+b.getPrice());
		}
		
	}
	public void displaybyId(String bookId)
	{
		System.out.println("    BookID     Title    Author    Category    Price     ");
		for(Book b:BooksList)
		{
			if(b.getBookId().equals(bookId))
			{
				System.out.println(b.getBookId()+"     "+b.getTitle()+"   "+b.getAuthor()+"     "+b.getCategory()+"    "+b.getPrice());
				
			}
		}
		
	}
	public void displayAll()
	{
		System.out.println("Books are:");
		System.out.println("---------------------------------------------------------");
		System.out.println("    BookID     Title    Author    Category    Price     ");
		for(Book b:BooksList)
		{
			System.out.println(b.getBookId()+"       "+b.getTitle()+"      "+b.getAuthor()+"    "+b.getCategory()+"     "+b.getPrice());
		}
		
	}
	public void deleteBook(String bookId)
	{
	 Iterator<Book>itr=BooksList.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getBookId().equals(bookId)) {
				itr.remove();
			}
		}
	}
	public boolean modifyBook(String bookId)
	{
	    int c=0;
	    for(Book b:BooksList)
	    {
	    	if(b.getBookId().equals(bookId))
	    	{
	    		c=c+1;
	    	}
	    }
	    if(c>0)
	    {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	

}

