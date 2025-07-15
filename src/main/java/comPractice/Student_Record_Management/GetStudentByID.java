package comPractice.Student_Record_Management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import studentManagement.Entity.Students;
import studentManagement.Utility.StudentManagementUtility;

public class GetStudentByID {

public void GetByID() {
	
	//1/session factory
	SessionFactory factory = StudentManagementUtility.getSessionFactory();
	
	//2. session from session factory
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
	Students st = session.find(Students.class, 600);
	System.out.println(st.toString());
	
	transaction.commit();
	session.close();
	
}


}
