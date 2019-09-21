package za.ac.cput.projects.Services.StylingService.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.Domain.Styling.MakeUpAssist;
import za.ac.cput.projects.Domain.Styling.Wadrobe;
import za.ac.cput.projects.Repositories.StylingRepository.StylingImpRepository.WadrobeImp;
import za.ac.cput.projects.Services.StylingService.MakeUpService;
import za.ac.cput.projects.Services.StylingService.WadrobeService;

import java.util.Set;
 @Service("WadrobeServiceImpl")
public class WadrobeServiceImpl implements WadrobeService {

     @Autowired
     @Qualifier("WadrobeServiceImpl")
     private WadrobeServiceImpl service = null;
     private WadrobeImp wadrobeImp;


     @Override
     public Set<Wadrobe> getAll() {
         return wadrobeImp.getAll();
     }

     @Override
     public Wadrobe create(Wadrobe wadrobe) {
         return wadrobeImp.create(wadrobe);
     }

     @Override
     public Wadrobe update(Wadrobe wadrobe) {
         return wadrobeImp.update(wadrobe);
     }

     @Override
     public void delete(String s) {
         wadrobeImp.delete(s);

     }

     @Override
     public Wadrobe read(String s) {
         return wadrobeImp.read(s);
     }
 }
