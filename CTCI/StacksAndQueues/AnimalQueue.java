package CTCI.StacksAndQueues;

/*
 * Problem: Implement a data structure for an animal shelter which has either Dogs or Cats.
 * - first in first out service
 * - customers can choose from either oldest dogs or oldest cats (but not specific animal)
 *
 * SOLUTION: this is with two LinkedLists dog and cat each
 * */

import java.util.LinkedList;

abstract class Animal{
    private int order;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    // method to compare orders
    public boolean isOlderThan(Animal a){
        return this.order < a.getOrder();
    }
}

public class AnimalQueue {

    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0;

    public void enqueue(Animal a){
        a.setOrder(order);
        order++;

        if (a instanceof Dog) dogs.addLast((Dog) a);
        else if (a instanceof Cat) cats.addLast((Cat) a);
    }

    public Animal dequeueAny(){
        if (dogs.isEmpty()){
            return dequeueCats();
        }else if (cats.isEmpty()){
            return dequeueDogs();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)){
            return dequeueDogs();
        }else {
            return dequeueCats();
        }
    }

    private Animal dequeueDogs() {
        return dogs.poll();
    }

    private Animal dequeueCats() {
        return cats.poll();
    }

}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
}
