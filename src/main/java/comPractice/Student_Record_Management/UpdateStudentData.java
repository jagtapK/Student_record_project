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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Updated Student Name");
		int student_id = sc.nextInt();
		sc.nextLine();
		
		Students s1 = session.find(Students.class, student_id);
		
		String stuName = sc.nextLine();
		s1.setName(stuName);
		
		transaction.commit();
		
		session.close();
	}
}
