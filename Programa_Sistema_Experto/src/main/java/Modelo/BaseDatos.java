package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {

    public static boolean conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/SBC";
        String usuario = "root";
        String contraseña = "root";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            Statement statement = conexion.createStatement();
            System.out.println("Base de datos importada exitosamente.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            if (conectar()) {
                System.out.println("Ahora puede interactuar con la base de datos.");
            } else {
                System.out.println("Error de conexión. Verifique sus credenciales y la configuración de la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error inesperado.");
        }
    }
}

