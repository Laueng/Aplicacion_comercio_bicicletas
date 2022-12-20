/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Fabricantes {
    public static void ingresarFabricantes()throws SQLException {
        String sqlFab = "INSERT INTO fabricantes VALUES (?)";
        PreparedStatement senFab = Reto5.conectar().prepareStatement(sqlFab);
    
        System.out.println("Nombre Fabricante: ");
        String nombre = Reto5.sc.nextLine();
        senFab.setString(1, nombre);
        
        int filasIns = senFab.executeUpdate();
        if(filasIns > 0) {
            System.out.println("¡Inserción exitosa !");
            System.out.println("--------------");
}
}
}
