//Author: JihanAlam16301199
//Cat Class
public class Cat extends Pet implements Animal{
    public Cat(){
        super.setName("Garfield");
    }
    public Cat(String name){
        super.setName(name);
    }
    public void play(){
        super.play();
    }
    public void eat() {
        System.out.println(super.getName() + " is eating now.");
    }
    public void walk() {
        System.out.println(super.getName() + " is walking.");
    }
}