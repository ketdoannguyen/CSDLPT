package ConnectionSQL;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author An Vi
 */
public class ConnectionSQLMain {
    private static String DB_URL = "jdbc:sqlserver://localhost:1444;"
            + "databaseName=QLTB;encrypt=true;trustServerCertificate=true;"
            + "integratedSecurity=true";
    private static String USER_NAME = "main";
    private static String PASSWORD = "main12345678";

   public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}

