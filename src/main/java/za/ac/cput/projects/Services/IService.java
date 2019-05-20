package za.ac.cput.projects.Services;

public interface IService <TYPE, KEY> {

    TYPE create(TYPE type);
    TYPE update(TYPE type);
    void delete(KEY key);
    TYPE read(KEY key);


}
