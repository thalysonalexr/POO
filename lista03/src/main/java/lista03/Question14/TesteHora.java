package lista03.Question14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thalyson
 */
public class TesteHora {
    
    public static void main(String[] args) {
        
        Hora horas = new Hora(14, 26, 5);
        
        System.out.println(horas);
        System.out.println(horas.getSegundos());
        System.out.println(horas.getMinutos());
        System.out.println(horas.getHoras());
    }
    
}
