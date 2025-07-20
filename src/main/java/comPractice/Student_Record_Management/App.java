package comPractice.Student_Record_Management;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
      System.out.println("Student_record_management");
      
  	System.out.println("Choose an option:" + "\n1. Add New Student" + "\n2.get Student_ID "
			+ "\n3. Delete Single Data" + "\n4. view All Students" + "\n5.Update Student Data" + "\n6.Exit");
    	
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Enter your Choice");

  	int choice = sc.nextInt();
  	sc.nextLine();
  	
  	switch(choice) {
  	
  	case 1:
  		Add_a_student ad = new Add_a_student();
        ad.addStudent();
  		break;
  	
  	case 2:
  		GetStudentByID gd = new GetStudentByID();
    	gd.GetByID();
  		
  	case 3:
  		DeleteSingleData dd = new DeleteSingleData();
    	dd.deleteData();
    
  	case 4:
  		viewAllStudents vs = new viewAllStudents();
    	vs.allStudent();
    	
  	case 5:
  		UpdateStudentData ud = new UpdateStudentData();
    	ud.updateData();
    	
  	case 6:
  		System.out.println("Exiting program. Goodbye!");
		System.exit(0); // Terminates the program immediately
		break;
  	}
}
}