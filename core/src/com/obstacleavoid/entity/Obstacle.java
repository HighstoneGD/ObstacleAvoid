package com.obstacleavoid.entity;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;

public class Obstacle extends GameObjectBase {

    private static final float BOUNDS_RADIUS = 0.3f;
    private static final float SIZE = BOUNDS_RADIUS * 2;

    private float ySpeed = 0.1f;

    public Obstacle() {
        super(BOUNDS_RADIUS);
    }

    public void update() {
        setY(getY() - ySpeed);
    }

    public static float getWidth() {
        return SIZE;
    }

    public boolean isPlayerColliding(Player player) {
        Circle playerBounds = player.getBounds();
        return Intersector.overlaps(playerBounds, getBounds());
    }
}
