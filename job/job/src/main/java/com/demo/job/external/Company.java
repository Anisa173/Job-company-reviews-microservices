package com.demo.job.external;

public class Company {
private String name;
private Long Id;
private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Long id, String description) {
        this.name = name;
        Id = id;
        this.description = description;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
