package comPractice.Student_Record_Management;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		// Switch case to handle Multiple Operations
		System.out.println("Student_record_management");

		System.out.println("Choose an option:" + "\n1. Add New Student" + "\n2.get Student_ID "
				+ "\n3. Delete Single Data" + "\n4. view All Students" + "\n5.Update Student Data" + 
				"\n6.Add Student Details" + "\n7.Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {

		case 1:
			//add new Students
			Add_a_student ad = new Add_a_student();
			ad.addStudent();
			break;

		case 2:
			//get students by their Id
			GetStudentByID gd = new GetStudentByID();
			gd.GetByID();

		case 3:
			//Delete Single Student Details
			DeleteSingleData dd = new DeleteSingleData();
			dd.deleteData();

		case 4:
			// View All Students 
			viewAllStudents vs = new viewAllStudents();
			vs.allStudent();

		case 5:
			//Update Student Details
			UpdateStudentData ud = new UpdateStudentData();
			ud.updateData();

		case 6:
			Create_Data c = new Create_Data();
			c.AddDetails();
			break;
			
		case 7:
			System.out.println("Exiting program. Goodbye!");
			System.exit(0); // Terminates the program immediately
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
		}
	}
}