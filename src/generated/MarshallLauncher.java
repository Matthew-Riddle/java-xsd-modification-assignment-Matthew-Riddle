package generated;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import generated.Book.Authors;

public class MarshallLauncher {

	public static void main(String[] args) {
		Library lib = new Library();
		ArrayList<Author> auth = new ArrayList<Author>();
		Author authors = new Author();
		Author authors2 = new Author();
		Librarian librarian = new Librarian("Janice", 59, 5000.00);
		
		lib.setLibraryAddress("l33t st. Memphis, TN");
		lib.setLibraryName("Haxorz");
		
		lib.addLibrarian(librarian);
		
		authors.setFirstName("Matthew");
		authors.setLastName("Riddle");
		
		auth.add(authors);
		
		authors2.setFirstName("Butch");
		authors2.setLastName("SlamChest");
		
		auth.add(authors2);
		
		
		Book book = new Book();
		
		book.authors = new Authors();
		book.authors.author = auth;
		
		book.title = "How to lose your job in 10 days";
		try {
			book.date = getXMLGregorianCalendarNow();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		book.genre = "Reality";
		
		
		
		
		lib.addBook(book);
		
		try {
			JAXBContext context = JAXBContext.newInstance(Library.class);
			Marshaller marshaller = context.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			marshaller.marshal(lib, new File("library.xml"));
			
			//XSDGenerator generator = new XSDGenerator();
			
			try {
				context.generateSchema(new XSDGenerator());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
	
	public static XMLGregorianCalendar getXMLGregorianCalendarNow() 
            throws DatatypeConfigurationException
    {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = 
            datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        return now;
    }

}
