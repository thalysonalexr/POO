/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question11;

/**
 *
 * @author visitante
 */
public class Teste {
    
    public static void main(String[] args) {
        
        System.out.println(validateCpf("048.180.131-61"));
        
    }
    
    public static boolean validateCpf(String cpf) {
        
        char[] permitidos = new char[]{'-','.', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        if (cpf.length() != 14)
            return false;
        
        if ('.' != cpf.charAt(3) || '.' != cpf.charAt(7) || '-' != cpf.charAt(11)) {
            return false;
        }
        
        for (int i = 0; i < cpf.length(); i++) {
            boolean contem = false;
            for (int j = 0; j < permitidos.length; j++) {
                if (cpf.charAt(i) == permitidos[j]) {
                    contem = true;
                    break;
                }
            }
            
            if (!contem) {
                return false;
            }
        }
        
        return true;
    }
    
}
