package za.ac.cput.projects.Factories.ArtFactories;

import za.ac.cput.projects.Domain.Art.ArtDirector;

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
