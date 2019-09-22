package za.ac.cput.projects.Repositories.CameraRepository.CamAsRepoImpl;

import za.ac.cput.projects.Domain.Camera.FocusPuller;
import za.ac.cput.projects.Repositories.CameraRepository.FocusPullerRepository;

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
    private FocusPuller findFocusPuller(String focusPullerId){
        return this.focusPullerSet.stream()
                .filter(focusPuller -> focusPuller.getFocusPullerId().trim().equals(focusPullerId))
                .findAny()
                .orElse(null);
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
    public void delete(String focusPullerId) {
    FocusPuller toDelete = findFocusPuller(focusPullerId);
    if(toDelete!=null){
        this.focusPullerSet.remove(toDelete);
    }

    }

    @Override
    public FocusPuller update(FocusPuller focusPuller) {
        FocusPuller toUpdate = findFocusPuller(focusPuller.getFocusPullerId());
        if(toUpdate!=null){
            this.focusPullerSet.remove(toUpdate);
            return create(focusPuller);
        }
return  null;
    }

    @Override
    public FocusPuller read(String focusPullerId) {

        FocusPuller focusPuller = findFocusPuller(focusPullerId);
        return focusPuller;
    }
}
