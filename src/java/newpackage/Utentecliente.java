/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;



/**
 *
 * @author Nicola
 */
public class Utentecliente {
        
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private Saldo saldo;
    
    public Utentecliente() {
        
        this.nome="";
        this.cognome="";
        this.username="";
        this.password ="";
        this.saldo= new Saldo();
        
        
    }
    
    
    
         public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }   
    
    
     public String getCognome() {
        return cognome;
    }

     
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

    
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public Saldo getSaldo() {
        return saldo;
    }
    
    
    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }
    
    
                
    
}
