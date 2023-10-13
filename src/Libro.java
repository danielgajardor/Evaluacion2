
/**
 *
 * @author vina
 */
public abstract class Libro {
    private String titulo;
    private int numPaginas;
    private int precio;

    public Libro() {
    }

    public Libro(String titulo, int numPaginas, int precio) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", numPaginas=" + numPaginas + ", precio=" + precio + '}';
    }
    
    
    public abstract void reigstrarLibro();static {
              }
    public abstract void mostrarLibro();static {
              }
    public abstract void eliminarLibros();static {
              }
}
