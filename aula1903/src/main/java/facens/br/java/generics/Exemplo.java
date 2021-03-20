package facens.br.java.generics;

import facens.br.java.collections.Product;

public class Exemplo {
   public static void main(String[] args) {
      MinhaClasse m = new MinhaClasse();
      m.add("BBB","333");
      m.add("AAA","444");
      m.add("III","111");

      MinhaClasseGenerica <String, String> m1 = new MinhaClasseGenerica<>();
      m1.add("SSS", "555");
      MinhaClasseGenerica <Integer, String> m2 = new MinhaClasseGenerica<>();
      m2.add(7, "T");
      MinhaClasseGenerica <Long, Product> m3 = new MinhaClasseGenerica<>();
      m3.add(1l, new Product(11l, "P1", 300.0));

   }
}
