/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

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

    public Cajerol() {}

    public Cajerol(String nombre, String email, String telefono, String username, String password) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
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
    
    public String toString() {
        return String.format("%20s # %20s # %10s # %15s # %15s #\n", nombre, email, telefono, username, password);
    }
}