package stacksandqueues.utilities;

import stacksandqueues.Queue;

import java.util.NoSuchElementException;

public class AnimalShelter {
    Queue<Cat> cats;
    Queue<Dog> dogs;

    public AnimalShelter(){
        this.cats = new Queue<>();
        this.dogs = new Queue<>();
    }

    public void enqueue(Animal animal) {
        // instanceof & polymorphism examples:
        // https://www.artima.com/objectsandjava/webuscript/PolymorphismInterfaces1.html
        if ( animal instanceof Cat ) {
            cats.enqueue((Cat)animal);
        } else if ( animal instanceof Dog ) {
            dogs.enqueue((Dog)animal);
        } else {
            throw new IllegalArgumentException("This animal shelter only accepts Cats and Dogs");
        }
    }

    public Animal dequeue(String pref) {
        if ( pref.equals("cat") || pref.equals("Cat") ) {
            try {
                Cat yourCat = cats.dequeue();
                System.out.println("You have adopted " + yourCat + ". " + yourCat.getName() + " says " + yourCat.makeNoise() + "!");
                return yourCat;
            } catch (NoSuchElementException e) {
                System.out.println("Sorry, but we don't have any cats right now.");
                return null;
            }

        } else if ( pref.equals("dog") || pref.equals("Dog") ) {
            try {
                Dog yourDog = dogs.dequeue();
                System.out.println("You have adopted " + yourDog + ". " + yourDog.getName() + " says " + yourDog.makeNoise() + "!");
                return yourDog;
            } catch (NoSuchElementException e) {
                System.out.println("Sorry, but we don't have any dogs right now.");
                return null;
            }
        } else {
            return null;
        }
    }
}
