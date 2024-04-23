/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Modelo.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Tipos {
    public Tipos(){
        
    }    
    
    public String SeleccionTipos(boolean opcion1, boolean opcion2, boolean opcion3, boolean opcion4, boolean opcion5, boolean opcion6, boolean opcion7, boolean opcion8, boolean opcion9, boolean opcion10, boolean opcion11, boolean opcion12, boolean opcion13, boolean opcion14, boolean opcion15, boolean opcion16, boolean opcion17, boolean opcion18, boolean opcion19, boolean opcion20){
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

        String consultaSQL1 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 1";
        String consultaSQL2 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 2";
        String consultaSQL3 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 3";
        String consultaSQL4 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 4";
        String consultaSQL5 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 5";
        String consultaSQL6 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 6";
        String consultaSQL7 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 7";
        String consultaSQL8 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 8";
        String consultaSQL9 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 9";
        String consultaSQL10 = "SELECT nombre FROM tipo_enfermedad WHERE id_tipo_enfermedad = 10";
        
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
           if(opcion1 == true){
               num1 ++;
               num2 ++;
               num3 ++;
               num4 ++;
               num5 ++;
               num6 ++;
               num7 ++;
               num8 ++;
               num9 ++;
               num10 ++;
           }
           if(opcion2 == true){
               num1 ++;
               num2 ++;
               num3 ++;
               num4 ++;
               num5 ++;
               num6 ++;
               num7 ++;
               num8 ++;
               num9 ++;
               num10 ++;               
           }
           if(opcion3 == true){
               num1 ++;
               num2 ++;
               num3 ++;
               num4 ++;
               num5 ++;
               num6 ++;
               num7 ++;
               num8 ++;
               num9 ++;               
           }
           if(opcion4 == true){
               num1 ++;
               num2 ++;
               num3 ++;
               num5 ++;
           }
           if(opcion5 == true){              
               num2 ++;
               num3 ++;
               num4 ++;
               num7 ++;
               num9 ++;
           }
           if(opcion6 == true){
               num2 ++;
               num3 ++;
               num5 ++;
               num10 ++;                
           }
           if(opcion7 == true){
               num3 ++;
               num5 ++;
               num8 ++;               
           }
           if(opcion8 == true){
               num5 ++;
               num6 ++;
               num7 ++;
               num10 ++;                
           }
           if(opcion9 == true){
               num1 ++;
               num5 ++;              
           }
           if(opcion10 == true){
               num4 ++;
               num5 ++;
               num6 ++;
               num9 ++;
               num10 ++;                
           }
           if(opcion11 == true){
               num2 ++;
               num3 ++;
               num4 ++;
               num6 ++;               
           }
           if(opcion12 == true){
               num6 ++;
               num7 ++;
               num9 ++;
               num10 ++;                
           }
           if(opcion13 == true){
               num1 ++;
               num6 ++;
               num7 ++;          
           }
           if(opcion14 == true){
               num6 ++;
               num7 ++;              
           }
           if(opcion15 == true){
               num4 ++;
               num9 ++;
               num10 ++;                
           }
           if(opcion16 == true){
               num1 ++;
               num6 ++;               
           }
           if(opcion17 == true){
               num1 ++;
               num2 ++;
               num4 ++;
               num6 ++;            
           }
           if(opcion18 == true){
               num1 ++;
               num5 ++;
               num6 ++;
               num10 ++;                
           }
           if(opcion19 == true){
               num4 ++;
               num8 ++;
           }
           if(opcion20 == true){
               num4 ++;
               num6 ++;
               num8 ++;
               num9 ++;              
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
        }
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valorF;
    }
    
}
