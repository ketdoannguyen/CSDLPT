package ConnectionSQL;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author An Vi
 */
public class ConnectionSQLKhuK {
    private static String DB_URL = "jdbc:sqlserver://localhost:1455;"
            + "databaseName=QLTB;encrypt=true;trustServerCertificate=true;"
            + "integratedSecurity=true";
    private static String USER_NAME = "khuk";
    private static String PASSWORD = "khuk12345678";

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

