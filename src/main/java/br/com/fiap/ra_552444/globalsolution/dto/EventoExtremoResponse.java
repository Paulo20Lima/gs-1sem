//GS 29/05/2025
//PEDRO RUVIERI CAVARIANI - 551380
//PAULO HENRIQUE DA SILVA LIMA - 552444
package br.com.fiap.ra_552444.globalsolution.dto;

import java.time.LocalDate;

import br.com.fiap.ra_552444.globalsolution.model.EventoExtremo;

public class EventoExtremoResponse {

    private Long id;
    private String tipo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String localizacao;
    private String descricao;
    private String severidade;

    public EventoExtremoResponse toDto(EventoExtremo evento) {
        EventoExtremoResponse dto = new EventoExtremoResponse();
        dto.setId(evento.getId());
        dto.setTipo(evento.getTipo());
        dto.setDataFim(evento.getDataFim());
        dto.setLocalizacao(evento.getLocalizacao());
        dto.setDescricao(evento.getDescricao());
        dto.setSeveridade(evento.getSeveridade());
        return dto;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSeveridade() {
        return severidade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSeveridade(String severidade) {
        this.severidade = severidade;
    }

    
}