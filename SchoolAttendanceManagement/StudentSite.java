package attendancesystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentSite extends JDBCConnect{

	static Scanner scan=new Scanner(System.in);
	static HashMap<Integer,String> studentlog=new HashMap<>();
	static ArrayList<LeaveApply> leaveApply =new ArrayList<>();
	static ArrayList<StudentSite>  studentPortal=new ArrayList<>();
	static ArrayList<Integer> studentId=new ArrayList<>();

	public  void studentLogin() throws ClassNotFoundException, SQLException
	{
		boolean bool =true;
		byte option=0;
		int id=0;
		String password="";
		f1:while(bool)
		{
			System.out.println("Enter the student id");
			id=scan.nextInt();
			while(studentlog.containsKey(id))
			{
				System.out.println("Enter the password");
				password=scan.next();
				if(studentlog.get(id).equals(password))
				{
					System.out.println("Student Login successfully");
					bool=false;
					break f1;
				}
				else System.out.println("Enter the corect password");

			}
			System.out.println("Enter the correct id");
		}  
		bool=true;
		while(bool)
		{
			System.out.println();
			System.out.println("View Your Profile             Press 1");
			System.out.println("View attendance History       Press 2");
			System.out.println("Leave Apply                   Press 3");
			System.out.println("Exit                          Press 4");
			option =scan.nextByte();
			if(option==4)return;
			switch(option)
			{
			case 1:viewProfile(id);
			break;
			case 2:viewAttendanceHistory(id);
			break;
			case 3:leaveApply(id);
			break;
			}
			System.out.println();
		}
	}
	public  void viewProfile(int id) throws ClassNotFoundException, SQLException
	{

		Statement statement=jdbcConnection();
		ResultSet result=statement.executeQuery("select * from schoolstudent where studentid="+id);
		result.next();
		System.out.println("Student Id:   "+result.getInt(1));
		System.out.println("Student Name: "+result.getString(2));
		System.out.println("Student Dob:  "+result.getString(3));
		System.out.println();
		statement.close();
		result.close();

	}
	public  void viewAttendanceHistory(int id) throws ClassNotFoundException, SQLException
	{
		Statement statement=jdbcConnection();
		System.out.println();
		ResultSet result=statement.executeQuery("select * from schoolattendance where enrollid="+id);
		while(result.next())
		{
			System.out.println("Attend no:"+result.getInt(1)+" StudentId:"+result.getInt(2)
			+" Date:"+result.getString(3)+" Status:"+result.getString(4)+" Total Leaves:"+result.getInt(5)
			+" leave Permit:"+result.getInt(6));
			System.out.println();
		}
		statement.close();
		result.close();

	}
	public  void leaveApply(int id) throws ClassNotFoundException, SQLException
	{
		System.out.println("Enter how many days you want");
		int total=scan.nextInt();

		LeaveApply checkLeave=leaveApply.get(id-10101);
		if(checkLeave.studentid!=id) {System.out.println("Enter the corect");return;}
		Statement statement=null;
		if((checkLeave.totalLeave+total)<=checkLeave.remainingLeave)
		{

			 statement=jdbcConnection();
			int result=statement.executeUpdate("update schoolattendance set totalleaves="+checkLeave.totalLeave+total+" where enrollid="+id);
			checkLeave.totalLeave=total;
			System.out.println("Permission granted");
			System.out.println();
		}
		else
		{
			System.out.println("Already your leave compleated");
		}
		statement.close();
	}
	public void setAttendance(String date) throws ClassNotFoundException, SQLException
	{

		Statement st=jdbcConnection();
		String status[]=new String[studentId.size()];
		byte option=0;

		for( int i=0;i<studentId.size();i++)
		{
			System.out.println("The ID Number:"+studentId.get(i)+" if present Press 1 else 0");
			option=scan.nextByte();
			if(option==1)
			{
				status[i]="Present";
			}
			else status[i]="Absent";
			int count=st.executeUpdate("insert into schoolattendance(enrollid,atdate,Astatus)"
					+ "  values("+studentId.get(i)+",'"+date+"','"+status[i]+"')");

		}

		System.out.println("Success Fully Completed");

	}
	public  void studentStart() throws ClassNotFoundException, SQLException
	{

		Statement statement=jdbcConnection();

		ResultSet result=statement.executeQuery("select * from schoolstudent");
		while(result.next())
		{
			studentlog.put(result.getInt(1), result.getString(4));
			studentId.add(result.getInt(1));
		}
		result=statement.executeQuery("select * from schoolattendance");
		while(result.next())
		{
			leaveApply.add(new LeaveApply(result.getInt(2), result.getInt(5), result.getInt(6)));
		}
		statement.close();
		result.close();
	}
}
class LeaveApply
{
	int studentid;
	int totalLeave;
	int remainingLeave;
	public LeaveApply(int id,int totalLeave,int remainingleave)
	{
		this.studentid=id;
		this.totalLeave=totalLeave;
		this.remainingLeave=remainingleave;
	}
}