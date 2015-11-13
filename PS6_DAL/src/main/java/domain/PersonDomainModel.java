package domain;


import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import util.LocalDateAdapter;

public class PersonDomainModel {

	protected  UUID PersonID;
    protected  String FirstName;
    protected  String LastName;
    protected  String Street;
    protected  Integer PostalCode;
    protected  String City;
    protected  Date Birthday;
    
    /**
	 * Person - This constructor will generate a new instance of Student.
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param dOB
	 */
	public PersonDomainModel()
	{
		this.PersonID = UUID.randomUUID();
		this.PostalCode = 0;
	}
    
    public UUID getPersonID() {
		return PersonID;
	}

	public void setPersonID(UUID personID) {
		PersonID = personID;
	}


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(Integer PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public Date getBirthday() {
    	return Birthday;
    }
    
    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }
    

}