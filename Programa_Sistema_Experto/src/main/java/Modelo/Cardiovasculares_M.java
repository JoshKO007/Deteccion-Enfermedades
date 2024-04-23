package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cardiovasculares_M {
        public Cardiovasculares_M(){
        
    }    
    
    public String SeleccionInfecciosa(boolean opcion1, boolean opcion2, boolean opcion3, boolean opcion4, boolean opcion5, boolean opcion6, boolean opcion7, boolean opcion8, boolean opcion9, boolean opcion10, boolean opcion11, boolean opcion12, boolean opcion13, boolean opcion14, boolean opcion15, boolean opcion16, boolean opcion17, boolean opcion18, boolean opcion19, boolean opcion20){
        String url = "jdbc:mysql://localhost:3306/SBC";
        String usuario = "root";
        String contraseña = "root";
        String valorF = "";
        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            Statement statement = conexion.createStatement();
            System.out.println("Base de datos importada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String consultaSQL1 = "Select nombre from enfermedad where id_enfermedad = 21;";
        String consultaSQL2 = "Select nombre from enfermedad where id_enfermedad = 22;";
        String consultaSQL3 = "Select nombre from enfermedad where id_enfermedad = 23;";
        String consultaSQL4 = "Select nombre from enfermedad where id_enfermedad = 24;";
        String consultaSQL5 = "Select nombre from enfermedad where id_enfermedad = 25;";
        String consultaSQL6 = "Select nombre from enfermedad where id_enfermedad = 26;";
        String consultaSQL7 = "Select nombre from enfermedad where id_enfermedad = 27;";
        String consultaSQL8 = "Select nombre from enfermedad where id_enfermedad = 28;";
        String consultaSQL9 = "Select nombre from enfermedad where id_enfermedad = 29;";
        String consultaSQL10 = "Select nombre from enfermedad where id_enfermedad = 30;";
        String consultaSQL11 = "Select nombre from enfermedad where id_enfermedad = 31;";
        String consultaSQL12 = "Select nombre from enfermedad where id_enfermedad = 32;";
        String consultaSQL13 = "Select nombre from enfermedad where id_enfermedad = 33;";
        String consultaSQL14 = "Select nombre from enfermedad where id_enfermedad = 34;";
        String consultaSQL15 = "Select nombre from enfermedad where id_enfermedad = 35;";
        String consultaSQL16 = "Select nombre from enfermedad where id_enfermedad = 36;";
        String consultaSQL17 = "Select nombre from enfermedad where id_enfermedad = 37;";
        String consultaSQL18 = "Select nombre from enfermedad where id_enfermedad = 38;";
        String consultaSQL19 = "Select nombre from enfermedad where id_enfermedad = 39;";
        String consultaSQL20 = "Select nombre from enfermedad where id_enfermedad = 40;";
        
               
        try (Connection conexión = DriverManager.getConnection(url, usuario, contraseña)) {
            Statement statement = conexión.createStatement();
            ResultSet resultado1 = statement.executeQuery(consultaSQL1);
            Statement statement1 = conexión.createStatement();
            ResultSet resultado2 = statement1.executeQuery(consultaSQL2);
            Statement statement2 = conexión.createStatement();
            ResultSet resultado3 = statement2.executeQuery(consultaSQL3);
            Statement statement3 = conexión.createStatement();
            ResultSet resultado4 = statement3.executeQuery(consultaSQL4);
            Statement statement4 = conexión.createStatement();
            ResultSet resultado5 = statement4.executeQuery(consultaSQL5);
            Statement statement5 = conexión.createStatement();
            ResultSet resultado6 = statement5.executeQuery(consultaSQL6);
            Statement statement6 = conexión.createStatement();
            ResultSet resultado7 = statement6.executeQuery(consultaSQL7);
            Statement statement7 = conexión.createStatement();
            ResultSet resultado8 = statement7.executeQuery(consultaSQL8);
            Statement statement8 = conexión.createStatement();
            ResultSet resultado9 = statement8.executeQuery(consultaSQL9);
            Statement statement9 = conexión.createStatement();
            ResultSet resultado10 = statement9.executeQuery(consultaSQL10);
            Statement statement10 = conexión.createStatement();
            ResultSet resultado11 = statement10.executeQuery(consultaSQL11);
            Statement statement11 = conexión.createStatement();
            ResultSet resultado12 = statement11.executeQuery(consultaSQL12);
            Statement statement12 = conexión.createStatement();
            ResultSet resultado13 = statement12.executeQuery(consultaSQL13);
            Statement statement13 = conexión.createStatement();
            ResultSet resultado14 = statement13.executeQuery(consultaSQL14);
            Statement statement14 = conexión.createStatement();
            ResultSet resultado15 = statement14.executeQuery(consultaSQL15);
            Statement statement15 = conexión.createStatement();
            ResultSet resultado16 = statement15.executeQuery(consultaSQL16);
            Statement statement16 = conexión.createStatement();
            ResultSet resultado17 = statement16.executeQuery(consultaSQL17);
            Statement statement17 = conexión.createStatement();
            ResultSet resultado18 = statement17.executeQuery(consultaSQL18);
            Statement statement18 = conexión.createStatement();
            ResultSet resultado19 = statement18.executeQuery(consultaSQL19);
            Statement statement19 = conexión.createStatement();
            ResultSet resultado20 = statement19.executeQuery(consultaSQL20);
            String valor1 = "";
            String valor2 = "";
            String valor3 = "";
            String valor4 = "";
            String valor5 = "";
            String valor6 = "";
            String valor7 = "";
            String valor8 = "";
            String valor9 = "";
            String valor10 = "";
            String valor11 = "";
            String valor12 = "";
            String valor13 = "";
            String valor14 = "";
            String valor15 = "";
            String valor16 = "";
            String valor17 = "";
            String valor18 = "";
            String valor19 = "";
            String valor20 = "";
            if (resultado1.next()) {
                valor1 = resultado1.getString("nombre");
            }
            if (resultado2.next()) {
                valor2 = resultado2.getString("nombre"); 
            }
            if (resultado3.next()) {
                valor3 = resultado3.getString("nombre");
            }
            if (resultado4.next()) {
                valor4 = resultado4.getString("nombre");
            }
            if (resultado5.next()) {
                valor5 = resultado5.getString("nombre");
            }
            if (resultado6.next()) {
                valor6 = resultado6.getString("nombre"); 
            }
            if (resultado7.next()) {
                valor7 = resultado7.getString("nombre"); 
            }
            if (resultado8.next()) {
                valor8 = resultado8.getString("nombre"); 
            }
            if (resultado9.next()) {
                valor9 = resultado9.getString("nombre"); 
            }
            if (resultado10.next()) {
                valor10 = resultado10.getString("nombre"); 
            } 
            if (resultado11.next()) {
                valor11 = resultado11.getString("nombre");
            }
            if (resultado12.next()) {
                valor12 = resultado12.getString("nombre"); 
            }
            if (resultado13.next()) {
                valor13 = resultado13.getString("nombre");
            }
            if (resultado14.next()) {
                valor14 = resultado14.getString("nombre");
            }
            if (resultado15.next()) {
                valor15 = resultado15.getString("nombre");
            }
            if (resultado16.next()) {
                valor16 = resultado16.getString("nombre"); 
            }
            if (resultado17.next()) {
                valor17 = resultado17.getString("nombre"); 
            }
            if (resultado18.next()) {
                valor18 = resultado18.getString("nombre"); 
            }
            if (resultado19.next()) {
                valor19 = resultado19.getString("nombre"); 
            }
            if (resultado20.next()) {
                valor20 = resultado20.getString("nombre"); 
            }            
        
            
           int num1 = 0;
           int num2 = 0;
           int num3 = 0;
           int num4 = 0;
           int num5 = 0;
           int num6 = 0;
           int num7 = 0;
           int num8 = 0;
           int num9 = 0;
           int num10 = 0;
           int num11 = 0;
           int num12 = 0;
           int num13 = 0;
           int num14 = 0;
           int num15 = 0;
           int num16 = 0;
           int num17 = 0;
           int num18 = 0;
           int num19 = 0;
           int num20 = 0;
           
           if(opcion1 == true){
               num1 ++;
               num3 ++;
               num4 ++;
               num7 ++;
               num11 ++;
               num12 ++;
               num13 ++;
               num15 ++;
               num18 ++;
               num19 ++;
               num20 ++;
           }
           if(opcion2 == true){
               num2 ++;
               num7 ++;
               num8 ++;
               num11 ++;
               num12 ++;
               num14 ++;
               num17 ++;
               num19 ++;            
           }
           if(opcion3 == true){
               num4 ++;
               num8 ++;
               num9 ++;
               num10 ++;
               num11 ++;
               num14 ++;
               num17 ++;              
           }
           if(opcion4 == true){
               num5 ++;
               num7 ++;
               num10 ++;
               num15 ++;
               num16 ++;
           }
           if(opcion5 == true){              
               num6 ++;
               num10 ++;
               num16 ++;
               num17 ++;
           }
           if(opcion6 == true){
               num7 ++;
               num9 ++;
               num13 ++;
               num17 ++;
           }
           if(opcion7 == true){
               num8 ++;
               num13 ++;
               num17 ++;
               num20 ++;              
           }
           if(opcion8 == true){
               num9 ++;
               num10 ++;
               num13 ++;
               num18 ++;             
           }
           if(opcion9 == true){
               num10 ++;
               num12 ++;
               num13 ++;
               num17 ++;        
           }
           if(opcion10 == true){
               num11 ++;
               num12 ++;
               num14 ++;
               num16 ++;             
           }
           if(opcion11 == true){
               num2 ++;
               num4 ++;
               num5 ++;
               num6 ++;
               num15 ++;
           }
           if(opcion12 == true){
               num3 ++;
               num6 ++;
               num10 ++;
               num13 ++;                
           }
           if(opcion13 == true){
               num7 ++;
               num10 ++;
               num11 ++;
               num14 ++;
           }
           if(opcion14 == true){
               num1 ++;
               num11 ++;
               num17 ++;
               num20 ++;            
           }
           if(opcion15 == true){
               num2 ++;
               num3 ++;
               num10 ++;
               num13 ++;
           }
           if(opcion16 == true){
               num4 ++;
               num5 ++;
               num6 ++;
               num8 ++;
           }
           if(opcion17 == true){
               num3 ++;
               num7 ++;
               num9 ++;
               num18 ++;
           }
           if(opcion18 == true){
               num1 ++;
               num5 ++;
               num9 ++;
               num20 ++;
           }
           if(opcion19 == true){
               num1 ++;
               num8 ++;
               num12 ++;
               num17 ++;
           }
           if(opcion20 == true){
               num2 ++;
               num6 ++;
               num13 ++; 
               num15 ++;
           }

        
        int mayor = num1; 
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num4 > mayor) {
            mayor = num4;
        }
        if (num5 > mayor) {
            mayor = num5;
        }
        if (num6 > mayor) {
            mayor = num6;
        }
        if (num7 > mayor) {
            mayor = num7;
        }
        if (num8 > mayor) {
            mayor = num8;
        }
        if (num9 > mayor) {
            mayor = num9;
        }
        if (num10 > mayor) {
            mayor = num10;
        }
        if (num11 > mayor) {
            mayor = num11;
        }
        if (num12 > mayor) {
            mayor = num12;
        }
        if (num13 > mayor) {
            mayor = num13;
        }
        if (num14 > mayor) {
            mayor = num14;
        }
        if (num15 > mayor) {
            mayor = num15;
        }
        if (num16 > mayor) {
            mayor = num16;
        }
        if (num17 > mayor) {
            mayor = num17;
        }
        if (num18 > mayor) {
            mayor = num18;
        }
        if (num19 > mayor) {
            mayor = num19;
        }
        if (num20 > mayor) {
            mayor = num20;
        }            
        
        if(num1 == mayor){
            valorF = valor1;
        }else if(num2 == mayor){
            valorF = valor2;
        }else if(num3 == mayor){;
            valorF = valor3;
        }else if(num4 == mayor){
            valorF = valor4;
        }else if(num5 == mayor){
            valorF = valor5;
        }else if(num6 == mayor){
            valorF = valor6;
        }else if(num7 == mayor){
            valorF = valor7;
        }else if(num8 == mayor){
            valorF = valor8;
        }else if(num9 == mayor){
            valorF = valor9;
        }else if(num10 == mayor){
            valorF = valor10;
        }else if(num11 == mayor){
            valorF = valor11;
        }else if(num12 == mayor){;
            valorF = valor12;
        }else if(num13 == mayor){
            valorF = valor13;
        }else if(num14 == mayor){
            valorF = valor14;
        }else if(num15 == mayor){
            valorF = valor15;
        }else if(num16 == mayor){
            valorF = valor16;
        }else if(num17 == mayor){
            valorF = valor17;
        }else if(num18 == mayor){
            valorF = valor18;
        }else if(num19 == mayor){
            valorF = valor19;
        }else if(num20 == mayor){
            valorF = valor20;
        }
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valorF;
    }
}
