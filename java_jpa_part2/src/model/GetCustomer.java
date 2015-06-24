package model;

import javax.persistence.EntityManager;

public class GetCustomer {

	public static void main(String[] args) {
		//First create entity manager
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		
		//Now, create object
		try
		{
			//create the object and fill it with an object from the db at the same time
			DemoCustomer cust = em.find(DemoCustomer.class,1);//find by primary key of 1
			System.out.println(cust.getCustFirstName());
			System.out.println(cust.getCustLastName());
			System.out.println(cust.getCustCity());
			System.out.println(cust.getCustState());
		} finally
		{
			em.close();//to free up the memory
		}

	}

}
