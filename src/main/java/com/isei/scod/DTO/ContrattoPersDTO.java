package com.isei.scod.DTO;

import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.CoccCcnl;
import com.isei.scod.Entity.ColiLivello;
import com.isei.scod.Entity.CotcTipocontratto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class ContrattoPersDTO {

    private Integer id;

    private TipoContrattoDTO codiFkCotctipocontrattoid;

    private PersonaDTO codiFkAnpepersonaid;

    private CcnlDTO codiFkCoccccnlid;

    private LivelloDTO codiFkColilivelloid;

    private BigDecimal codiRalcompenso;

    private Integer codiMonteore;

    @NotNull
    private LocalDate codiDatainiziocontratto;

    private LocalDate codiDatafinecontratto;

    private Boolean codiSmartworking;

    @Lob
    private String codiNote;

    @Size(max = 50)
    @NotNull
    private String codiSysuser;

    private LocalDate codiSysdate;

    private Integer codiFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoContrattoDTO getCodiFkCotctipocontrattoid() {
        return codiFkCotctipocontrattoid;
    }

    public void setCodiFkCotctipocontrattoid(TipoContrattoDTO codiFkCotctipocontrattoid) {
        this.codiFkCotctipocontrattoid = codiFkCotctipocontrattoid;
    }

    public PersonaDTO getCodiFkAnpepersonaid() {
        return codiFkAnpepersonaid;
    }

    public void setCodiFkAnpepersonaid(PersonaDTO codiFkAnpepersonaid) {
        this.codiFkAnpepersonaid = codiFkAnpepersonaid;
    }

    public CcnlDTO getCodiFkCoccccnlid() {
        return codiFkCoccccnlid;
    }

    public void setCodiFkCoccccnlid(CcnlDTO codiFkCoccccnlid) {
        this.codiFkCoccccnlid = codiFkCoccccnlid;
    }

    public LivelloDTO getCodiFkColilivelloid() {
        return codiFkColilivelloid;
    }

    public void setCodiFkColilivelloid(LivelloDTO codiFkColilivelloid) {
        this.codiFkColilivelloid = codiFkColilivelloid;
    }

    public BigDecimal getCodiRalcompenso() {
        return codiRalcompenso;
    }

    public void setCodiRalcompenso(BigDecimal codiRalcompenso) {
        this.codiRalcompenso = codiRalcompenso;
    }

    public Integer getCodiMonteore() {
        return codiMonteore;
    }

    public void setCodiMonteore(Integer codiMonteore) {
        this.codiMonteore = codiMonteore;
    }

    public LocalDate getCodiDatainiziocontratto() {
        return codiDatainiziocontratto;
    }

    public void setCodiDatainiziocontratto(LocalDate codiDatainiziocontratto) {
        this.codiDatainiziocontratto = codiDatainiziocontratto;
    }

    public LocalDate getCodiDatafinecontratto() {
        return codiDatafinecontratto;
    }

    public void setCodiDatafinecontratto(LocalDate codiDatafinecontratto) {
        this.codiDatafinecontratto = codiDatafinecontratto;
    }

    public Boolean getCodiSmartworking() {
        return codiSmartworking;
    }

    public void setCodiSmartworking(Boolean codiSmartworking) {
        this.codiSmartworking = codiSmartworking;
    }

    public String getCodiNote() {
        return codiNote;
    }

    public void setCodiNote(String codiNote) {
        this.codiNote = codiNote;
    }

    public String getCodiSysuser() {
        return codiSysuser;
    }

    public void setCodiSysuser(String codiSysuser) {
        this.codiSysuser = codiSysuser;
    }

    public LocalDate getCodiSysdate() {
        return codiSysdate;
    }

    public void setCodiSysdate(LocalDate codiSysdate) {
        this.codiSysdate = codiSysdate;
    }

    public Integer getCodiFlagAttiva() {
        return codiFlagAttiva;
    }

    public void setCodiFlagAttiva(Integer codiFlagAttiva) {
        this.codiFlagAttiva = codiFlagAttiva;
    }
}
