package za.ac.cput.ngosa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 2015/04/21.
 */
@Entity

public class Manager extends Employee implements Serializable {

    private String department;
    private int numberOfEmployees;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String jobTitle;
    private String phoneNumber;

    public Manager(Employee.Builder build) {
        super();
    }


    public String getDepartment() {
        return department;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Manager(Builder build)
    {
        super();
        this.department=build.department;
        this.id=build.id;
        this.name=build.name;
        this.jobTitle=build.jobTitle;
        this.phoneNumber=build.phoneNumber;
        this.numberOfEmployees=build.numberOfEmployees;
    }


    public static class Builder
    {
        private String department;
        private int numberOfEmployees;
        private long id;
        private String name;
        private String jobTitle;
        private String phoneNumber;

        public Builder id(long idValue)
        {
            this.id=idValue;
            return this;
        }

        public Builder name(String nameValue)
        {
            this.name=nameValue;
            return this;
        }

        public Builder jobTitle(String jobTitleValue)
        {
            this.jobTitle=jobTitleValue;
            return this;
        }

        public Builder phoneNumber(String value)
        {
            this.phoneNumber=value;
            return this;
        }



        public Builder department(String departmentValue)
        {
            this.department= departmentValue;
            return this;
        }

        public Builder numberOfEmployees(int numEmployees)
        {
            this.numberOfEmployees=numEmployees;
            return this;
        }

        public Builder copy(Manager value)
        {
            this.department= value.department;
            this.numberOfEmployees= value.numberOfEmployees;
            this.name=value.name;
            this.phoneNumber=value.phoneNumber;
            this.id=value.id;
            this.jobTitle=value.jobTitle;
            return this;
        }

        public Manager build()
        {
            return new Manager(this);
        }
    }
}
