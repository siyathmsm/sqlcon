import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
 
public class dbcon {
    public static Connection c;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/databasename";
            String un = "root";
            String pw = "admin123";
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/databasename?useSSl=false","root","admin123");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void iud(String q) throws Exception{
        Statement s = c.createStatement();
        s.executeUpdate(q);
    }
    public static ResultSet search(String q) throws Exception{
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(q);
        return rs;
    }
}
