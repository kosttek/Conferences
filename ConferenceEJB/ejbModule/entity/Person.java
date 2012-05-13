package entity;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 
@Entity
public class Person {
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY) //to niby mialo pomoc  
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
//    @SequenceGenerator(name = "person_seq", sequenceName = "person_seq")
    private int id;
    private String first_name;
    private char middle_initial;
    private String last_name;
    private String street_address1;
    private String street_address2;
    private String city;
    private String state;
    private String zip;
 
    public Person() {
    }
 
    public Person(final String fn, final char mi, final String ln,
            final String sa1, final String sa2, final String city,
            final String state, final String zip) {
        setFirstName(fn);
        setMiddleInitial(mi);
        setLastName(ln);
        setStreetAddress1(sa1);
        setStreetAddress2(sa2);
        setCity(city);
        setState(state);
        setZip(zip);
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
        return street_address1;
    }
 
    public void setStreetAddress1(final String streetAddress1) {
        this.street_address1 = streetAddress1;
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
}