package com.example.RegisterLogin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Name {

    @Id
    @Column(name="id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name",length=255)
    private String name;

    @Column(name="email",length=255)
    private String email;

    @Column(name="password", length=255)
    private String password;


    public Name(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public Name() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Name{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}





