/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Clientes {
 
    public static void ingresarClientes() throws SQLException{ //
        String sql = "INSERT INTO  Clientes VALUES (?,?,?,?,?,?,?)";
        PreparedStatement sentencia = Reto5.conectar().prepareStatement(sql);
        System.out.print("Alias: ");
        String alias = Reto5.sc.nextLine();
        sentencia.setString(1,alias);
        
        System.out.println("Nombre: ");
        String nombre = Reto5.sc.nextLine();
        sentencia.setString(2, nombre);
        
        System.out.print("Apellido: ");
        String apellido = Reto5.sc.nextLine();
        sentencia.setString(3,apellido);
        
        System.out.print("e-mail: ");
        String email = Reto5.sc.nextLine();
        sentencia.setString(4,email);
        
        System.out.print("celular: ");
        String celular = Reto5.sc.nextLine();
        sentencia.setString(5,celular);
        
        System.out.println("contrasenia: ");
        int contrasenia =Reto5.sc.nextInt();
        sentencia.setInt(6, contrasenia);
        Reto5.sc.nextLine();
        
        System.out.println("F.Nacimiento: ");
        String nacimiento = Reto5.sc.nextLine();
        sentencia.setString(7, nacimiento);
        
        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0){
            System.out.println("¡Inserción exitosa !");
        }
    }
    
}
