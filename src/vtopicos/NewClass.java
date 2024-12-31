/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vtopicos;

import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author pepe1
 */
public class NewClass {
    public static void main(String[] args) {
        // Obtener el directorio de la carpeta "Documentos"
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        java.io.File directorioDocumentos = fileSystemView.getDefaultDirectory();

        // Imprimir la ruta del directorio de "Documentos"
        System.out.println("Directorio de Documentos: " + directorioDocumentos.getAbsolutePath());
    }
}