package za.ac.cput.projects.Factories.ProductionFactories;

import za.ac.cput.projects.Domain.Production.ProdManager;
import za.ac.cput.projects.Domain.Production.Producer;
import za.ac.cput.projects.Util.Helper;

public class ProducerFactory {
    private static final String SUFFIX = Helper.getSuffixFromClassName(Producer.class);
    public static Producer createProducer(String prodNm,String prodNumb,double prodRate,String prodId)
    {
        String id = Helper.generateRandomGivenSuffix(SUFFIX);
        return new Producer.Builder()
                .prodId(id)
                .prodName(prodNm)
                .prodNumber(prodNumb)
                .prodRate(prodRate)
                .build();
    }
}
