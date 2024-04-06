package org.generation.italy;

import java.util.Optional;

import org.generation.italy.model.Inventory;
import org.generation.italy.model.Item;

public class Start {
    // Create un gioco in cui il giocatore possa muoversi attraverso una serie di stanze collegate tra di loro, 
    // leggere la descrizione della stanza in cui si e' mosso , raccogliere oggetti in una stanza e 
    // depositarli in un altra.. e verificare quali oggetti sono in suo possesso in un determinato momento. 
    // Il gioco iniziera' con il giocatore collocato nella stanza centrale, che chiameremo Market Square... 
    // ogni stanza ha un massimo di 4 uscite, a nord, sud, est e ovest...  
    // Quando il giocatore vede stampata la descrizione delal stanza questa descrizione spedifichera' 
    // anche qualsi uscite sono disponibili... a questo punto il giocatore puo dare un comando 
    // come N o S o E o W e il gioco , se esiste una stanza in questa direzioen simulera' il suo trasferimento 
    // in questa stanza dandogli la descrizione della stanza, se non c'e' nessuna stanza in quella direzione 
    // rispondera' con un messaggio di errore dicendo "non puoi andare in quella direzione"
    // Ogni stanza puo' contenere degli oggetti che il giocatore puo' prelevare dando un comando tipo "pick nomeoggetto" e ,
    // una volta che posssiede quell' oggetto, puo' depositarlo nella stanza in cui si trova con il comando "drop nomeoggetto".
    //  Il giocatore puo' anche eseguire un comando "inv" per veder stampato l' inventory degli oggetti che possiede in queel 
    //  momento
    // - simulare giochino—> adventure via testo. voglio creare un mondo costruito da stanze,
    //  connesse tra loro da punti cardinali , c’è piazza centrale con 4 uscite. 
    //  gioco dice sei in piazza centrale e ti dice che uscite hai ma non cosa c’è nelle stanza. 
    //  in altre magari solo n e e. dici n entri in panetteria. c’é solo uscita sud. finisci in piazza del mercato. 
    //  e giardini della città. 8 stanze collegate tra loro. e in ogni stanza ci sono oggetti tipo panetteria c’è panettiere, 
    //  2 baguette 1 dolce ala panna. giocatore pickBaguette. gioco ti dice hai preso una baguette. 
    //  pickTorta, poi inventory a prescindere da stanza ti dice che inventario hai. e puoi droppare oggetti.
    //   dropBaguette. se entro in piazza mi dice c’è baguette per terra. “sei nella pizza è fatta così, uscite, 
    //   cosa c’era e cosa hai drappato(vedi: lista di cose che vedi)” comando look per vedere le cose. 
    //   se prendi due volte 1 sola cosa” non c’è nessuna baguette da prendere”
    //  1 sola classe 
    public static void main(String[] args) {
        Item[] items={};
        Inventory x=new Inventory(items);
        Optional<Item> appleOpt=x.remove("Apple");
        //apple è null
        if(appleOpt.isPresent()){
            Item a=appleOpt.get(); //metodo get di optional che ti restituisce oggetto
            System.out.println(a.getName()); 
        }
        //oggetto optional è generics 
    }
}
