package medical.core.helpers;

import java.util.ArrayList;
import java.util.Scanner;

public class PreencheObjeto {
    
    private static Integer lerInteger(Scanner scan) {
        return Integer.parseInt(scan.nextLine());
    }
    
    private static String lerString(Scanner scan) {
        return scan.nextLine();
    }
    
    private static Double lerDouble(Scanner scan) {
        return Double.parseDouble(scan.nextLine());
    }    
            
    private static Object ler(Scanner scan, String tipo) {
        switch(tipo) {
            case "s":
                return lerString(scan);
            case "i":
                return lerInteger(scan);
            case "d":
                return lerDouble(scan);
            default:
                return lerString(scan);
        }
    }
    
    public static void preencher(ScanInterface o) {
        String[] tipos = o.getTipos();
        String[] atributos = o.getAtributos();
        ArrayList<Object> valores = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < atributos.length; i++) {
            System.out.print(atributos[i] + ": ");
            valores.add(ler(scan, tipos[i]));
        }
        
        o.setValores(valores);
    }
    
}
