/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question10;

import java.util.ArrayList;

/**
 *
 * @author visitante
 */
public final class NumerosPrimos {
    
    private int inicio;
    private int fim;
    private ArrayList<Integer> primos = new ArrayList<>();

    public NumerosPrimos(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.calcula(inicio, fim);
    }
    
    protected void calcula(int inicio, int fim) {
        
        for (int i = inicio; i <= fim; i++) {
            int totalDivisoes = 0;
        
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    totalDivisoes++;
                }
            }
            
            if (totalDivisoes == 2) {
                this.primos.add(i);
            }
        }
    }
    
    public ArrayList<Integer> retornaNumerosPrimos() {
        return this.primos;
    }

    /**
     * @return the inicio
     */
    public int getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fim
     */
    public int getFim() {
        return fim;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(int fim) {
        this.fim = fim;
    }
}
