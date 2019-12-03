/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

/**
 *
 * @author visitante
 */
public class Question2 {
    
    public static String verifyUsernameEqualsPassword(String username, String password) {
        return username.equals(password) 
                ? "A senha não pode ser igual ao nome de usuário"
                : "Ok";
    }
    
}
