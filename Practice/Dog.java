package Practice;

public class Dog extends Animal implements SampleInterface{

    private int count = 4;

    public Dog(String str){
        System.out.println("i am in Constructor!"+str);
    }


    @Override
    public void getMethod() {


    }


    @Override
    public int putMethod() {
        return 0;
    }

    /*@Override
    public void bark() {
        System.out.println("i am dog");
    }*/

    public void eat(String food){
        System.out.println("I am eating "+food);
    }

    public void eat(int food){
        System.out.println("I am eating "+food);
    }

    public static void main(String[] args) {

        Dog dog = new Dog("twice");

        dog.run();
        dog.eat(4);
    }

    @Override
    public void run() {
        System.out.println("I am running!");
    }
}
