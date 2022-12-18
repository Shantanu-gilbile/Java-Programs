import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

public class MyConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //MyConnection.insertRecord();
        //MyConnection.updateRecord();
        //MyConnection.deleteRecord();
        //MyConnection.showRecord();
    }

    static public Connection getConnection() throws ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3305/dbzensar", "root", "shantanu");

        } catch (SQLException e) {
            System.out.println(e);

        }
        return con;
    }

    static public void insertRecord() throws ClassNotFoundException, SQLException {

        Connection con = MyConnection.getConnection();

        // java.sql.Statement stmt = con.createStatement();
        String sql = "insert into employee values (6,'Nikhil',80)";
        java.sql.PreparedStatement pstmt = con.prepareStatement(sql);

        int i = pstmt.executeUpdate();

        if (i > 0) {
            System.out.println(i + " row inserted Successfully");
        } else {
            System.out.println("No row affected.");
        }
    }

    static public void updateRecord() throws ClassNotFoundException, SQLException {

        Connection con = MyConnection.getConnection();

        // java.sql.Statement stmt = con.createStatement();
        String sql = "update employee set ename = 'Amit' where eid = 2";
        java.sql.PreparedStatement pstmt = con.prepareStatement(sql);

        int i = pstmt.executeUpdate();

        if (i > 0) {
            System.out.println(i + " row Updated Successfully");
        } else {
            System.out.println("No row affected.");
        }
    }

    static public void deleteRecord() throws ClassNotFoundException, SQLException {

        Connection con = MyConnection.getConnection();

        // java.sql.Statement stmt = con.createStatement();
        String sql = "delete from employee where eid = 5";
        java.sql.PreparedStatement pstmt = con.prepareStatement(sql);

        int i = pstmt.executeUpdate();

        if (i > 0) {
            System.out.println(i + " row Deleted Successfully");
        } else {
            System.out.println("No row affected.");
        }
    }


    static public void showRecord() throws ClassNotFoundException, SQLException {

        Connection con = MyConnection.getConnection();

        // java.sql.Statement stmt = con.createStatement();
        String sql = "select * from employee";
        java.sql.PreparedStatement pstmt = con.prepareStatement(sql);

        ResultSet result =  pstmt.executeQuery(sql);
        do{
            int eid = result.getInt(1);
            String ename = result.getString(2);
            double salary = result.getDouble(3);

            System.out.println(eid+" "+ename+" "+salary);

        }while(result.next());

        int i = pstmt.executeUpdate();

        if (i > 0) {
            System.out.println(i + " row Showed Successfully");
        } else {
            System.out.println("No row affected.");
        }
    }



}