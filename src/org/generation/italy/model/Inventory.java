package org.generation.italy.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class Inventory {
    private HashMap<String, ArrayList <Item>> itemMap=new HashMap<>();

    public Inventory(Item...items){
        for(Item i:items){
            this.add(i);
        }
    }
    public int add(Item item){//torna quanti oggetti di quel tipo 
        ArrayList<Item> items=itemMap.get(item.getName());
        if(items==null){
            items=new ArrayList<>();
            itemMap.put(item.getName(),items);//creiamo l'associazione con la mappa
        }
        items.add(item);
        return items.size();
    }
    public Optional<Item> remove(String itemName){ //controllare che arraylist sia popolato, cercare chiave e eliminare item
        ArrayList<Item> items=itemMap.get(itemName);
        if(items==null){
            return Optional.empty(); //crea scatola vuota
        }
        Item removed= items.remove(0); 
        if(items.isEmpty()){
            itemMap.remove(itemName);
        }
        return Optional.of(removed); //ritorna scatola con dentro oggetto di tipo item

    }


}
