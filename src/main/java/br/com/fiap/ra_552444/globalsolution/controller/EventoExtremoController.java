//GS 29/05/2025
//PEDRO RUVIERI CAVARIANI - 551380
//PAULO HENRIQUE DA SILVA LIMA - 552444

package br.com.fiap.ra_552444.globalsolution.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.ra_552444.globalsolution.dto.EventoExtremoRequestCreate;
import br.com.fiap.ra_552444.globalsolution.dto.EventoExtremoRequestUpdate;
import br.com.fiap.ra_552444.globalsolution.dto.EventoExtremoResponse;
import br.com.fiap.ra_552444.globalsolution.model.EventoExtremo;
import br.com.fiap.ra_552444.globalsolution.service.EventoExtremoService;

@RestController
@RequestMapping("/eventos")
public class EventoExtremoController {
    
    @Autowired
    private EventoExtremoService eventoService;

    @PostMapping
    public ResponseEntity<EventoExtremoResponse> create(@RequestBody EventoExtremoRequestCreate dto) {
        EventoExtremo evento = eventoService.createEventoExtremo(dto);
        return ResponseEntity.status(201).body(new EventoExtremoResponse().toDto(evento));
    }

    @GetMapping
    public ResponseEntity<List<EventoExtremoResponse>> getAll() {
        List<EventoExtremoResponse> response = eventoService.getAll().stream()
                .map(evento -> new EventoExtremoResponse().toDto(evento))
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoExtremoResponse> getById(@PathVariable Long id) {
        return eventoService.getEventoById(id)
                .map(evento -> ResponseEntity.ok(new EventoExtremoResponse().toDto(evento)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventoExtremoResponse> update(@PathVariable Long id, @RequestBody EventoExtremoRequestUpdate dto) {
        return eventoService.updateEvento(id, dto)
                .map(evento -> ResponseEntity.ok(new EventoExtremoResponse().toDto(evento)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean deleted = eventoService.deleteEvento(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}