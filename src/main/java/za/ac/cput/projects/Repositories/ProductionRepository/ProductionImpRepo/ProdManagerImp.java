package za.ac.cput.projects.Repositories.ProductionRepository.ProductionImpRepo;

import za.ac.cput.projects.Domain.Production.ProdManager;
import za.ac.cput.projects.Repositories.ProductionRepository.ProdManagerRepo;

import java.util.Set;

public class ProdManagerImp implements ProdManagerRepo {

    private static ProdManagerImp prodManagerImp;
    private Set<ProdManager> prodManagerSet;
    public static  ProdManagerImp getProdManagerImp()
    {
        if(prodManagerImp == null) prodManagerImp = new ProdManagerImp();
        return  prodManagerImp;
    }
    private ProdManager findProdManager(String prId)
    {
        return this.prodManagerSet.stream()
                .filter(prodManager -> prodManager.getPrId().trim().equals(prId))
                .findAny()
                .orElse(null);
    }

    @Override
    public Set<ProdManager> getAll() {
        return prodManagerSet;
    }

    @Override
    public ProdManager create(ProdManager prodManager) {
        this.prodManagerSet.add(prodManager);

        return prodManager;
    }

    @Override
    public void delete(String prId) {
         ProdManager toDelete = findProdManager(prId);
         if(toDelete!=null){
             this.prodManagerSet.remove(prId);
         }

    }

    @Override
    public ProdManager update(ProdManager prodManager) {
       ProdManager toUpdate = findProdManager(prodManager.getPrId());
       if(toUpdate!=null){
           this.prodManagerSet.remove(toUpdate);
           return create(prodManager);
       }
       return null;
    }

    @Override
    public ProdManager read(String prId) {
       ProdManager prodManager = findProdManager(prId);
       return prodManager;
    }
}
