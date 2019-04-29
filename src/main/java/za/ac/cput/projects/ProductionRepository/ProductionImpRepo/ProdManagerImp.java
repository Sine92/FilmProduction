package za.ac.cput.projects.ProductionRepository.ProductionImpRepo;

import za.ac.cput.projects.Production.ProdManager;
import za.ac.cput.projects.ProductionRepository.ProdManagerRepo;

import java.util.Set;

public class ProdManagerImp implements ProdManagerRepo {

    private static ProdManagerImp prodManagerImp;
    private Set<ProdManager> prodManagerSet;
    public static  ProdManagerImp getProdManagerImp()
    {
        if(prodManagerImp == null) prodManagerImp = new ProdManagerImp();
        return  prodManagerImp;
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
    public void delete(String s) {
        prodManagerSet.removeIf(t->t.getPrManName().equals(s));

    }

    @Override
    public ProdManager update(ProdManager prodManager) {
        if(prodManagerSet.contains(prodManager))
        {
            for(ProdManager prodManager1:prodManagerSet)
            {
                if(prodManager1.equals(prodManager))
                {
                    return prodManager1;
                }
            }
        }
        return null;
    }

    @Override
    public ProdManager read(ProdManager prodManager) {
        if(prodManagerImp.prodManagerSet.contains(prodManager))
        {
            for(ProdManager prodManager1: prodManagerSet)
            {
                if(prodManager1.equals(prodManager))
                {
                    return prodManager1;
                }
            }
        }
        return null;
    }
}
