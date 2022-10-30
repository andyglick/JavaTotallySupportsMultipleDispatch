package org.zrgs.dispatch;

public class MultipleDispatch {

    public static void main(String[] args) {
        Asteroid a = new Asteroid();
        SpaceCruiser s = new SpaceCruiser();

        CanCollide canCollide = new Asteroid();

        a.collideWith(canCollide);

        a.collideWith(a); //ASTEROID ON ASTEROID COLLISION!!!
        a.collideWith(s); //ASTEROID ON CRUISER COLLISION!!!

        canCollide = new SpaceCruiser();

        s.collideWith(canCollide);

        s.collideWith(a); //CRUISER ON ASTEROID COLLISION!!!
        s.collideWith(s); //CRUISER ON CRUISER COLLISION!!!
    }
}
