/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bicicletas {
    public static void ingresarBicicletas()throws SQLException {
        String sqlBici = "INSERT INTO bicicletas VALUES (?,?,?,?)";
        PreparedStatement senBici = Reto5.conectar().prepareStatement(sqlBici);
        System.out.println("ID: ");
        int id = Reto5.sc.nextInt();
        senBici.setInt(1,id);
        Reto5.sc.nextLine();
        
        System.out.println("Fabricante: ");
        String nombre = Reto5.sc.nextLine();
        senBici.setInt(1,id);
        senBici.setString(2, nombre);
        
        System.out.println("Precio: ");
        int precio = Reto5.sc.nextInt();
        senBici.setInt(3,precio);
        Reto5.sc.nextLine();
        
        System.out.println("Año: ");
        int year = Reto5.sc.nextInt();
        senBici.setInt(4,year);
        Reto5.sc.nextLine();
        
        int filasIns = senBici.executeUpdate();
        if(filasIns > 0) {
            System.out.println("¡Inserción exitosa !");
            System.out.println("--------------");
        }
    }
    
}
