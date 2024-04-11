package com.rafael.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(length = 50 , nullable = false, name = "nome")
    private String name;
    @Column(length = 100 , nullable = false)
    private String Usarnema;
    @Column(length = 200 , nullable = false)
    private String passoword;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsarnema() {
        return Usarnema;
    }
    public void setUsarnema(String usarnema) {
        Usarnema = usarnema;
    }
    public String getPassoword() {
        return passoword;
    }
    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", Usarnema=" + Usarnema + ", passoword=" + passoword + "]";
    }

    
    
}
