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
	
	// 3. Transaction from session
	Transaction transaction = session.beginTransaction();
	
	// 4.write your logic here
	Students st = session.find(Students.class, 1);
	System.out.println(st.toString());
	
	 // 5.pass to database
	transaction.commit();
	
	 // 6.session close
	session.close();
	
}


}
