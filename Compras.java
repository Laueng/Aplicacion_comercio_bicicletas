/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Compras {
    public static void ingresarCompras() throws SQLException {
        String sqlComp = "INSERT INTO compras VALUES (?, ?, ?, ?)";
        PreparedStatement senComp = Reto5.conectar().prepareStatement(sqlComp);
        System.out.print("ID: ");
        int id = Reto5.sc.nextInt();
        senComp.setInt(1, id);
        Reto5.sc.nextLine();

        System.out.print("Alias Comprador: ");
        String alias = Reto5.sc.nextLine();
        senComp.setString(2, alias);

        System.out.print("Fabricante: ");
        String nombre = Reto5.sc.nextLine();
        senComp.setString(3, nombre);

        System.out.print("Fecha y Hora: ");
        String fechaHora = Reto5.sc.nextLine();
        senComp.setString(4, fechaHora);

        int filasIns = senComp.executeUpdate();
        if (filasIns > 0) {
            System.out.println("! Inserción exitosa !");
            System.out.println("------------------------------------");
        }
    }

}
