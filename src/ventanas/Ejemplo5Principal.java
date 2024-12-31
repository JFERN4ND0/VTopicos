/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/* Importo las clases necesarias */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/* Nuevo JFrame que implementa el interface ActionListener */
public class Ejemplo5Principal extends JFrame implements ActionListener {

    /* Declaro variables */
    private JButton boton1;
    private JLabel label1;

    /* Constructor */
    public Ejemplo5Principal() {

        //Layout absoluto
        setLayout(null);

        //Tamaño de la ventana
        setBounds(10, 10, 410, 210);

        //Título
        setTitle("Ejemplo 5: Modal");

        //No redimensionable
        setResizable(false);

        //Cerrar proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Etiqueta
        label1 = new JLabel("Esta es la ventana principal");
        label1.setBounds(115, 60, 200, 30);
        add(label1);

        //Botón
        boton1 = new JButton("Haz clic aquí");
        boton1.setBounds(105, 110, 200, 40);
        add(boton1);

        /* Inicializo escuchador del botón */
        boton1.addActionListener(this);

        //Muestro JFrame (lo último para que lo pinte todo correctamanete)
        setVisible(true);

    }

    /* Método que implementa la acción del botón */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            /* Inicializo y muestro la segunda pantalla con los argumentos this (JFrame) y true (modal) */
            Ejemplo5Secundaria secundaria = new Ejemplo5Secundaria(this, true);
            secundaria.setVisible(true);
        }
    }

    /* Incializo el formulario */
    public static void main(String[] args) {

        new Ejemplo5Principal();

    }
}
