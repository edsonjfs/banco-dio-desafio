package com.dio.banco.model;

import javax.persistence.*;

@Entity
public class Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String numeroAgencia;
    @ManyToOne
    @JoinColumn(name = "banco_id")
    Banco banco;

    public Banco getBanco() {
        return banco;
    }
}
