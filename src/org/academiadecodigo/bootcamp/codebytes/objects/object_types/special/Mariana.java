package org.academiadecodigo.bootcamp.codebytes.objects.object_types.special;

import org.academiadecodigo.bootcamp.codebytes.engine.Game;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Mariana extends GameObject implements Special {

    public Mariana(GridPosition position) {
        super(position, GameObjectType.MARIANA);
    }

    @Override
    public void specialFeature() {
        if (Game.getLifes()<3) {
            Game.increaseLife();
        }
    }
}
