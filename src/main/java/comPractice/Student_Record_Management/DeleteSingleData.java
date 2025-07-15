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
		
		Students st = session.find(Students.class, 501);
		session.remove(st);
		
		transaction.commit();
		session.close();
	}
}
