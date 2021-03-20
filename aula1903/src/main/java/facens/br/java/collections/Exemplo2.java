package facens.br.java.collections;

import java.util.HashMap;

public class Exemplo2 {
   public static void main(String[] args) {
      //Guarda por chave e valor
      //Pode repetir
      HashMap<Integer, String> map1 = new HashMap<>();
      map1.put(100, "Primeiro");

      for(String s: map1.values()){
         
      }

      System.out.println(map1.get(100));

   } 
}
