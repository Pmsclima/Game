package org.academiadecodigo.bootcamp.codebytes.engine;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.menus.Menu;
import org.academiadecodigo.bootcamp.codebytes.objectfactory.GameObjectsType;
import org.academiadecodigo.bootcamp.codebytes.objects.figures.Player;

public class Game {


    private Player player;
    private GameObjectsType gameObjectsType;
    private int points;
    private int lifes;

    public Game() {
    }

    public void init(){
        Grid grid = new Grid();
        grid.initialization();
        Menu.MenuRepresentation menu = new Menu.MenuRepresentation();
        try {
            menu.init();
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    public void start(){

    }

    public void gameOver(){

    }

    public int getPoints() {
        return points;
    }

    public int getLifes() {
        return lifes;
    }
}
