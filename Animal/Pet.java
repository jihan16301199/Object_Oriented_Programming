//Author: JihanAlam16301199
//Pet Abstract Class
public abstract class Pet {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void play(){
        System.out.println(name+" is playing now.");
    }
}
