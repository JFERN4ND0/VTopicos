/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import misComponentes.JMiBoton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author FERNANDO
 */
public class Login extends JFrame{
    Container contenedor;
    JMiBoton boton;
    JPanel fondod, fondoi, pnombre, ppassword;
    JLabel lnombre, lpassword, llogo;
    JTextField txtnombre;
    JPasswordField jpassword;
    
    public Login() {
        setSize(400, 200);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        contenedor = this.getContentPane();
        contenedor.setLayout(new GridLayout(1,2));
        
        llogo=new JLabel();
        llogo.setHorizontalAlignment(JLabel.CENTER);
        Image imglogo = new ImageIcon("src/images/DS.png").getImage();
        ImageIcon logo = new ImageIcon( imglogo.getScaledInstance(78, 124, Image.SCALE_SMOOTH));
        llogo.setIcon(logo);
        llogo.setVisible(true);
        
        fondoi = new JPanel();
        fondoi.setBackground(new Color(150, 190, 255));
        fondoi.setLayout(new BorderLayout());
        fondoi.add(llogo, BorderLayout.CENTER);
        contenedor.add(fondoi);
        
        fondod = new JPanel();
        fondod.setLayout(null);
        fondod.setBackground(new Color(150, 190, 255));
        
        lnombre = new JLabel("Usuario");
        lnombre.setBounds(0, 3, 20, 20);
        ImageIcon ima = new ImageIcon("src/images/usuario.png");
        Icon icono = new ImageIcon(ima.getImage().getScaledInstance(lnombre.getWidth(),
                lnombre.getHeight(), Image.SCALE_DEFAULT));
        lnombre.setIcon(icono);
        
        txtnombre = new JTextField("usuario");
        txtnombre.setBounds(20, 3, 135, 20);
        
        lpassword = new JLabel();
        lpassword.setBounds(0, 3, 20, 20);
        ImageIcon pass = new ImageIcon("src/images/cerrar.png");
        Icon ipass = new ImageIcon(pass.getImage().getScaledInstance(lpassword.getWidth(),
                lpassword.getHeight(), Image.SCALE_DEFAULT));
        lpassword.setIcon(ipass);
        
        jpassword = new JPasswordField("123456");
        jpassword.setBounds(20, 3, 135, 20);
        
        pnombre = new JPanel();
        pnombre.setLayout(null);
        pnombre.setBounds(20, 45, 155, 25);
        pnombre.setBackground(new Color(150, 190, 255));
        pnombre.add(lnombre);
        pnombre.add(txtnombre);
        
        ppassword = new JPanel();
        ppassword.setLayout(null);
        ppassword.setBounds(20, 75, 155, 25);
        ppassword.setBackground(new Color(150, 190, 255));
        ppassword.add(lpassword);
        ppassword.add(jpassword);
        
        boton = new JMiBoton("Aceptar");
        boton.setBounds(50, 115, 100, 25);
        boton.setForeground(new Color(0, 0, 80));
        boton.setBorder(null);
        boton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               entrar();
           }
       });
        
        fondod.add(pnombre);
        fondod.add(ppassword);
        fondod.add(boton);
        contenedor.add(fondod);
        
        setVisible(true);
    }
    
    public void entrar() {
        String usuario = txtnombre.getText();
        String password = jpassword.getText();
        
        Carga vc = new Carga(this, true);
        vc.setVisible(true);
            
        if(usuario.compareTo("admin") == 0 && password.compareTo("admin") == 0) {
            Administrador admin = new Administrador();
            dispose();
        } else {
            if(usuario.compareTo("usuario")==0 && password.compareTo("123456")==0) {
                Cajero cajero = new Cajero();
                dispose();
            } else
                JOptionPane.showMessageDialog(null, "Acceso no autorizado", "Error",0);
        }
    }
}