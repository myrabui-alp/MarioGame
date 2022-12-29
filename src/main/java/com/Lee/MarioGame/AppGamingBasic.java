package com.Lee.MarioGame;
import com.Lee.MarioGame.GameRunner;
import com.Lee.MarioGame.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args){
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}