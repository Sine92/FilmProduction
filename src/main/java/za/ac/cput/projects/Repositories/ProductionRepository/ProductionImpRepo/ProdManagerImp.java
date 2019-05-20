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
    public ProdManager read(String s) {
        if(prodManagerImp.prodManagerSet.contains(s))
        {
            for(ProdManager prodManager1: prodManagerSet)
            {
                if(prodManager1.equals(s))
                {
                    return prodManager1;
                }
            }
        }
        return null;
    }
}
