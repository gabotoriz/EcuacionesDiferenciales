package utc.mx.ecuacionesdiferenciales.DataBase;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class toDataBase {
    static Settings settings = Settings.getInstance();
    static Connection connection;
    static toDataBase instancia;

    public Connection getConnection() {
        try {
            Class.forName(settings.getDriver());
            connection = DriverManager.getConnection(settings.getURL(), settings.getUser(), settings.getPassword());
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void dropConnection() throws SQLException {
        try {
            connection.close();
        } catch (SQLException e) {
            connection.close();
        } finally {
            connection.close();
        }
    }

    public static toDataBase getInstance() {
        if (instancia == null) {
            instancia = new toDataBase();
        }
        return instancia;
    }
}