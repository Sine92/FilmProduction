package za.ac.cput.projects.Production.ProductionFactories;

import za.ac.cput.projects.Production.Producer;

public class ProducerFactory {

    public static Producer createProducer(String prodNm,String prodNumb,double prodRate)
    {
        return new Producer.Builder()
                .prodName(prodNm)
                .prodNumber(prodNumb)
                .prodRate(prodRate)
                .build();
    }
}
