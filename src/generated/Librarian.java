package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Librarian {

	@XmlAttribute
	private String librarianName = "";
	private int librarianAge;
	private double librarianSalary;
	
	Librarian(){}
	
	Librarian(String librarianName, int librarianAge, double librarianSalary){
		this.librarianName = librarianName;
		this.librarianAge = librarianAge;
		this.librarianSalary = librarianSalary;
	}
	
	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public int getLibrarianAge() {
		return librarianAge;
	}

	public void setLibrarianAge(int librarianAge) {
		this.librarianAge = librarianAge;
	}

	public double getLibrarianSalary() {
		return librarianSalary;
	}

	public void setLibrarianSalary(double librarianSalary) {
		this.librarianSalary = librarianSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
