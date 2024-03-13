/* En un grupo de música existen diferentes tipos de instrumentos musicales. Hay instrumentos de viento, cuerda y percusión.
Todos los instrumentos tienen como atributos su nombre y precio. Además, tienen un método llamado tocar(). Éste es abstracto
en la clase instrumento y, por tanto, debe implementarse en las clases hijas. Si se está tocando un instrumento de viento,
el método debe mostrar por consola: "Está sonando un instrumento de viento", si se está tocando un instrumento de cuerda:
"Está sonando un instrumento de cuerda" y si se está tocando un instrumento de percusión: "Está sonando un instrumento de percusión".
El proceso de carga de una clase sólo tiene lugar una vez. Demuestra que la carga puede ser provocada por la creación de la primera
instancia de esta clase o por el acceso a un miembro estático de ésta.
Buscar información sobre los blogs de inicialización y blogs estáticos en Java. */

package sprint1_javaLanguage;

import sprint1_javaLanguage.n1exercici1.InstrumentoMusical;

public class Musica {
        public static void main(String[] args) {


            InstrumentoMusical percusion = new InstrumentoMusical("precursion", 50) {
                @Override
                public String tocar() {
                    return super.tocar();
                }
            };

            percusion.tocar();

        }
    }
