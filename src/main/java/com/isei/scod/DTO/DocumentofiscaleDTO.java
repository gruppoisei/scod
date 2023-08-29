package com.isei.scod.DTO;

import com.isei.scod.Entity.AndoDocumento;
import com.isei.scod.Entity.OrdiOrdine;
import com.isei.scod.Entity.OrtdTipodocumentofiscale;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class DocumentofiscaleDTO {
    private Integer id;

    private TipodocumentofiscaleDTO ordfFkOrtdtipodocfiscid;

    private DocumentoDTO ordfFkAndodocumentoid;

    private OrdineDTO ordfFkOrdiordineid;

    private LocalDate ordfDatainviodocfisc;

    private LocalDate ordfDataevasionedocfisc;

    private Boolean ordfFatturaaperta;

    private Integer ordfNBaf;

    private Boolean ordfFrazionabilita;

    @Size(max = 50)
    @NotNull
    private String ordfSysuser;

    private LocalDate ordfSysdate;

    private Integer ordfFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipodocumentofiscaleDTO getOrdfFkOrtdtipodocfiscid() {
        return ordfFkOrtdtipodocfiscid;
    }

    public void setOrdfFkOrtdtipodocfiscid(TipodocumentofiscaleDTO ordfFkOrtdtipodocfiscid) {
        this.ordfFkOrtdtipodocfiscid = ordfFkOrtdtipodocfiscid;
    }

    public DocumentoDTO getOrdfFkAndodocumentoid() {
        return ordfFkAndodocumentoid;
    }

    public void setOrdfFkAndodocumentoid(DocumentoDTO ordfFkAndodocumentoid) {
        this.ordfFkAndodocumentoid = ordfFkAndodocumentoid;
    }

    public OrdineDTO getOrdfFkOrdiordineid() {
        return ordfFkOrdiordineid;
    }

    public void setOrdfFkOrdiordineid(OrdineDTO ordfFkOrdiordineid) {
        this.ordfFkOrdiordineid = ordfFkOrdiordineid;
    }

    public LocalDate getOrdfDatainviodocfisc() {
        return ordfDatainviodocfisc;
    }

    public void setOrdfDatainviodocfisc(LocalDate ordfDatainviodocfisc) {
        this.ordfDatainviodocfisc = ordfDatainviodocfisc;
    }

    public LocalDate getOrdfDataevasionedocfisc() {
        return ordfDataevasionedocfisc;
    }

    public void setOrdfDataevasionedocfisc(LocalDate ordfDataevasionedocfisc) {
        this.ordfDataevasionedocfisc = ordfDataevasionedocfisc;
    }

    public Boolean getOrdfFatturaaperta() {
        return ordfFatturaaperta;
    }

    public void setOrdfFatturaaperta(Boolean ordfFatturaaperta) {
        this.ordfFatturaaperta = ordfFatturaaperta;
    }

    public Integer getOrdfNBaf() {
        return ordfNBaf;
    }

    public void setOrdfNBaf(Integer ordfNBaf) {
        this.ordfNBaf = ordfNBaf;
    }

    public Boolean getOrdfFrazionabilita() {
        return ordfFrazionabilita;
    }

    public void setOrdfFrazionabilita(Boolean ordfFrazionabilita) {
        this.ordfFrazionabilita = ordfFrazionabilita;
    }

    public String getOrdfSysuser() {
        return ordfSysuser;
    }

    public void setOrdfSysuser(String ordfSysuser) {
        this.ordfSysuser = ordfSysuser;
    }

    public LocalDate getOrdfSysdate() {
        return ordfSysdate;
    }

    public void setOrdfSysdate(LocalDate ordfSysdate) {
        this.ordfSysdate = ordfSysdate;
    }

    public Integer getOrdfFlagAttiva() {
        return ordfFlagAttiva;
    }

    public void setOrdfFlagAttiva(Integer ordfFlagAttiva) {
        this.ordfFlagAttiva = ordfFlagAttiva;
    }
}