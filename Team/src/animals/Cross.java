package animals;


public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Tiger tiger) {
        tiger.run(distance);
    }
}