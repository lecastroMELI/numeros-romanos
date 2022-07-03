package com.example.numerosromanos.controllers;

public class User {
    int id;
    String nome;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "id: '" + id + "', nome: '" + nome + "'";
    }
}
