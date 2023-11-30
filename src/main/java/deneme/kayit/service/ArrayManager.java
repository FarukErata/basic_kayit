package deneme.kayit.service;

import deneme.kayit.api.model.Base;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArrayManager implements ArrayService {


    ArrayList<Base> list= new ArrayList<>();

    @Override
    public void Add(String name, String surname, String job, String age, String city) {
        Base b1=new Base(name,surname,job,age,city);
        this.list.add(b1);


    }


      public List<Base> getAll(){
          return list;
      }

}
