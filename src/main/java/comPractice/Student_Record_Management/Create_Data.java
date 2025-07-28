package comPractice.Student_Record_Management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import studentManagement.Entity.Documents;
import studentManagement.Entity.Students;
import studentManagement.Utility.StudentManagementUtility;

public class Create_Data {

	public void AddDetails() {

		SessionFactory factory = StudentManagementUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		// Add Student and Document Details
		Documents doc = new Documents();
		doc.setAdharNo(6745423);
		doc.setPanNo("gdhfehvxjha");
		doc.setUsername("Saas");

		Students stu = new Students();
		stu.setName("Don");
		stu.setEmail("Don@gmail.com");
		stu.setCources("Etc");
		stu.setMarks(90);
		stu.setDocument(doc);

		session.persist(stu);

		transaction.commit();
		session.close();

		System.out.println("Student " + " Added Successfully in Database\n ");

	}
}
