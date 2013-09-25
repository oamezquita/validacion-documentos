/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author OscarF
 */
public class PersonaM {
 private String nombre, apellido, tipoDeDocumento, fechaDeNacimiento, genero;
    public String[] opciones;

    public PersonaM(String nombre, String apellido, String tipoDeDocumento, String genero, String[] opciones, String fechadeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDeDocumento = tipoDeDocumento;
        this.fechaDeNacimiento = fechadeNacimiento;
        this.opciones = opciones;
        this.genero = genero;
    }

    public String toString() {
        String x = "<br> nombre:" + this.nombre + "</br><br> apellido:" + this.apellido + "</br><br> tipo de documento:" + this.tipoDeDocumento + "</br><br> genero:" + this.genero + "</br><br> fecha de nacimiento:" + this.fechaDeNacimiento + "</br>";
        return x;
    }   
}
