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
        
        Collections.sort(palavras);
        System.out.println(palavras);
        
        Collections.sort(palavras, comparadorPorTamanho);        
        System.out.println(palavras);
        
        palavras.sort(comparadorPorTamanho);
        System.out.println(palavras);
        
    }
}
