package za.ac.cput.projects.ArtRepository;

public interface IRepository <T ,ID> {

    T create(T t);
    void delete(ID id);
    T update(T t);
    T read(T t);


}
