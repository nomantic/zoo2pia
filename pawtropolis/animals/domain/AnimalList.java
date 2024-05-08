package pawtropolis.animals.domain;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private List<Animal> animals;

    public AnimalList(){
    this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);

    }

    public Animal remove(int index) {
        return animals.remove(index);
    }

    public void add(Animal animal) {
        animals.add(animal);
    }
    public Animal get(int index) {
        return animals.get(index);
    }

    @Override
    public String toString() {
        return "AnimalList{" +
                "animals=" + animals +
                '}';
    }
}


