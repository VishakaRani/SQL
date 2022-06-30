package project2;
import java.sql.SQLException;
import java.sql.ResultSet;
public class SQL {
	void getStudent() throws SQLException
	{
		String sql="select * from student";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getDate(4));
		}
	}
	void updateStudent() throws SQLException
	{
		String sql="update student set branch='cs' where sid=103 ";
		int b=st.executeUpdate(sql);
		//System.out.println(b);
		
			System.out.println(b+"  row affected");
	}
	void deleteStudent() throws SQLException
	{
		String sql="delete from student where sid=102";
		int i=st.executeUpdate(sql);
		System.out.println(i+"  row affected");
	}
	public void closeSession()
	{
		try { 
			  connection.close(); 
			  st.close();
			  } 
		  catch(Exception e) {
		  System.out.println(e); }  
	}
}
