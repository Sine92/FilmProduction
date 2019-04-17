package za.ac.cput.projects.Art.ArtFactories;

import za.ac.cput.projects.Art.ArtDirector;

public class ArtDirectorFactory {

    public static ArtDirector createArtDirector(String adNAme,String adNumber, double adRate ){

        return  new ArtDirector
                .Builder()
                .artDirectorName(adNAme)
                .artDirectorNumber(adNumber)
                .artDirectorRate(adRate)
                .build();

    }
}
