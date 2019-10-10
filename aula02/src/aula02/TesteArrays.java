package aula02;

public class TesteArrays {

    public static void main(String[] args) {
        
        int[] v1 = {10, 20, 30, 40, 50};
        int v2 [] = {1, 2, 3, 4, 5};
        int [] v3 = new int [5];
        
        v1[0] = 10;
        v1[1] = 20;
        v1[2] = 30;
        v1[3] = 40;
        v1[4] = 50;
        
        System.out.println("Tamanho do array: " + v1.length);

        // loops
        for (int i=0;i<v1.length;i++) {
            System.out.println(v1[i]);
        }

        System.out.println();
        
        int i = 0;

        while (i < v1.length) {
            System.out.println(v1[i] + ", ");
            i++;
        }

        System.out.println();

        i = 0;

        do{
            System.out.println(v1[i] + ", ");
            i++;
        } while (i < v1.length);

        System.out.println();

        for (int j: v1)
            System.out.print(j + ", ");

        System.out.println();
         
    }
}

