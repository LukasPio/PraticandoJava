package praticando.soCodando.test;

import praticando.soCodando.dominio.Dog;
import praticando.soCodando.dominio.People;

public class peopleDogTest {
    public static void main(String[] args) {
        People people = new People("Neymar", 34);
        Dog dog = new Dog("Bemji", "mutt", people);
        people.setDog(dog);

        people.toCall();
        dog.bark();
    }
}
