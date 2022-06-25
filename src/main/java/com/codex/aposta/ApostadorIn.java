package com.codex.aposta;

public class ApostadorIn {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Apostador toConvert(){

        return new Apostador(nome, email);
    }
}
