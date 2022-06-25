package com.codex.aposta.model.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class ApostaIn {

    @NotBlank
    private Long idApostador;
}
