import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("Employee.cfg.xml");
		
	
		@SuppressWarnings("deprecation")
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		Employee emp =new Employee();
		emp.setId(122);
		emp.setName("XYZ");
		emp.setSalary(100000);
		
		s.save(emp);
	    t.commit();
		
		s.close();
		sf.close();
		
		System.out.println("END");

	}

}
