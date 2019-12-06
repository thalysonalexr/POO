/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question12;

/**
 *
 * @author visitante
 */
class Email {
    
    private String email;
    private String provedor;

    public Email() {
    }

    public Email(String email, String provedor) {
        this.email = email;
        this.provedor = provedor;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the provedor
     */
    public String getProvedor() {
        return provedor;
    }

    /**
     * @param provedor the provedor to set
     */
    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }
    
    @Override
    public String toString() {
        return "E-mail: " + this.email + "@" + this.provedor;
    }
}
