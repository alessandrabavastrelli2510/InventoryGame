package org.generation.italy.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
    private HashMap<Room,HashMap<Cardinal,Room>> exits = new HashMap<>(); //array? con ordinal()
    //private ArrayList <Item> items=new ArrayList<>();
    //private HashMap <String,Item> items=new HashMap<>();
    private Inventory inv;
    private String description;
    public Room(String description, Item... items){ //varargs (variable arguments)
        this.exits=new HashMap<>();
        this.description=description;
        
    }



}
