/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/* Importo las clases necesarias */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/* Nuevo JDialog que implementa el interface ActionListener */
public class Ejemplo5Secundaria extends JDialog implements ActionListener {

    /* Declaro variables */
    private JButton boton2;
    private JLabel label1;

    /* Constructor que recibe el JFrame Ejemplo5Principal como parent y el modal */
    public Ejemplo5Secundaria(Ejemplo5Principal parent, boolean modal) {

        /* Invoco al constructor de la clase superior */
        super(parent, modal);

        /* Layout absoluto y límites*/
        setLayout(null);
        setBounds(440, 10, 410, 210);

        //Etiqueta
        label1 = new JLabel("Esta es la ventana secundaria");
        label1.setBounds(115, 60, 200, 30);
        add(label1);

        //Botón
        boton2 = new JButton("Volver");
        boton2.setBounds(105, 110, 200, 40);
        add(boton2);

        /* Inicializo escuchador del botón */
        boton2.addActionListener(this);

    }

    /* Método que implementa la acción del botón */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {
            //Cierro la pantalla
            setVisible(false);
        }
    }

}
