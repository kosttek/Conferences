package test;
 
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 //zbyszek komituje kurwa
@Entity(name = "person")
public class Person {
    @Id
 //   @SequenceGenerator(name = "word_id", sequenceName = "word_word_id_seq", allocationSize = 1)
    @GeneratedValue //(strategy = GenerationType.IDENTITY) //to niby mialo pomoc  
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
//    @SequenceGenerator(name = "person_seq", sequenceName = "person_seq")
    private int id;
    private String first_name;
    private char middle_initial;
    private String last_name;
    @Column(updatable = true, name = "street_address1", nullable = false, length=50)
    private String streetAddress1;
    private String street_address2;
    private String city;
    private String state;
    private String zip;
    private Date date;
 
    public Person() {
    }
 
    public Person(final String fn, final char mi, final String ln,
            final String sa1, final String sa2, final String city,
            final String state, final String zip,final Date date) {
        setFirstName(fn);
        setMiddleInitial(mi);
        setLastName(ln);
        setStreetAddress1(sa1);
        setStreetAddress2(sa2);
        setCity(city);
        setState(state);
        setZip(zip);
        setDate(date);
    }
//    public Person(final String fn) {
//        setFirstName(fn);
//    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(final String city) {
        this.city = city;
    }
 
    public String getFirstName() {
        return first_name;
    }
 
    public void setFirstName(final String firstName) {
        this.first_name = firstName;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(final int id) {
        this.id = id;
    }
 
    public String getLastName() {
        return last_name;
    }
 
    public void setLastName(final String lastName) {
        this.last_name = lastName;
    }
 
    public char getMiddleInitial() {
        return middle_initial;
    }
 
    public void setMiddleInitial(final char middleInitial) {
        this.middle_initial = middleInitial;
    }
 
    public String getState() {
        return state;
    }
 
    public void setState(final String state) {
        this.state = state;
    }
 
    public String getStreetAddress1() {
        return streetAddress1;
    }
 
    public void setStreetAddress1(final String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }
 
    public String getStreetAddress2() {
        return street_address2;
    }
 
    public void setStreetAddress2(final String streetAddress2) {
        this.street_address2 = streetAddress2;
    }
 
    public String getZip() {
        return zip;
    }
 
    public void setZip(final String zip) {
        this.zip = zip;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}