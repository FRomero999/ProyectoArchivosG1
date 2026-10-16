package org.example.models;

import java.io.Serializable;

/**
 * Modelo de datos que representa un producto en el sistema.
 *
 * <p>Este {@link java.lang.Record} es inmutable, lo que significa que una vez creado,
 * sus valores no pueden modificarse. Es ideal para representar entidades de negocio
 * como productos.</p>
 *
 * @author Grupo 1
 * @version 1.0
 */
public record Producto(
        /**
         * Identificador único del producto.
         */
        Long id,

        /**
         * Nombre descriptivo del producto.
         */

        String nombre,

        /**
         * Precio unitario del producto.
         * Debe ser mayor o igual a 0.
         */
        Double precio,

        /**
         * Cantidad disponible en stock.
         * Debe ser mayor o igual a 0.
         */
        Integer stock
) implements Serializable {

    /**
     * Constructor compacto del record que valida los datos de entrada.
     *
     * <p><strong>Regla de validación:</strong> El precio y el stock no pueden ser negativos.</p>
     *
     * @throws IllegalArgumentException Si el precio es menor a 0 o el stock es menor a 0
     */
    public Producto {
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException("Datos incompletos");
        }
    }

}
