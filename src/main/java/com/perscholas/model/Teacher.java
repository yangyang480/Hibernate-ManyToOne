package com.perscholas.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    //@Column (name = "TEACHERID_PK") using column we can rename the PK name
    //variables
    private int tit;
    private String salary;
    private String Teachername;

    @ManyToOne //this is the relationship between these two class.
    //@JoinColumn(name = "department_id_FK") //we use this @JoinColumn to change the FK. we can rename the FK name.
    private Department department; //datatype is Department, then I need to create getter and setter for this variable

    //contructor
    public Teacher(int tit, String salary, String teachername, Department department) {
        this.tit = tit;
        this.salary = salary;
        this.department = department;
        this.Teachername = teachername;
    }

    public Teacher(){

    }

    //getter and setter
    public int getTit() {
        return tit;
    }

    public void setTit(int tit) {
        this.tit = tit;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeachername() {
        return Teachername;
    }

    public void setTeachername(String teachername) {
        Teachername = teachername;
    }

    public Department getDepartment() {
        return department; //the return department
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
