package deneme.kayit.service;

import deneme.kayit.api.model.Base;

import java.util.List;

public interface ArrayService {
    List<Base> getAll();
    void Add(String name, String surname, String job, String age, String city);
}
