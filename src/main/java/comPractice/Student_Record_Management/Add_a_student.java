package comPractice.Student_Record_Management;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import studentManagement.Entity.Students;
import studentManagement.Utility.StudentManagementUtility;

public class Add_a_student {

	public void addStudent() {
		
		//1.session Factory
    	SessionFactory factory = StudentManagementUtility.getSessionFactory();
      
        //2. session from session factory
    	Session session = factory.openSession();
        
        //3.Transaction from session
    	Transaction transaction = session.beginTransaction();
    	
		
		Students s = new Students();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID: ");
		
		s.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("enter Student name: ");
		s.setName(sc.nextLine());
		
		System.out.println("Enter student email: ");
		s.setEmail(sc.nextLine());
		
		System.out.println("Enter Student Cource");
		s.setCources(sc.nextLine());
		
		System.out.println("Enter Student Marks");
		s.setMarks(sc.nextInt());
		
		
		//4.save process
    	session.persist(s);
    	
    	System.out.println("Updated Successfully " + s);
    	//5.pass to database
    	transaction.commit();
    	
		
	}
	

}
