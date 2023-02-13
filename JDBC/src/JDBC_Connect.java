import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class JDBC_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","Nrifintech@123");
				System.out.println("hello");
			}catch(Exception e) {
				System.out.println(e);
			}
//		try{  
//			//step1 load the driver class  
//		//	Class.forName("oracle.jdbc.driver.OracleDriver");  
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			//step2 create  the connection object  
//			Connection con=DriverManager.getConnection(  
//			"jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","Nrifintech@123");  
//			  
//			//step3 create the statement object  
//			Statement stmt=con.createStatement();  
//			  
//			//step4 execute query  
//			ResultSet rs=stmt.executeQuery("select * from Department");  
//			while(rs.next())  
//			  System.out.println(rs.getInt("deptId")+"  "+rs.getString("deptName")); 
//			  
//			//step5 close the connection object  
////			con.close();  
//			  
//			}catch(Exception e){ 
//				System.out.println(e);
//			}  
//			
//			 
	}
}


