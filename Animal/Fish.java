//Author: JihanAlam16301199
//Fish Class
public class Fish extends Pet implements Animal{
    public Fish(){
        super.setName("Fish");
    }
    public Fish(String name){
        super.setName(name);
    }
    public void eat() {
        System.out.println(super.getName() + " is eating now.");
    }
    public void walk() {
        System.out.println(super.getName() + " cannot walk.");
    }
}
