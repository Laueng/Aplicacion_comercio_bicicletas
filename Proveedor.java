/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Proveedor {
     public static void ingresarProveedor()throws SQLException {
        String sqlProv = "INSERT INTO proveedor VALUES (?,?,?,?)";
        PreparedStatement senProv = Reto5.conectar().prepareStatement(sqlProv);
        
        System.out.println("ID: ");
        int id = Reto5.sc.nextInt();
        senProv.setInt(1,id);
        Reto5.sc.nextLine();
        
        System.out.println("Nombre: ");
        String nombre = Reto5.sc.nextLine();
        senProv.setString(2, nombre);
        
        System.out.println("Dirección: ");
        String direccion = Reto5.sc.nextLine();
        senProv.setString(3, direccion);
        
          
        System.out.print("Telefono: ");
        String telefono = Reto5.sc.nextLine();
        senProv.setString(4,telefono);
        
        int filasIns = senProv.executeUpdate();
        if(filasIns > 0) {
            System.out.println("!Inserción exitosa!");
            System.out.println("--------------");
        }
        
        
        
        
}
}
