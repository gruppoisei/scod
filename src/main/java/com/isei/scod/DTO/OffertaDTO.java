package com.isei.scod.DTO;

import com.isei.scod.Entity.AndoDocumento;
import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.AnsoSocieta;
import com.isei.scod.Entity.OftiTipoofferta;
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
public class OffertaDTO implements Serializable {

    private Integer id;

    private SocietaDTO offeFkAnsocommittenteid;

    private SocietaDTO offeFkAnsosocietagruppo;

    private TipooffertaDTO offeFkOftioffertaid;

    private PersonaDTO offeFkAnperefcommerciale;

    private PersonaDTO offeFkAnpeapprovatada;

    private DocumentoDTO offeFkAndodocumentoofferta;

    private BigDecimal offeImportoofferta;

    private Boolean offeOffertaapprovata;

    private LocalDate offeDataofferta;

    private LocalDate offeDatascadenza;

    @Size(max = 50)
    @NotNull
    private String offeSysuser;

    private LocalDate offeSysdate;

    private Integer offeFlagAttiva;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SocietaDTO getOffeFkAnsocommittenteid() {
        return offeFkAnsocommittenteid;
    }

    public void setOffeFkAnsocommittenteid(SocietaDTO offeFkAnsocommittenteid) {
        this.offeFkAnsocommittenteid = offeFkAnsocommittenteid;
    }

    public SocietaDTO getOffeFkAnsosocietagruppo() {
        return offeFkAnsosocietagruppo;
    }

    public void setOffeFkAnsosocietagruppo(SocietaDTO offeFkAnsosocietagruppo) {
        this.offeFkAnsosocietagruppo = offeFkAnsosocietagruppo;
    }

    public TipooffertaDTO getOffeFkOftioffertaid() {
        return offeFkOftioffertaid;
    }

    public void setOffeFkOftioffertaid(TipooffertaDTO offeFkOftioffertaid) {
        this.offeFkOftioffertaid = offeFkOftioffertaid;
    }

    public PersonaDTO getOffeFkAnperefcommerciale() {
        return offeFkAnperefcommerciale;
    }

    public void setOffeFkAnperefcommerciale(PersonaDTO offeFkAnperefcommerciale) {
        this.offeFkAnperefcommerciale = offeFkAnperefcommerciale;
    }

    public PersonaDTO getOffeFkAnpeapprovatada() {
        return offeFkAnpeapprovatada;
    }

    public void setOffeFkAnpeapprovatada(PersonaDTO offeFkAnpeapprovatada) {
        this.offeFkAnpeapprovatada = offeFkAnpeapprovatada;
    }

    public DocumentoDTO getOffeFkAndodocumentoofferta() {
        return offeFkAndodocumentoofferta;
    }

    public void setOffeFkAndodocumentoofferta(DocumentoDTO offeFkAndodocumentoofferta) {
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