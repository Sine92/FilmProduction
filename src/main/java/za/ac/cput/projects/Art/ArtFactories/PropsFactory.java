package za.ac.cput.projects.Art.ArtFactories;

import za.ac.cput.projects.Art.Props;

public class PropsFactory {

    public static Props ceateProps(String pNm, String pNum,double prate){
         return new Props
                 .Builder()
                 .propsName(pNm)
                 .propsNumber(pNum)
                 .propsRate(prate)
                 .build();
    }
}
