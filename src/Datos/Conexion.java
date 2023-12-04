package Datos;

import java.sql.*;

public class Conexion {
    private static final String JDBC_DB = "jdbc:mysql://172.17.0.1:3306/jardineria";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    public static Connection myConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_DB,JDBC_USER,JDBC_PASSWORD);
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }

    public static void close(PreparedStatement stmt) throws SQLException {
        stmt.close();

    }
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
}
