package sprint1_javaLanguage.n1exercici1;

public class Cuerda extends InstrumentoMusical{

    public Cuerda(String nombre, int precio) {
        super(nombre, precio);
    }

    public String tocar() {
        return "Está sonando un instrumento de cuerda.";
    }

}
