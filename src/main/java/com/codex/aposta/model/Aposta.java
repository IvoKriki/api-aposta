package com.codex.aposta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Aposta {
    @Id
    private String numeroAposta;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Apostador apostador;
}
