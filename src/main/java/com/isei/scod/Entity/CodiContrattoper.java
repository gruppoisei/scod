package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CODI_CONTRATTOPERS")
public class CodiContrattoper implements Serializable {
    private static final long serialVersionUID = -6949973187346397226L;
    @Id
    @Column(name = "CODI_CONTRATTOPERSID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_FK_COTCTIPOCONTRATTOID")
    private CotcTipocontratto codiFkCotctipocontrattoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_FK_ANPEPERSONAID")
    private AnpePersona codiFkAnpepersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_FK_COCCCCNLID")
    private CoccCcnl codiFkCoccccnlid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_FK_COLILIVELLOID")
    private ColiLivello codiFkColilivelloid;

    @Column(name = "CODI_RALCOMPENSO", precision = 15, scale = 2)
    private BigDecimal codiRalcompenso;

    @Column(name = "CODI_MONTEORE")
    private Integer codiMonteore;

    @NotNull
    @Column(name = "CODI_DATAINIZIOCONTRATTO", nullable = false)
    private LocalDate codiDatainiziocontratto;

    @Column(name = "CODI_DATAFINECONTRATTO")
    private LocalDate codiDatafinecontratto;

    @Column(name = "CODI_SMARTWORKING")
    private Boolean codiSmartworking;

    @Lob
    @Column(name = "CODI_NOTE")
    private String codiNote;

    @Size(max = 50)
    @NotNull
    @Column(name = "CODI_SYSUSER", nullable = false, length = 50)
    private String codiSysuser;

    @Column(name = "CODI_SYSDATE")
    private LocalDate codiSysdate;

    @Column(name = "CODI_FLAG_ATTIVA")
    private Integer codiFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CotcTipocontratto getCodiFkCotctipocontrattoid() {
        return codiFkCotctipocontrattoid;
    }

    public void setCodiFkCotctipocontrattoid(CotcTipocontratto codiFkCotctipocontrattoid) {
        this.codiFkCotctipocontrattoid = codiFkCotctipocontrattoid;
    }

    public AnpePersona getCodiFkAnpepersonaid() {
        return codiFkAnpepersonaid;
    }

    public void setCodiFkAnpepersonaid(AnpePersona codiFkAnpepersonaid) {
        this.codiFkAnpepersonaid = codiFkAnpepersonaid;
    }

    public CoccCcnl getCodiFkCoccccnlid() {
        return codiFkCoccccnlid;
    }

    public void setCodiFkCoccccnlid(CoccCcnl codiFkCoccccnlid) {
        this.codiFkCoccccnlid = codiFkCoccccnlid;
    }

    public ColiLivello getCodiFkColilivelloid() {
        return codiFkColilivelloid;
    }

    public void setCodiFkColilivelloid(ColiLivello codiFkColilivelloid) {
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