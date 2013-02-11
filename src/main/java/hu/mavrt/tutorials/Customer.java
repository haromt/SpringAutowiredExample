package hu.mavrt.tutorials;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooToString

public class Customer {

	@Autowired
	@Qualifier("dancsi")
	private Person person;

	@Autowired
	private Location location;

}
