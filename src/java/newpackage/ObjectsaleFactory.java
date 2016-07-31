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
public class ObjectsaleFactory {
    
    ArrayList<Objectsale> listaObj = new ArrayList<Objectsale>();
    
    
    public ObjectsaleFactory(){
    
            Objectsale oggetto1 = new Objectsale();
            oggetto1.setNome("FIFA16");
            oggetto1.setDescrizione("Gioco");
            oggetto1.setIndirizzo("Fifa.png");
            oggetto1.setPezzi(5);
            oggetto1.setPrezzo(69.99);
            listaObj.add(oggetto1);
        
            Objectsale oggetto2 = new Objectsale();
            oggetto2.setNome("Naruto");
            oggetto2.setDescrizione("Gioco");
            oggetto2.setIndirizzo("Shippuden.png");
            oggetto2.setPezzi(3);
            oggetto2.setPrezzo(69.99);
            listaObj.add(oggetto2);
        
            Objectsale oggetto3 = new Objectsale();
            oggetto3.setNome("Onepiece");
            oggetto3.setDescrizione("Gioco");
            oggetto3.setIndirizzo("opw.png");
            oggetto3.setPezzi(6);
            oggetto3.setPrezzo(69.99);
            listaObj.add(oggetto3);
        
            Objectsale oggetto4 = new Objectsale();
            oggetto4.setNome("UFO");
            oggetto4.setDescrizione("Gioco");
            oggetto4.setIndirizzo("aliens.png");
            oggetto4.setPezzi(9);
            oggetto4.setPrezzo(69.99);
            listaObj.add(oggetto4);
    
    
    
                    }
    
                    
}
