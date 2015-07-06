package java_jpa_part2;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import model.DemoCustomer;
import org.junit.Test;

public class CustomerTest {

	@Test
	public void customerTest() {

		//First create entity manager
				EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();

				try
				{
					//create the object and fill it with an object from the db at the same time
					DemoCustomer cust = em.find(DemoCustomer.class,1);//find by primary key of 1
					assertEquals(2,cust.getCustomerId());
					//System.out.println(cust.getCustFirstName());
					//System.out.println(cust.getCustLastName());
					//System.out.println(cust.getCustCity());
					//System.out.println(cust.getCustState());
				} finally
				{
					em.close();//to free up the memory
				}	
		
	}

}
