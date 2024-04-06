package org.generation.italy.model;

public class Item {
    private String name;
    private boolean picked;
    private Room room;
    public Item(String name,boolean picked,Room room){
        this.name=name;
        this.picked=picked;
        this.room=room;
    }
    public boolean isPicked(){
        return picked;
    }
    public void setPicked(boolean picked){
        this.picked=picked;
    }
    public String getName(){
        return name;
    }

}
