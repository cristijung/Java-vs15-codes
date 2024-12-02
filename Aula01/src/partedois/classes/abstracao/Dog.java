package partedois.classes.abstracao;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " diz: Au Au!!");
    }
}
