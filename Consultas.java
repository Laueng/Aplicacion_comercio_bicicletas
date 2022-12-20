/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas {
    public static void crearTablas(){
        try{
            String[] sqls ={
    
  "create table proveedor(prov_id int primary key, prov_nombre char(20), prov_direccion char(45), prov_telefono char(20))",
  "create table clientes(alias char(20) primary key,nombre char(20),apellidos char(20),email varchar(45),celular char(20),contraseña int, f_nacimiento date)",
  "create table fabricantes(fabricante char(20) primary key)",
  "create table bicicletas(id int primary key, fabricante char(20),precio int,año int,foreign key (fabricante) references fabricantes (fabricante))",  
  "create table motocicletas (id int primary key,fabricante char (20),precio int,autonomia int,id_prov int, foreign key (fabricante) references fabricantes (fabricante),foreign key(id_prov) references proveedor (prov_id))",  
  "create table compras(id int primary key,alias char (20),fabricante char (20),fecha_hora timestamp,foreign key (alias) references clientes (alias),foreign key (fabricante)references fabricantes (fabricante))",  
    
};
    for(String i:sqls){
        PreparedStatement sentencia =Reto5.conectar().prepareStatement(i);
        sentencia.executeUpdate();
    }            
        }catch(SQLException e){//
            System.out.println("Tablas ya creadas");
        }
    }
            
public static void modificaYear() throws SQLException {
    String sql = "UPDATE bicicletas SET año=? WHERE fabricante=?";
    PreparedStatement sentencia = Reto5.conectar().prepareStatement(sql);
    System.out.println("Por favor ingrese fabricante de la bicicleta y el año a modificar.");
    System.out.print("Fabricante: ");
    String nombre= Reto5.sc.nextLine();
    sentencia.setString(2, nombre);
    
    System.out.print("Año: ");
    int year = Reto5.sc.nextInt();
    sentencia.setInt(1,year);
    Reto5.sc.nextLine();
    
    int filasIns = sentencia.executeUpdate();
    if(filasIns >0) {
        System.out.println("¡Año Cambiado Correctamente !");
    }
}
    
    public static void modificaTelCliente() throws SQLException {
    String sql = "UPDATE clientes SET celular=? WHERE alias=?";
    PreparedStatement sentencia = Reto5.conectar().prepareStatement(sql);
    System.out.println("Por favor ingrese Alias del Cliente y el nuevo número celular.");
    System.out.print("Alias: ");
    String alias = Reto5.sc.nextLine();
    sentencia.setString(2, alias);
    
    System.out.print("Celular: ");
    String cel = Reto5.sc.nextLine();
    sentencia.setString(1, cel);
    
    int filasIns = sentencia.executeUpdate();
    if (filasIns >0) {
        System.out.println("¡Número de celular Cambiado Correctamente !");
    }
    }
    
    public static void borraCompra() throws SQLException {
    String sql = "DELETE FROM compras WHERE alias=? AND fabricante=?";
    PreparedStatement sentencia = Reto5.conectar().prepareStatement(sql);
    System.out.println("Por favor ingrese Alias del Cliente y  fabricante de la intención de compraa.");
    System.out.print("Alias: ");
    String alias= Reto5.sc.nextLine();
    sentencia.setString(1, alias);
    
    System.out.print("Fabricante: ");
    String fab= Reto5.sc.nextLine();
    sentencia.setString(2, fab);
        
        int filasIns = sentencia.executeUpdate();
    if (filasIns >0) {
        System.out.println("¡Intención de compra ELIMINADA Correctamente !");
    }
    }
             
    public static void consultaFabricantes() throws SQLException{
        String sql = "SELECT fabricante FROM fabricantes ORDER BY fabricante";
        Statement sentencia = Reto5.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);
        
        while (consulta.next()){
            String col1 = consulta.getString(1);
            System.out.println(col1);
        }
    }
    
    public static void consultaInfoBici() throws SQLException{
        String sql = "SELECT fabricante, precio, año FROM bicicletas WHERE año>= 2019 ORDER BY fabricante";
        Statement sentencia = Reto5.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);
        
        while (consulta.next()){
            String col1 = consulta.getString(1);
            int col2 = consulta.getInt(2);
            String col3 = consulta.getString(3);
            System.out.println(col1 + " " + col2 + " " + col3);
        }
    }
    
    public static void consultaFabriMoto() throws SQLException{
        String sql = "SELECT fabricante FROM motocicletas WHERE id_prov=101";
        Statement sentencia = Reto5.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);
        
        while (consulta.next()){
            String col1 = consulta.getString(1);
            System.out.println(col1);
        }
    }
   public static void consultaCompBiMoto() throws SQLException{
        String sql = "select fabricante from compras where alias = \"lucky\" order by fabricante";
        Statement sentencia = Reto5.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);
        
        while (consulta.next()){
            String col1 = consulta.getString(1);
            System.out.println(col1); 
    }
   }
   
  public static void consultaCompBicli()throws SQLException{
       String sql = "select c.alias, c.nombre, c.apellidos from clientes c, compras p where p.alias=c.alias and p.fabricante=\"Yeti\" order by nombre";
       Statement sentencia = Reto5.conectar().createStatement(); 
       ResultSet consulta = sentencia.executeQuery(sql);
  
     while (consulta.next()){
            String col1 = consulta.getString(1);
            String col2 = consulta.getString(2);
            String col3 = consulta.getString(3);
            System.out.println(col1+ " " + col2 + " " + col3);
}
      }
   public static void consultaBiciFab()throws SQLException{
       System.out.println("Ingresar año");
       System.out.println("Año: ");
       int year = Reto5.sc.nextInt();
       Reto5.sc.nextLine();
       
       String sql = "select count(fabricante) from bicicletas where año>=" + year;
       Statement sentencia = Reto5.conectar().createStatement(); 
       ResultSet consulta = sentencia.executeQuery(sql);
       
       while (consulta.next()){
            String col1 = consulta.getString(1);            
            System.out.println(col1);
           
   }
   }
}

    
    
    
   
       
            
            
        
    
