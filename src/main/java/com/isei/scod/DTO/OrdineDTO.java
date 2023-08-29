package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class OrdineDTO implements Serializable {

    private Integer id;

    private OffertaDTO ordiFkOffeoffertaid;

    private SocietaDTO ordiFkAnsocommittente;

    private DocumentoDTO ordiFkAndodocumentoordine;

    private SocietaDTO ordiFkAnsosocietagruppo;

    @Size(max = 255)
    private String ordiOrdinedesc;

    private LocalDate ordiDataordine;

    private LocalDate ordiDataevasioneordine;

    @Size(max = 50)
    @NotNull
    private String ordiSysuser;

    private LocalDate ordiSysdate;

    private Integer ordiFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OffertaDTO getOrdiFkOffeoffertaid() {
        return ordiFkOffeoffertaid;
    }

    public void setOrdiFkOffeoffertaid(OffertaDTO ordiFkOffeoffertaid) {
        this.ordiFkOffeoffertaid = ordiFkOffeoffertaid;
    }

    public SocietaDTO getOrdiFkAnsocommittente() {
        return ordiFkAnsocommittente;
    }

    public void setOrdiFkAnsocommittente(SocietaDTO ordiFkAnsocommittente) {
        this.ordiFkAnsocommittente = ordiFkAnsocommittente;
    }

    public DocumentoDTO getOrdiFkAndodocumentoordine() {
        return ordiFkAndodocumentoordine;
    }

    public void setOrdiFkAndodocumentoordine(DocumentoDTO ordiFkAndodocumentoordine) {
        this.ordiFkAndodocumentoordine = ordiFkAndodocumentoordine;
    }

    public SocietaDTO getOrdiFkAnsosocietagruppo() {
        return ordiFkAnsosocietagruppo;
    }

    public void setOrdiFkAnsosocietagruppo(SocietaDTO ordiFkAnsosocietagruppo) {
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