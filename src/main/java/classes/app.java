package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thiagoabaguiar
 */
public class app {

    public static void main(String[] args) {
            
        List<String> palavras = new ArrayList<String>();
        
        Comparator<String> comparadorPorTamanho = new ComparadorPorTamanho();
        
        palavras.add("Java");
        palavras.add("Spring");
        palavras.add("Amazon Web Services");
        palavras.add("AWS");
        palavras.add("Framework");
        palavras.add("DML");
        
        // Ordem alfabética (default do método sort)
        Collections.sort(palavras);
        System.out.println(palavras);

        // Criando um comparador customizado, baseado no tamanho de cada String
        Collections.sort(palavras, comparadorPorTamanho);        
        System.out.println(palavras);
        
        // Simplificando o código, usando o comparador customizado
        palavras.sort(comparadorPorTamanho);
        System.out.println(palavras);
        
        // Simplificando ainda mais o código, usando o método compare existente
        // dentro da classe Integer + Lambda. Sem necessidade de criar comparador customizado        
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));        
        System.out.println(palavras);
        
    }
}
