/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Tecnico extends Libro{
    private char incorporado;

    public Tecnico(char incorporado) {
        this.incorporado = incorporado;
    }

    public Tecnico(char incorporado, String titulo, int numPaginas, int precio) {
        super(titulo, numPaginas, precio);
        this.incorporado = incorporado;
    }

    public char getIncorporado() {
        return incorporado;
    }

    public void setIncorporado(char incorporado) {
        this.incorporado = incorporado;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "incorporado=" + incorporado + '}';
    }

    public void agregarLibro() {
        
    }

    @Override
    public void reigstrarLibro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarLibro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarLibros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
