package com.example.demo_get_controller.get_completa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long userId;

    private String nome;
    private String provincia;
    private String saluto;

    public User(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + this.nome + ", com'è il tempo in " + this.provincia + "?";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }
}
