package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import za.ac.cput.projects.Domain.Production.ProductionAssist;
import za.ac.cput.projects.Repositories.ProductionRepository.PARepo;

import java.util.Set;

public class ProdAssImp implements PARepo {

    private static ProdAssImp prodAssImp= null;
    private Set<ProductionAssist> productionAssistSet;
    public static ProdAssImp getProdAssImp()
    {
        if(prodAssImp == null)prodAssImp = new ProdAssImp();
        return prodAssImp;
    }

    @Override
    public Set<ProductionAssist> getAll() {
        return productionAssistSet;
    }

    @Override
    public ProductionAssist create(ProductionAssist productionAssist) {
        this.productionAssistSet.add(productionAssist);
        return productionAssist;
    }

    @Override
    public void delete(String s) {
        productionAssistSet.removeIf(t->t.getPaName().equals(s));

    }

    @Override
    public ProductionAssist update(ProductionAssist productionAssist) {

        if(productionAssistSet.contains(productionAssist))
        {
            for(ProductionAssist productionAssist1:productionAssistSet)
            {
                if(productionAssist1.equals(productionAssist))
                {
                    return productionAssist1;
                }
            }
        }
        return null;
    }

    @Override
    public ProductionAssist read(String s) {
        if(prodAssImp.productionAssistSet.contains(s))
        {
            for(ProductionAssist productionAssist1: productionAssistSet)
            {
                if(productionAssist1.equals(s))
                {
                    return productionAssist1;
                }
            }
        }
        return null;
    }
}
