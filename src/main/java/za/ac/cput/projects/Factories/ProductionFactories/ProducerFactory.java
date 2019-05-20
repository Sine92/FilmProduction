package za.ac.cput.projects.Factories.ProductionFactories;

import za.ac.cput.projects.Domain.Production.Producer;

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
