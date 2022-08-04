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
public class Cajerol {
    private String nombre;
    private String email;
    private String telefono;
    private String username;
    private String password;
    private String estado;
    Connection con;

    public Cajerol() {}

    public Cajerol(String nombre, String email, String telefono, String username, String password, String estado) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
        this.estado = estado;
        insertarCajeroBD();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void insertarCajeroBD() {
        try{
            con = DriverManager.getConnection( Conexion.cadenita,
                    Conexion.user, Conexion.password);
            PreparedStatement ps = 
                    con.prepareStatement("insert into cajeros(nombre, email, telefono, username, password, estado) "+
                            " values (?, ?, ?, ?, ?, ?) ");
            
            ps.setString(1, this.nombre);
            ps.setString(2, this.email);
            ps.setString(3, this.telefono);
            ps.setString(4, this.username);
            ps.setString(5, this.password);
            ps.setString(6, this.estado);
            
            ps.executeUpdate();
            
            con.close();
        }catch(Exception e1) {
            System.out.println(e1.getMessage());
        }
    }
}