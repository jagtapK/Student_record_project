package comPractice.Student_Record_Management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import studentManagement.Entity.Students;
import studentManagement.Utility.StudentManagementUtility;

public class DeleteSingleData {

	public void deleteData() {
		
		SessionFactory factory = StudentManagementUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		Students st = session.find(Students.class, 600);
//		session.remove(st);
		
		Students s = session.find(Students.class, 2);
		s.setName("Don");
		s.setMarks(99);
		s.setCources(" Etc ");
		s.setEmail(" Don@gmail.com");
		
		session.remove(s);
		
		transaction.commit();
		session.close();
	}
}
