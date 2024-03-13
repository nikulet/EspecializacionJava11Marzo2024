package sprint1_javaLanguage.n1exercici1;

public class Percusion extends InstrumentoMusical{

    public Percusion(String nombre, int precio) {
        super(nombre, precio);
    }

    public String tocar() {
        return "Está sonando un instrumento de percusión.";
    }
}
