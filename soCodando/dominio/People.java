package praticando.soCodando.dominio;

import praticando.soCodando.dominio.Dog;

public class People {
    protected String name;
    protected int age;
    protected Dog dog;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void toCall () {
        System.out.println(this.name + ": Come on sir " + this.dog.getNome());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
