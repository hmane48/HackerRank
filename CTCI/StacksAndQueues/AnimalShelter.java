package CTCI.StacksAndQueues;

/*
 * Problem: Implement a data structure for an animal shelter which has either Dogs or Cats.
 * - first in first out service
 * - customers can choose from either oldest dogs or oldest cats (but not specific animal)
 *
 * SOLUTION: this is with single LinkedList
 * */

import java.util.LinkedList;

public class AnimalShelter {

    class Animal {
        String type;
        int id;

        public Animal(String type, int id) {
            this.type = type;
            this.id = id;
        }
    }

    LinkedList<Animal> queue;

    public AnimalShelter() {
        queue = new LinkedList<>();
    }

    public void enqueue(Animal animal){
        queue.add(animal);
    }

    public String dequeueAny() {
        if (!queue.isEmpty()) {
            return queue.remove().type;
        }else {
            return null;
        }
    }

    public boolean dequeueDog() {
        if (!queue.isEmpty()) {
            Animal dog = null;
            for (Animal e : queue) {
                if (e.type.equalsIgnoreCase("dog")){
                    dog = e;
                    break;
                }
            }
            return (dog != null) ? queue.remove(dog) : false;
        }

        return false;
    }

    public boolean dequeueCat() {
        if (!queue.isEmpty()) {
            Animal cat = null;
            for (Animal e : queue) {
                if (e.type.equalsIgnoreCase("cat")){
                    cat = e;
                    break;
                }
            }
            return (cat != null) ? queue.remove(cat) : false;
        }

        return false;
    }
}
