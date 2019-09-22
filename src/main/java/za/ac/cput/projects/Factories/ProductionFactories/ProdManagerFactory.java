package za.ac.cput.projects.Factories.ProductionFactories;

import za.ac.cput.projects.Domain.Production.FirstAD;
import za.ac.cput.projects.Domain.Production.ProdManager;
import za.ac.cput.projects.Util.Helper;

public class ProdManagerFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(ProdManager.class);
    public static ProdManager creatProdMan(String prodMName,String prodMNum,double prodMRate)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new ProdManager.Builder()
                .prId(id)
                .prManName(prodMName)
                .prManNumber(prodMNum)
                .prManRate(prodMRate)
                .build();
    }
}
