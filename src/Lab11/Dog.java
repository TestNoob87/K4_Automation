package Lab11;


public class Dog extends Animal {

    public Dog(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    protected boolean flyAble() {
        return false;
    }
}
