package za.ac.cput.ngosa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;
/**
 * Created by User on 2015/04/23.
 */
@Entity

public class Employee {

    @Id
    private long id;
    private String name;
    private String jobTitle;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Employee()
    {}
    public Employee(Builder build)
    {
        this.id=build.id;
        this.name=build.name;
        this.jobTitle= build.jobTitle;
        this.phoneNumber= build.phoneNumber;
    }

    public static class Builder
    {
        private long id;
        private String name;
        private String jobTitle;
        private String phoneNumber;

        public Builder id(long idValue)
        {
            this.id= idValue;
            return this;
        }

        public Builder name(String nameValue)
        {
            this.name=nameValue;
            return this;
        }

        public Builder jobTitle(String jobTitleValue)
        {
            this.jobTitle= jobTitleValue;
            return this;
        }

        public Builder phoneNumber(String number)
        {
            this.phoneNumber=number;
            return this;
        }

        public Employee build()
        {
            return new Employee();
        }




    }
}
