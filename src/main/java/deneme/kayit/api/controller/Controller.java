package deneme.kayit.api.controller;

import deneme.kayit.api.model.Base;
import deneme.kayit.service.ArrayManager;
import deneme.kayit.service.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/kayit")
public class Controller {
    private ArrayService arrayService;

    @Autowired
    public Controller(ArrayService arrayService) {
        this.arrayService = arrayService;
    }

    @PostMapping("/add")
    public void Add(@RequestParam String name, @RequestParam String surname, @RequestParam String job,
                                    @RequestParam String age, @RequestParam String city){
        arrayService.Add(name,surname,job,age,city);

    }



    @GetMapping("/getall")
    public List<Base> getAll(){
        return arrayService.getAll();
    }

}
