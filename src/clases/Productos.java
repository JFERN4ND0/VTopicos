/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author FERNANDO
 */
public class Productos {
    private int id_producto, existencia;
    private String descripcion;
    private double precio;
    Connection cn;

    public Productos(int id_producto, int existencia, String descripcion, double precio) {
        this.id_producto = id_producto;
        this.existencia = existencia;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public int getId_producto() {
        return id_producto;
    }
    
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void agregarPnuevoBD() {
        try{
            cn = DriverManager.getConnection( Conexion.cadenita,
                    Conexion.user, Conexion.password);
            PreparedStatement ps = 
                    cn.prepareStatement("insert into productos(id_producto, existencia, descripcion, precio) "+
                            " values (?, ?, ?, ?) ");
            
            ps.setInt(1, this.id_producto);
            ps.setInt(2, this.existencia);
            ps.setString(3, this.descripcion);
            ps.setDouble(4, this.precio);
            
            ps.executeUpdate();
            
            cn.close();
        }catch(Exception e1) {
            System.out.println(e1.getMessage());
        }
    }
    
    public void agregarPexistenteBD(int existencia) {
        try{
            cn = DriverManager.getConnection( Conexion.cadenita,
                    Conexion.user, Conexion.password);
            PreparedStatement ps = 
                    cn.prepareStatement("update productos set existencia=? where id = '" + id_producto + "'");
            
            ps.setInt(2, this.existencia + existencia);
            
            ps.executeUpdate();
            
            cn.close();
        }catch(Exception e1) {
            System.out.println(e1.getMessage());
        }
    }
}