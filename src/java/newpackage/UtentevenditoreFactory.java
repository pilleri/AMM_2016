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
public class UtentevenditoreFactory {
    
    ArrayList<Utentevenditore> listaUtentiVenditori = new ArrayList<Utentevenditore>();
    
    
    public UtentevenditoreFactory(){
    
        
        Utentevenditore venditore1= new Utentevenditore();
        venditore1.setNome("Eichiro");
        venditore1.setCognome("Oda");
        venditore1.setUsername("kaisok");
        venditore1.setPassword("3593"); 
        Saldo saldo1=new Saldo();
        saldo1.setSaldo(100.0);
        venditore1.setSaldo(saldo1);
        listaUtentiVenditori.add(venditore1);
    
        Utentevenditore venditore2= new Utentevenditore();
        venditore2.setNome("Masashi");
        venditore2.setCognome("Kishimoto");
        venditore2.setUsername("sakura");
        venditore2.setPassword("4098"); 
        Saldo saldo2=new Saldo();
        saldo2.setSaldo(140.0);
        venditore2.setSaldo(saldo2);
        listaUtentiVenditori.add(venditore2);    
        
    
    
                    }
    
    
    public ArrayList getListaUtentiVenditori(){
        return listaUtentiVenditori;
    }
    
}
