package facens.br.java.collections;

import java.util.HashMap;

public class Exemplo3 {
   public static void main(String[] args) {
      //Guarda por chave e valor
      //Pode repetir
      // Se a ordme foi importante nao usar nenhum tipo de hash
      HashMap<Integer, String> map1 = new HashMap<>();
      map1.put(222, "Primeiro");
      map1.put(111, "Segundo");
      map1.put(444, "Terceiro");
      map1.put(333, "Quarto");

      for(String s: map1.values()){
         System.out.println(s);
      }

      for(Integer i: map1.keySet()){
         System.out.println(i);
      }

     

   } 
}
