//GS 29/05/2025
//PEDRO RUVIERI CAVARIANI - 551380
//PAULO HENRIQUE DA SILVA LIMA - 552444
package br.com.fiap.ra_552444.globalsolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.ra_552444.globalsolution.dto.EventoExtremoRequestCreate;
import br.com.fiap.ra_552444.globalsolution.dto.EventoExtremoRequestUpdate;
import br.com.fiap.ra_552444.globalsolution.model.EventoExtremo;
import br.com.fiap.ra_552444.globalsolution.repository.EventoExtremoRepository;

@Service
public class EventoExtremoService {
    
    @Autowired
    private EventoExtremoRepository eventoExtremoRepository;

    // create
    public EventoExtremo createEventoExtremo(EventoExtremoRequestCreate dto){
        EventoExtremo evento = new EventoExtremo();
        evento.setTipo(dto.getTipo()); 
        evento.setDescricao(dto.getDescricao());
        evento.setDataInicio(dto.getDataInicio());
        evento.setDataFim(dto.getDataFim());
        evento.setLocalizacao(dto.getLocalizacao());
        evento.setSeveridade(dto.getSeveridade());
        
        return eventoExtremoRepository.save(evento);
    }

    public List<EventoExtremo> getAll() {
        return eventoExtremoRepository.findAll();
    }

    public Optional<EventoExtremo> getEventoById(Long id) {
        return eventoExtremoRepository.findById(id);
    }

    public Optional<EventoExtremo> updateEvento(Long id, EventoExtremoRequestUpdate dto) {
        return eventoExtremoRepository.findById(id).
        map(evento -> {
            evento.setTipo(dto.getTipo());
            return eventoExtremoRepository.save(evento);
        });
    }

    public boolean deleteEvento(Long id) {
        return eventoExtremoRepository.findById(id).
        map(evento -> {
            eventoExtremoRepository.delete(evento);
            return true;
        }).orElse(false);
    }


}
