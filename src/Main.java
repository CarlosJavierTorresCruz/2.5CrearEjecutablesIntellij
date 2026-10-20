import javax.swing.JFrame; // Importa la herramienta para crear ventanas flotantes
import javax.swing.JLabel; // Importa la herramienta para mostrar textos en la pantalla
import java.awt.FlowLayout; // Importa el organizador para que los textos no se tapen entre sí

// Creamos nuestra clase principal que "hereda" (copia) las funciones de una ventana (JFrame)
public class Main extends JFrame {

    // Este es el "constructor", aquí se configura todo lo que tendrá la ventana al abrirse
    public Main() {

        // 1. ORGANIZACIÓN: Le dice a la ventana que coloque los elementos uno detrás de otro
        this.setLayout(new FlowLayout());

        // 2. PRIMER TEXTO: Creamos el texto de saludo y lo metemos dentro de la ventana
        JLabel lblSaludo = new JLabel("Hola Mundo. Creando mi primer ejemplo");
        this.add(lblSaludo);

        // 3. SEGUNDO TEXTO: Creamos el texto con tu nombre y también lo metemos dentro
        JLabel lblMiNombre = new JLabel("Esto es de Carlos Javier Torres Cruz");
        this.add(lblMiNombre);

        // 4. TAMAÑO: Definimos el tamaño de la ventana en píxeles (450 de ancho por 200 de alto)
        this.setSize(450, 200);

        // 5. TÍTULO: Ponemos el texto que aparecerá en la barra superior de la ventana
        this.setTitle("Carlos Javier Torres Cruz");

        // 6. CIERRE: Hace que el programa se cierre por completo cuando pulsas la 'X' de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 7. VISIBILIDAD: Hace que la ventana aparezca físicamente en tu pantalla
        this.setVisible(true);
    }

    // Este es el punto de inicio de cualquier programa en Java
    public static void main(String[] args) {

        // Al poner "new Main()", el programa viaja arriba, ejecuta el constructor y abre la ventana
        Main main = new Main();
    }
}
