import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One 
{

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("Stud.cfg.xml");
		
	
		@SuppressWarnings("deprecation")
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		/*Stud std=new Stud();
		std.setRollno(231);
		std.setName("XYZ");
		std.setMarks(77);
		
		s.save(std);
	    t.commit();*/
		
		
		Query q=s.createQuery("from Stud where rollno=:Rollno");
		q.setParameter("Rollno", 1);
		Stud temp=(Stud) q.uniqueResult();
		temp.setName("PQR");
		temp.setMarks(85);
		s.update(temp);
		t.commit();
		
		s.close();
		sf.close();
		
		System.out.println("END");

	}

}
