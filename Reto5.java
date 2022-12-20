/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Reto5 {

   public static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        opciones();      
    }
         public static void opciones(){
        try{
           System.out.println("                       \n" +
                    "     CRUD MySQL     \n " +
                    "                                                \n" +
                    "1. Crear Tablas.\n" +
                    "                                                \n" +
                    "2. Ingresar datos Tabla Proveedor.\n" +
                    "3. Ingresar datos Tabla Clientes.\n" +
                    "4. Ingresar datos Tabla Fabricantes.\n" +
                    "5. Ingresar datos Tabla Bicicletas.\n" +
                    "6. Ingresar datos Tabla Motocicletas.\n" +
                    "7. Ingresar datos Tabla Compras.\n" +
                    "                                                \n" +
                    "8. Modificar Anio de Bicicleta.\n" +
                    "9. Modificar Telefono de Cliente.\n"+
                    "10. Borra intencion de compra.\n"+
                    "                                                \n" +
                    "11. Listado de Fabricantes.\n" +
                    "12. Mostrar informacion fabricantes Bicicletas estrenadas desde 2019.\n" +
                    "13. Mostrar fabricantes motocicletas con motor Auteco.\n" +
                    "14. Mostrar intencion de compra del cliente lucky.\n" +
                    "15. Mostrar clientes que quieren comprar bicibleta Yeti.\n" +
                    "16. Cantidad bicicletas fabricadas desde \"x\" Anio.\n" + 
                    "                                                \n" +
                    "-Otro numero para SALIR -\n" +
                    "                                                \n" 
                   
                    );
                    System.out.println(">>");
                    String input = sc.nextLine();
                    byte option = Byte.parseByte(input);
                    
                switch (option){
                        case 1:
                            Consultas.crearTablas();
                            break;
                        case 2:
                            Proveedor.ingresarProveedor();
                            break;
                        case 3:
                            Clientes.ingresarClientes();
                            break;
                        case 4:
                            Fabricantes.ingresarFabricantes();
                            break;
                        case 5:
                            Bicicletas.ingresarBicicletas();
                            break;
                        case 6:
                            Motocicletas.ingresarMotocicletas();
                            break;
                        case 7:
                            Compras.ingresarCompras();
                            break;
                        case 8:
                            Consultas.modificaYear();
                            break;
                        case 9:
                            Consultas.modificaTelCliente();
                            break;
                        case 10:
                            Consultas.borraCompra();
                            break;
                        case 11:
                            Consultas.consultaFabricantes();
                            break;
                        case 12:
                            Consultas.consultaInfoBici();
                            break;
                        case 13:
                            Consultas.consultaFabriMoto();
                            break;
                        case 14:
                            Consultas.consultaCompBiMoto();
                            break;
                        case 15:
                            Consultas.consultaCompBicli();
                            break;
                        case 16:
                            Consultas.consultaBiciFab();
                            break;
                        default:
                            System.out.println("Digitacion incorrecta");
                            
                    }
        }catch (Exception e){//
            System.out.println("Digitacion incorrecta");
        }
         }
         
    public static Connection conectar(){  
                                        
String dbURL = "jdbc:mysql://localhost:3306/reto5";
String username = "root";
String password = "administrador";
Connection con = null;
// conectar
try 
{
     con = DriverManager.getConnection(dbURL , username, password );

if ( con != null ) {
System.out.println("Conectado");
  System.out.println ("--------"); 
  
}

 } catch (SQLException error) {
  System.out.println ("Error: " + "error al conectarse a la base de datos reto5: ");    
             
}
       return con;
      }


}

    
    

