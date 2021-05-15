package com.ssm.transaction.domain;

public class Department {

    private Integer id;
    private String dep_name;
    private String dep_location;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public void setDep_location(String dep_location) {
        this.dep_location = dep_location;
    }

    public Integer getId() {
        return id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public String getDep_location() {
        return dep_location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", dep_name='" + dep_name + '\'' +
                ", dep_location='" + dep_location + '\'' +
                '}';
    }
}
