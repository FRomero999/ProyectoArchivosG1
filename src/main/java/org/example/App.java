package org.example;

import org.example.models.Producto;
import org.example.services.ConfigService;
import org.example.services.FileService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Clase principal de la aplicación.
 *
 * <p><strong>Objetivo didáctico:</strong> Demuestra el uso del servicio {@link org.example.services.FileService}
 * para leer y filtrar productos desde un archivo de texto.</p>
 *
 * @author Grupo 1
 * @version 1.0
 */
public class App {

    /**
     * Punto de entrada de la aplicación.
     *
     * <p>Este método lee todos los productos que contienen la palabra "teclado"
     * en el archivo configurado y los muestra por consola.</p>
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        ConfigService configService = new ConfigService();
        FileService fileService = new FileService(configService);

        //var productos = fileService.leerArchivoTextoFiltrado("samsung");
        //fileService.guardarArchivoJson("exportacion.json", productos);

        //var productos = fileService.leerArchivoJson("exportacion.json");

        //fileService.guardarArchivoBinario("exportacion.bin",productos);

        var productos = fileService.leerArchivoBinario("exportacion.bin");
        productos.forEach(System.out::println);


    }



}
