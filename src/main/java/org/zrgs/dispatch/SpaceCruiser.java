package org.zrgs.dispatch;

/**
 * @author glick
 */
public class SpaceCruiser implements CanCollide {

    private static final String COLLIDES_WITH = " collides with ";

    public void collideWith(CanCollide unspecified) {
        //If multiple dispatch is supported, this method should not be called
        System.out.println(this.getClass().getSimpleName() + COLLIDES_WITH + unspecified.getClass().getSimpleName());
    }

    public void collideWith(Asteroid asteroid) {
        System.out.println(this.getClass().getSimpleName() + COLLIDES_WITH + asteroid.getClass().getSimpleName());
    }

    public void collideWith(SpaceCruiser cruiser) {
        System.out.println(this.getClass().getSimpleName() + COLLIDES_WITH + cruiser.getClass().getSimpleName());
    }
}
