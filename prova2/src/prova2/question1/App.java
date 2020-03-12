package prova2.question1;

import prova2.question1.MeuArrayList;

public class App {

    public static void main(String[] args) {
        
        // question 1
        MeuArrayList arr = new MeuArrayList(6);

        System.out.println(arr); // [null, null, null, null, null, null]
        
        arr.add("Thalyson");
        arr.add("Maria");
        arr.add("João");
        arr.add(819);
        
        System.out.println(arr); // [Thalyson, Maria, João, 819, null, null]
        
        System.out.println(arr.get(0)); // Thalyson
        System.out.println(arr.get(3)); // 819
        
        // question 2
        
    }
    
}
