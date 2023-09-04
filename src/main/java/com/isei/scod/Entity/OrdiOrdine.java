package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDI_ORDINE")
public class OrdiOrdine implements Serializable {
    private static final long serialVersionUID = -6035537729581028586L;
    @Id
    @Column(name = "ORDI_ORDINEID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDI_FK_OFFEOFFERTAID")
    private OffeOfferta ordiFkOffeoffertaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDI_FK_ANSOCOMMITTENTE")
    private AnsoSocieta ordiFkAnsocommittente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDI_FK_ANDODOCUMENTOORDINE")
    private AndoDocumento ordiFkAndodocumentoordine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDI_FK_ANSOSOCIETAGRUPPO")
    private AnsoSocieta ordiFkAnsosocietagruppo;

    @Size(max = 255)
    @Column(name = "ORDI_ORDINEDESC")
    private String ordiOrdinedesc;

    @Column(name = "ORDI_DATAORDINE")
    private LocalDate ordiDataordine;

    @Column(name = "ORDI_DATAEVASIONEORDINE")
    private LocalDate ordiDataevasioneordine;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORDI_SYSUSER", nullable = false, length = 50)
    private String ordiSysuser;

    @Column(name = "ORDI_SYSDATE")
    private LocalDate ordiSysdate;

    @Column(name = "ORDI_FLAG_ATTIVA")
    private Integer ordiFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OffeOfferta getOrdiFkOffeoffertaid() {
        return ordiFkOffeoffertaid;
    }

    public void setOrdiFkOffeoffertaid(OffeOfferta ordiFkOffeoffertaid) {
        this.ordiFkOffeoffertaid = ordiFkOffeoffertaid;
    }

    public AnsoSocieta getOrdiFkAnsocommittente() {
        return ordiFkAnsocommittente;
    }

    public void setOrdiFkAnsocommittente(AnsoSocieta ordiFkAnsocommittente) {
        this.ordiFkAnsocommittente = ordiFkAnsocommittente;
    }

    public AndoDocumento getOrdiFkAndodocumentoordine() {
        return ordiFkAndodocumentoordine;
    }

    public void setOrdiFkAndodocumentoordine(AndoDocumento ordiFkAndodocumentoordine) {
        this.ordiFkAndodocumentoordine = ordiFkAndodocumentoordine;
    }

    public AnsoSocieta getOrdiFkAnsosocietagruppo() {
        return ordiFkAnsosocietagruppo;
    }

    public void setOrdiFkAnsosocietagruppo(AnsoSocieta ordiFkAnsosocietagruppo) {
        this.ordiFkAnsosocietagruppo = ordiFkAnsosocietagruppo;
    }

    public String getOrdiOrdinedesc() {
        return ordiOrdinedesc;
    }

    public void setOrdiOrdinedesc(String ordiOrdinedesc) {
        this.ordiOrdinedesc = ordiOrdinedesc;
    }

    public LocalDate getOrdiDataordine() {
        return ordiDataordine;
    }

    public void setOrdiDataordine(LocalDate ordiDataordine) {
        this.ordiDataordine = ordiDataordine;
    }

    public LocalDate getOrdiDataevasioneordine() {
        return ordiDataevasioneordine;
    }

    public void setOrdiDataevasioneordine(LocalDate ordiDataevasioneordine) {
        this.ordiDataevasioneordine = ordiDataevasioneordine;
    }

    public String getOrdiSysuser() {
        return ordiSysuser;
    }

    public void setOrdiSysuser(String ordiSysuser) {
        this.ordiSysuser = ordiSysuser;
    }

    public LocalDate getOrdiSysdate() {
        return ordiSysdate;
    }

    public void setOrdiSysdate(LocalDate ordiSysdate) {
        this.ordiSysdate = ordiSysdate;
    }

    public Integer getOrdiFlagAttiva() {
        return ordiFlagAttiva;
    }

    public void setOrdiFlagAttiva(Integer ordiFlagAttiva) {
        this.ordiFlagAttiva = ordiFlagAttiva;
    }
}