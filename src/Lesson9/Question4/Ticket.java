package Lesson9.Question4;

public class Ticket {
    private int id;
    private String description;

    public Ticket(int id, String description){
        this.id = id;
        this.description = description;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString(){
        return "Ticket Id: " + id + "Description: " + description;
    }
}
