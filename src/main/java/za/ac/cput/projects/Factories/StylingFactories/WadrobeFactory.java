package za.ac.cput.projects.Factories.StylingFactories;

import za.ac.cput.projects.Domain.Styling.Wadrobe;

public class WadrobeFactory {

    public static Wadrobe createWadrop(String wadNam, String wadNum, double wadRate)
    {
        return new Wadrobe.Builder()
                .wadName(wadNam)
                .wadNumber(wadNum)
                .wadRate(wadRate)
                .build();
    }
}
