//GS 29/05/2025
//PEDRO RUVIERI CAVARIANI - 551380
//PAULO HENRIQUE DA SILVA LIMA - 552444
package br.com.fiap.ra_552444.globalsolution.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class EventoExtremo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String localizacao;
    private String descricao;
    private String severidade;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getSeveridade() {
        return severidade;
    }
    public void setSeveridade(String severidade) {
        this.severidade = severidade;
    }


}



