package Lab12;

public class Falcon extends Animal {

    public Falcon(int maxSpeed) {
        super(maxSpeed);
        flyAble = new FlyWithWing();
    }
}
