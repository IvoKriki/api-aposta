package com.codex.aposta.controller;

import com.codex.aposta.model.Apostador;
import com.codex.aposta.model.dto.ApostadorIn;
import com.codex.aposta.repository.ApostadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
public class ApostadorController {

    private final ApostadorRepository apostadorRepository;

    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn) {

        Apostador apostador = apostadorIn.toConvert();
        apostadorRepository.save(apostador);

        return ResponseEntity.status(CREATED).build();
    }
}
