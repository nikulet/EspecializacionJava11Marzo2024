/* Todos los instrumentos tienen como atributos su nombre y precio. Además, tienen un método llamado tocar(). Éste es abstracto
en la clase instrumento y, por tanto, debe implementarse en las clases hijas. */

package sprint1_javaLanguage.n1exercici1;

public abstract class InstrumentoMusical {

    private String nombre;
    private int precio;

    public InstrumentoMusical(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }
    public int getPrecio() {
        return this.precio;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }


     public String tocar() {
       return "Está sonando un instrumento";
     }

}