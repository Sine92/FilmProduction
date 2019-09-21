package za.ac.cput.projects.Repositories;

public interface IRepository <T ,ID> {

    T create(T t);
    void delete(ID id);
    T update(T t);
    T read(ID id);


}
