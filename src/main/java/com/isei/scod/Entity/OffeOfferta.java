package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OFFE_OFFERTA")
public class OffeOfferta implements Serializable {
    private static final long serialVersionUID = 4693919441272858667L;
    @Id
    @Column(name = "OFFE_OFFERTAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANSOCOMMITTENTEID")
    private AnsoSocieta offeFkAnsocommittenteid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANSOSOCIETAGRUPPO")
    private AnsoSocieta offeFkAnsosocietagruppo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_OFTIOFFERTAID")
    private OftiTipoofferta offeFkOftioffertaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANPEREFCOMMERCIALE")
    private AnpePersona offeFkAnperefcommerciale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANPEAPPROVATADA")
    private AnpePersona offeFkAnpeapprovatada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFE_FK_ANDODOCUMENTOOFFERTA")
    private AndoDocumento offeFkAndodocumentoofferta;

    @Column(name = "OFFE_IMPORTOOFFERTA", precision = 15, scale = 2)
    private BigDecimal offeImportoofferta;

    @Column(name = "OFFE_OFFERTAAPPROVATA")
    private Boolean offeOffertaapprovata;

    @Column(name = "OFFE_DATAOFFERTA")
    private LocalDate offeDataofferta;

    @Column(name = "OFFE_DATASCADENZA")
    private LocalDate offeDatascadenza;

    @Size(max = 50)
    @NotNull
    @Column(name = "OFFE_SYSUSER", nullable = false, length = 50)
    private String offeSysuser;

    @Column(name = "OFFE_SYSDATE")
    private LocalDate offeSysdate;

    @Column(name = "OFFE_FLAG_ATTIVA")
    private Integer offeFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnsoSocieta getOffeFkAnsocommittenteid() {
        return offeFkAnsocommittenteid;
    }

    public void setOffeFkAnsocommittenteid(AnsoSocieta offeFkAnsocommittenteid) {
        this.offeFkAnsocommittenteid = offeFkAnsocommittenteid;
    }

    public AnsoSocieta getOffeFkAnsosocietagruppo() {
        return offeFkAnsosocietagruppo;
    }

    public void setOffeFkAnsosocietagruppo(AnsoSocieta offeFkAnsosocietagruppo) {
        this.offeFkAnsosocietagruppo = offeFkAnsosocietagruppo;
    }

    public OftiTipoofferta getOffeFkOftioffertaid() {
        return offeFkOftioffertaid;
    }

    public void setOffeFkOftioffertaid(OftiTipoofferta offeFkOftioffertaid) {
        this.offeFkOftioffertaid = offeFkOftioffertaid;
    }

    public AnpePersona getOffeFkAnperefcommerciale() {
        return offeFkAnperefcommerciale;
    }

    public void setOffeFkAnperefcommerciale(AnpePersona offeFkAnperefcommerciale) {
        this.offeFkAnperefcommerciale = offeFkAnperefcommerciale;
    }

    public AnpePersona getOffeFkAnpeapprovatada() {
        return offeFkAnpeapprovatada;
    }

    public void setOffeFkAnpeapprovatada(AnpePersona offeFkAnpeapprovatada) {
        this.offeFkAnpeapprovatada = offeFkAnpeapprovatada;
    }

    public AndoDocumento getOffeFkAndodocumentoofferta() {
        return offeFkAndodocumentoofferta;
    }

    public void setOffeFkAndodocumentoofferta(AndoDocumento offeFkAndodocumentoofferta) {
        this.offeFkAndodocumentoofferta = offeFkAndodocumentoofferta;
    }

    public BigDecimal getOffeImportoofferta() {
        return offeImportoofferta;
    }

    public void setOffeImportoofferta(BigDecimal offeImportoofferta) {
        this.offeImportoofferta = offeImportoofferta;
    }

    public Boolean getOffeOffertaapprovata() {
        return offeOffertaapprovata;
    }

    public void setOffeOffertaapprovata(Boolean offeOffertaapprovata) {
        this.offeOffertaapprovata = offeOffertaapprovata;
    }

    public LocalDate getOffeDataofferta() {
        return offeDataofferta;
    }

    public void setOffeDataofferta(LocalDate offeDataofferta) {
        this.offeDataofferta = offeDataofferta;
    }

    public LocalDate getOffeDatascadenza() {
        return offeDatascadenza;
    }

    public void setOffeDatascadenza(LocalDate offeDatascadenza) {
        this.offeDatascadenza = offeDatascadenza;
    }

    public String getOffeSysuser() {
        return offeSysuser;
    }

    public void setOffeSysuser(String offeSysuser) {
        this.offeSysuser = offeSysuser;
    }

    public LocalDate getOffeSysdate() {
        return offeSysdate;
    }

    public void setOffeSysdate(LocalDate offeSysdate) {
        this.offeSysdate = offeSysdate;
    }

    public Integer getOffeFlagAttiva() {
        return offeFlagAttiva;
    }

    public void setOffeFlagAttiva(Integer offeFlagAttiva) {
        this.offeFlagAttiva = offeFlagAttiva;
    }
}