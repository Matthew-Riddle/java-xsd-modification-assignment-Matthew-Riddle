package generated;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Library {

	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Librarian> librarian = new ArrayList<Librarian>();
	
	private String libraryName = "";
	private String libraryAddress = "";
	
	
	Library(){ }
	
	Library(String libraryName, String libraryAddress, ArrayList<Book> books, ArrayList<Librarian> librarian){
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.books = books;
		this.librarian = librarian;
	}
	
	public ArrayList<Book> getLibrary() {
		return books;
	}




	public ArrayList<Librarian> getLibrarian() {
		return librarian;
	}




	public String getLibraryName() {
		return libraryName;
	}




	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}




	public String getLibraryAddress() {
		return libraryAddress;
	}



	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}

	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public void addLibrarian(Librarian librarian) {
		this.librarian.add(librarian);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
