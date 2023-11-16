import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {
        try {

            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsysyem", "root", "123456");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}