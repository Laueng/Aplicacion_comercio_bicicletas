/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Motocicletas {
     public static void ingresarMotocicletas()throws SQLException {
        String sql = "INSERT INTO motocicletas VALUES (?,?,?,?,?)";
        PreparedStatement sentencia = Reto5.conectar().prepareStatement(sql);
        
        System.out.println("ID: ");
        int id = Reto5.sc.nextInt();
        sentencia.setInt(1,id);
        Reto5.sc.nextLine();
        
        System.out.println("Fabricante: ");
        String fabricante = Reto5.sc.nextLine();
        sentencia.setString(2, fabricante);
        
        System.out.println("Precio: ");
        int precio = Reto5.sc.nextInt();
        sentencia.setInt(3,precio);
        Reto5.sc.nextLine();
        
        System.out.println("Autonomia: ");
        int autonomia = Reto5.sc.nextInt();
        sentencia.setInt(4,autonomia);
        Reto5.sc.nextLine();
                         
        System.out.println("ID Proveedor: ");
        int idProv = Reto5.sc.nextInt();
        sentencia.setInt(5,idProv);
        Reto5.sc.nextLine();
        
        int filasIns = sentencia.executeUpdate();
        if (filasIns >0){
            System.out.println("¡Inserción exitosa !");
        }
         
     }
}
