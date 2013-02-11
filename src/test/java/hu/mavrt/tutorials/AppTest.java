package hu.mavrt.tutorials;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:appContext.xml" })
public class AppTest extends TestCase {

	private static Logger logger = Logger.getLogger(AppTest.class);

	@Autowired
	private Customer customer;

	@Test
	public void test() {
		assertNotNull(customer);
		assertEquals("Huszár", customer.getPerson().getSurename());
		logger.info(customer.toString());
	}
}
	