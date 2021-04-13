package trimestre3;
//hola
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ej107 {

    public static void main(String[] args) {
        String frase;
        Scanner teclado = new Scanner(System.in);
        Map<String, Integer> texto = new HashMap<>();
        do {
            System.out.println("Introduce frases, para salir deja una linea en blanco");
            System.out.println(">------------------------------------------------------<");
            frase = teclado.nextLine();
            String[] partes = frase.split(" ");
            if (frase.length() != 0) {
                for (int i = 0; i < partes.length; i++) {
                    if (texto.containsKey(partes[i])) {
                        texto.replace(partes[i], texto.get(partes[i]) + 1);
                    } else {
                        texto.put(partes[i], 1);
                    }
                }
            }
        } while (frase.length() != 0);
        for (String roam : texto.keySet()) {
            System.out.println("La palabra " + roam + " aparece " + texto.get(roam) + " veces");
        }
    }
}
