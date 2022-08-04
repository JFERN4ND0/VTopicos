/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.event.KeyEvent;

/**
 *
 * @author FERNANDO
 */
public class ValidarT {
    Character c;
    public static int cn = 0;
    
    public void validarLetras(KeyEvent evt) {
        c = evt.getKeyChar();
        
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
            evt.consume();
    }
    
    public void validarNumeros(KeyEvent evt) {
        //cn = AgregarProducto.val;
        c = evt.getKeyChar();
        
        if(cn != 0 && c == KeyEvent.VK_PERIOD)
            evt.consume();
        
        if(c == KeyEvent.VK_PERIOD)
            cn++;
        
        if(!Character.isDigit(c) && c != KeyEvent.VK_PERIOD)
            evt.consume();
    }
    
    public void validarPNumeros(KeyEvent evt) {
        c = evt.getKeyChar();
        
        if(c < KeyEvent.VK_0 || c > KeyEvent.VK_9) {
            evt.consume();
        }
    }
}