package application.collectionsJava;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Teste {
    public static void main(String[] args) {

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');

        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));

        System.out.println(consoantesMeuNome);
        System.out.println(coresDaBandeiraDoBrasil);
    }
}
