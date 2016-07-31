/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author Nicola
 */
public class UtenteClienteFactory {
    
     ArrayList<Utentecliente> listaUtentiClienti = new ArrayList<Utentecliente>();
     
     public UtenteClienteFactory(){
     
     
        Utentecliente cliente1 = new Utentecliente();
        cliente1.setNome("Nicola");
        cliente1.setCognome("Pilleri");
        cliente1.setUsername("piler");
        cliente1.setPassword("3911");
        Saldo saldo3=new Saldo();
        saldo3.setSaldo(150.0);
        cliente1.setSaldo(saldo3);
        listaUtentiClienti.add(cliente1);
        
        Utentecliente cliente2 = new Utentecliente();
        cliente2.setNome("Nicola");
        cliente2.setCognome("Pilleri");
        cliente2.setUsername("piler");
        cliente2.setPassword("3911");
        Saldo saldo4=new Saldo();
        saldo4.setSaldo(198.0);
        cliente2.setSaldo(saldo4);
        listaUtentiClienti.add(cliente1);
     
                        }
     
     public ArrayList getListaUtentiClienti(){
        return listaUtentiClienti;
    }
    
    
     
     
    
}
