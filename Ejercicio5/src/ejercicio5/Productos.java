
package ejercicio5;

public class Productos {

    private String categoria;
    private String nombre;
    private Double precio;

    public Productos(String categoria, String nombre, Double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "categoria=" + categoria + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
       
}
