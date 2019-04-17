package za.ac.cput.projects.Production.ProductionFactories;

import za.ac.cput.projects.Production.ProdManager;

public class ProdManagerFactory {

    public static ProdManager creatProdMan(String prodMName,String prodMNum,double prodMRate)
    {
        return new ProdManager.Builder()
                .prManName(prodMName)
                .prManNumber(prodMNum)
                .prManRate(prodMRate)
                .build();
    }
}
