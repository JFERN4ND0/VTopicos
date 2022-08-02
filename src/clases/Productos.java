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
    private int existencia;
    private String codigo, descripcion;
    private float precio;
    Connection cn;

    public Productos() {}
    
    public Productos(String codigo, int existencia, String descripcion, float precio) {
        this.codigo = codigo;
        this.existencia = existencia;
        this.descripcion = descripcion;
        this.precio = precio;
        agregarProductonuevoBD();
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void agregarProductonuevoBD() {
        try{
            cn = DriverManager.getConnection( Conexion.cadenita,
                    Conexion.user, Conexion.password);
            PreparedStatement ps = 
                    cn.prepareStatement("insert into productos(codigo, existencia, descripcion, precio) "+
                            " values (?, ?, ?, ?, ?)");
            
            ps.setString(1, codigo);
            ps.setInt(2, this.existencia);
            ps.setString(3, this.descripcion);
            ps.setFloat(4, this.precio);
            
            ps.executeUpdate();
            
            cn.close();
        }catch(Exception e1) {
            System.out.println(e1.getMessage());
        }
    }
}