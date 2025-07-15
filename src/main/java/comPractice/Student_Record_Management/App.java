package comPractice.Student_Record_Management;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	
//    	//1.session Factory
//    	SessionFactory factory = StudentManagementUtility.getSessionFactory();
//      
//        //2. session from session factory
//    	Session session = factory.openSession();
//        
//        //3.Transaction from session
//    	Transaction transaction = session.beginTransaction();
    	
//    	Add_a_student ad = new Add_a_student();
//    	ad.addStudent();
    	
//    	GetStudentByID gd = new GetStudentByID();
//    	gd.GetByID();
    	
//    	DeleteSingleData dd = new DeleteSingleData();
//    	dd.deleteData();
    	
//    	viewAllStudents vs = new viewAllStudents();
//    	vs.allStudent();
        
    	
    	UpdateStudentData ud = new UpdateStudentData();
    	ud.updateData();
//    	//4.save process
//    	session.persist(ad);
//    	
//    	//5.pass to database
//    	transaction.commit();
//    	
//    	// 6.close
//    	session.close();
    }
}
