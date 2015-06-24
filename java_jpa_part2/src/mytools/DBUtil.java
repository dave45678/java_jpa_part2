package mytools;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("java_jpa_part2");
	
	public static EntityManagerFactory getEmFactory(){
		return emf;
	}

}
