package sprint1_javaLanguage.n1exercici1;

public class Viento extends InstrumentoMusical{

    public Viento(String nombre, int precio) {
        super(nombre, precio);
    }

    public String tocar() {
        return "Está sonando un instrumento de viento.";
    }

}
