package comPractice.Student_Record_Management;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import studentManagement.Entity.Students;
import studentManagement.Utility.StudentManagementUtility;

public class UpdateStudentData {

	public void updateData() {
		
		SessionFactory factory = StudentManagementUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter StudentId");
//		int student_id = sc.nextInt();
//		sc.nextLine();
//		
//		Students s1 = session.find(Students.class, student_id);
//		
//		System.out.println("Enter Student Name");
//		String stuName = sc.nextLine();
//		s1.setName(stuName);
		
		
		Students s = session.find(Students.class, 1);
		s.setName("kajal");
		s.setMarks(99);
		s.setCources("Developer");
		s.setEmail("kajal@gmail.com");
		
		s.getDocument().setPanNo("asdncknn");
        
		transaction.commit();
		session.close();
	}
}
