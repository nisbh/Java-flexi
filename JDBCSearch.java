import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBCSearch{
    public static void main(String[] args){
        int targetRollNo=101;
        String url="jdbc:mysql://localhost:3306/collegeDB";
        String user="root",pass="root";
        try(Connection conn=DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM Student WHERE rollno = ?")){
            pstmt.setInt(1,targetRollNo);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                System.out.printf("Student Found! Roll No: %d, Name: %s\n", 
                                  rs.getInt("rollno"),rs.getString("name"));
            }else{
                System.out.println("Student with Roll Number "+targetRollNo+" not found.");
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}