package za.ac.cput.projects.CameraRepository.CamAsRepoImpl;

import za.ac.cput.projects.Camera.FocusPuller;
import za.ac.cput.projects.CameraRepository.FocusPullerRepository;

import java.util.HashSet;
import java.util.Set;

public class FocusPullerImp implements FocusPullerRepository {

    private static FocusPullerImp focPullRepo = null;
    private Set<FocusPuller> focusPullerSet;
    private FocusPullerImp()
    {
      this.focusPullerSet = new HashSet<>();
    }
    public static FocusPullerImp getFocPullRepo()
    {
        if(focPullRepo == null) focPullRepo = new FocusPullerImp();
        return focPullRepo;
    }

    @Override
    public Set<FocusPuller> getAll() {
        return focusPullerSet;
    }

    @Override
    public FocusPuller create(FocusPuller focusPuller) {

        this.focusPullerSet.add(focusPuller);
        return focusPuller;
    }

    @Override
    public void delete(String s) {
        focusPullerSet.removeIf(t->t.getFocusPName().equals(s));


    }

    @Override
    public FocusPuller update(FocusPuller focusPuller) {
        if(focusPullerSet.contains(focusPuller))
        {
            for(FocusPuller focusPuller1:focusPullerSet)
            {
                if(focusPuller1.equals(focusPuller))
                {
                    return focusPuller1;
                }
            }
        }
        return null;
    }

    @Override
    public FocusPuller read(FocusPuller focusPuller) {
        if(focPullRepo.focusPullerSet.contains(focusPuller))
        {
            for(FocusPuller focusPuller1:focusPullerSet)
            {
                if(focusPuller1.equals(focusPuller))
                {
                    return focusPuller1;
                }
            }
        }
        return null;
    }
}
