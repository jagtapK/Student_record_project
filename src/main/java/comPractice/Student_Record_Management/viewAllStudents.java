package comPractice.Student_Record_Management;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import studentManagement.Entity.Students;
import studentManagement.Utility.StudentManagementUtility;

public class viewAllStudents {
	
	public void allStudent() {
		
		SessionFactory factory = StudentManagementUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		List<Students> allstudent = session.createQuery("Select s from Students s", Students.class).getResultList();
		allstudent.stream().forEach(k -> System.out.println(k.toString()));
		
		transaction.commit();
		session.close();
	}
}
