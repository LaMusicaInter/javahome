package animals;


public class Pool extends Obstacle {
    private int lenght;

    public Pool(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Tiger tiger) {
        tiger.swim(lenght);
    }
}