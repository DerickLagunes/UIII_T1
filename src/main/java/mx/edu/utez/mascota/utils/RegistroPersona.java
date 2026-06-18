package mx.edu.utez.mascota.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class RegistroPersona {
    //Escribir texto en un archivo de la pc
    public static void escribirNuevaLinea(String rutaArchivo, String texto){
        Path ruta = Paths.get(rutaArchivo);
        try{
            Files.write(
                    ruta,
                    Collections.singletonList(texto),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
            System.out.println("El archivo se ha escrito con exito");
        }catch(IOException e){
            System.err.println("No se pudo escribir el archivo");
        }
    }

    public static void main(String[] args) {
        escribirNuevaLinea("personas.txt", "dulce llego tarde");
    }
}
