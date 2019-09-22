package za.ac.cput.projects.Factories.ArtFactories;

import za.ac.cput.projects.Domain.Art.PropMaster;
import za.ac.cput.projects.Domain.Art.Props;
import za.ac.cput.projects.Util.Helper;

public class PropsFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(Props.class);
    public static Props ceateProps(String pNm, String pNum,double prate,String pId){
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
         return new Props
                 .Builder()
                 .propId(id)
                 .propsName(pNm)
                 .propsNumber(pNum)
                 .propsRate(prate)
                 .build();
    }
}
