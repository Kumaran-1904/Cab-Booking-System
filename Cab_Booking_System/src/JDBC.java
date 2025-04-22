import java.sql.*;
public class JDBC {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:mysql://localhost:3306/test_db";
        String username="root";
        String password="12345";
        String query= "select * from user";

        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(query);


        rs.next();

        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
        System.out.println(rs.getString(3));
        System.out.println(rs.getString(4));
        System.out.println(rs.getString(5));

        con.close();
    }
}
