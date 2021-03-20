package facens.br.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Exemplo01 {
   
   public static void main(String[] args) {
      List <String> list1 = Arrays.asList("CCC","BBB","AAA");

      System.out.println("\nSet:");
      
      HashSet<String> set1 = new HashSet<>();
      set1.addAll(list1);
      set1.add("BB");
      set1.forEach(s -> System.out.println(s));

      System.out.println("\nTreeSet:");

      TreeSet<String> set2 = new TreeSet<>();
      set2.addAll(list1);
      set2.forEach(s -> System.out.println(s));

      
   }
}
