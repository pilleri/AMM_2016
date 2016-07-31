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
public class Objectsale {
                
     private String nome;
     private String descrizione;
     private String indirizzo;
     private int pezzi;
     private Double prezzo;
    
    public Objectsale(){
        
        this.nome = "";
        this.descrizione="";
        this.indirizzo="";
        this.pezzi = pezzi;
        this.prezzo= prezzo;
    
                        }
            



    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getDescrizione() {
        return descrizione;
    }

    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    
    public String getIndirizzo() {
        return indirizzo;
    }

    
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getPezzi() {
        return pezzi;
    }

    
    public void setPezzi(int pezzi) {
        this.pezzi = pezzi;
    }
    
    public Double getPrezzo() {
        return prezzo;
    }

    
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

}