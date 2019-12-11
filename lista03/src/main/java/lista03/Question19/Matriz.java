/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question19;

/**
 *
 * @author visitante
 */
public class Matriz {
    
    private Integer[][] matriz;

    public Matriz(Integer[][] matriz) {
        this.matriz = matriz;
    }

    Matriz soma(Matriz matriz) throws InvalidDimensionException {
        Integer[][] m1 = this.matriz;
        Integer[][] m2 = matriz.getMatriz();
        
        if (m1.length != m2.length) {
            throw new InvalidDimensionException("As dimensoes da matriz devem ser iguais");
        }
        
        Integer[][] soma = new Integer[m1.length][m1.length];
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                soma[i][j] = m1[i][j] + m2[i][j];
            }
        }
        
        return new Matriz(soma);
    }

    Matriz subtrai(Matriz matriz) throws InvalidDimensionException {
        Integer[][] m1 = this.matriz;
        Integer[][] m2 = matriz.getMatriz();
        
        if (m1.length != m2.length)
            throw new InvalidDimensionException("As dimensoes da matriz devem ser iguais");
        
        Integer[][] subtracao = new Integer[m1.length][m1.length];
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                subtracao[i][j] = m1[i][j] - m2[i][j];
            }
        }
        
        return new Matriz(subtracao);
    }

    /**
     * @return the matriz
     */
    public Integer[][] getMatriz() {
        return matriz;
    }
    
    @Override
    public String toString() {
        String template = "";
        
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                template += this.matriz[i][j] + " ";
            }
            
            template += "\n";
        }
        
        return template;
    }
}
