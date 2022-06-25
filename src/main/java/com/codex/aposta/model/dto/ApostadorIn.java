package com.codex.aposta.model.dto;

import com.codex.aposta.model.Apostador;
import lombok.Getter;

@Getter
public class ApostadorIn {

    private String nome;
    private String email;

    public Apostador toConvert(){

        return new Apostador(null, nome, email);
    }
}
