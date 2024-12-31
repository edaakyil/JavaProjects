package com.edaakyil.app;

import com.edaakyil.app.game.fighter.Fighter;
import com.karandev.io.util.console.Console;

public class App {
    public static void main(String[] args)
    {
        Fighter f = new Fighter("Blanka");

        f.setMana(34);
        f.setCombo(345);
        f.setHealth(96);
        f.setAgility(45);
        f.setStrength(56);

        Console.writeLine("Total: %d, Average: %f", f.abilityTotal(), f.abilityAverage());
    }
}