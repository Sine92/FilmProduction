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
    private ProductionAssist findProdAss(String paId)
    {
        return  this.productionAssistSet.stream()
                .filter(productionAssist -> productionAssist.getPaId().trim().equals(paId))
                .findAny()
                .orElse(null);
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
    public void delete(String paId) {
       ProductionAssist toDelete = findProdAss(paId);
       if(toDelete!=null){
           this.productionAssistSet.remove(toDelete);
       }

    }

    @Override
    public ProductionAssist update(ProductionAssist productionAssist) {
            ProductionAssist toUpdate = findProdAss(productionAssist.getPaId());
            if(toUpdate!=null){
                this.productionAssistSet.remove(toUpdate);
                return create(productionAssist);
            }
      return null;
    }

    @Override
    public ProductionAssist read(String paId) {
        ProductionAssist productionAssist = findProdAss(paId);
        return productionAssist;

    }
}
