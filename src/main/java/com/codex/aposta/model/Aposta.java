package com.codex.aposta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Aposta {

    @Id
    @NotBlank
    private String numeroAposta;

    @ManyToOne
    @JoinColumn(name = "idApostador", nullable = false)
    private Apostador apostador;
}
