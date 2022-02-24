package com.dio.banco.model;

import javax.persistence.*;

@Entity
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nome;
    @OneToMany
    Set<Agencia> agencias;

    public Banco(){
    }

    public Banco(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
