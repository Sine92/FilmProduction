package za.ac.cput.projects.Factories.ArtFactories;

import za.ac.cput.projects.Domain.Art.ArtDirector;
import za.ac.cput.projects.Util.Helper;

public class ArtDirectorFactory {
private static final String SUFFIX = Helper.getSuffixFromClassName(ArtDirectorFactory.class);
    public static ArtDirector createArtDirector(String adNAme,String adNumber, double adRate,String artId){
       String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return  new ArtDirector
                .Builder()
                .artDirectorName(adNAme)
                .artDirectorNumber(adNumber)
                .artDirectorRate(adRate)
                .artId(id)
                .build();

    }
}
