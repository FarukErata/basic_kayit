package deneme.kayit.api.model;

import java.util.ArrayList;
import java.util.List;

public class Base {
    private String name;
    private String surname;
    private String job;
    private String age;






    public Base(String name, String surname, String job, String age, String city) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;





}
