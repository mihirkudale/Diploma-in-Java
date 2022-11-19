

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class One {
public static void main(String[] args) {
	
	Configuration cfg =  new Configuration();
	
	cfg.configure("Stud.cfg.xml");
	
	SessionFactory sf =  cfg.buildSessionFactory();
	
	Session s =sf.openSession();
	
	Transaction t =s.beginTransaction();
	
	Stud std = new Stud();
//	std.setRollno(333);
//	std.setName("ABC");
//	std.setMarks(85);
//	
//	s.save(std);
//	t.commit();
	
//	Query q = s.createQuery("from Stud where rollno=:Rollno");
//	q.setParameter("Rollno", 111);
//	Stud temp = (Stud) q.uniqueResult();
//	s.delete(temp);
//	t.commit();

//   Query q = s.createQuery("from Stud where rollno=:Rollno");
//   q.setParameter("Rollno", 222);
//   Stud temp = (Stud) q.uniqueResult();
//   temp.setName("PQR");
//   temp.setMarks(85);
//   s.update(temp);
//   t.commit();
	
	Query q = s.createQuery("from Stud");
	List<Stud> l = q.list();
	for(Stud std1 : l)
	{
		System.out.println(std1.getRollno());
		System.out.println(std1.getName());
		System.out.println(std1.getMarks());
	}
	t.commit();
   
   
	s.close();
	sf.close();
	
	System.out.println("END");
}
}
