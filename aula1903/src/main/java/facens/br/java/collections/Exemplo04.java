package facens.br.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Exemplo04 {
   public static void main(String[] args) {
      
      List<Product> list1 = Arrays.asList(
         new Product(10l, "Product 3", 300.0),
         new Product(15l, "Product 2", 30.0),
         new Product(11l, "Product 2", 600.0),
         new Product(11l, "Product 2", 600.0),
         new Product(13l, "Product 1", 500.0),
         new Product(12l, "Product 1", 400.0)
      );

      HashSet<Product> set1 = new HashSet<>();
      //Utiliza o equals para validar que não vai repetir
      set1.addAll(list1);
      set1.forEach( s -> System.out.println(s));

      TreeSet<Product> set2 = new TreeSet<>();
      //Por conta do TreeSet ser ordenado é necessario elaborar o metodo comparable para
      set2.addAll(set1);
      set2.forEach( s -> System.out.println(s));

   }
}
