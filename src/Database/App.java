package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author postgresqltutorial.com
 */
public class App {

    private String url = "jdbc:postgresql://localhost:5432/dvdrental";
    private String user = "postgres";
    private String password = "root";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}

