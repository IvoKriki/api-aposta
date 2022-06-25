package com.codex.aposta.model.dto;

import com.codex.aposta.model.Apostador;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class ApostadorIn {

    @NotBlank
    private String nome;

    @NotBlank
    private String email;

}
