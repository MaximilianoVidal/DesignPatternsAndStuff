package AbtractFactory;

public interface Enemy extends Character{
    byte points();
    @Override
    default int totalPoints(){return 0;}
}
