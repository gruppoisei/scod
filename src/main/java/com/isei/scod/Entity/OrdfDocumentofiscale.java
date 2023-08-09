package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDF_DOCUMENTOFISCALE")
public class OrdfDocumentofiscale implements Serializable {
    private static final long serialVersionUID = 2323305785588598912L;
    @Id
    @Column(name = "ORDF_DOCUMENTOFISCALEID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDF_FK_ORTDTIPODOCFISCID")
    private OrtdTipodocumentofiscale ordfFkOrtdtipodocfiscid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDF_FK_ANDODOCUMENTOID")
    private AndoDocumento ordfFkAndodocumentoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDF_FK_ORDIORDINEID")
    private OrdiOrdine ordfFkOrdiordineid;

    @Column(name = "ORDF_DATAINVIODOCFISC")
    private LocalDate ordfDatainviodocfisc;

    @Column(name = "ORDF_DATAEVASIONEDOCFISC")
    private LocalDate ordfDataevasionedocfisc;

    @Column(name = "ORDF_FATTURAAPERTA")
    private Boolean ordfFatturaaperta;

    @Column(name = "ORDF_N_BAF")
    private Integer ordfNBaf;

    @Column(name = "ORDF_FRAZIONABILITA")
    private Boolean ordfFrazionabilita;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORDF_SYSUSER", nullable = false, length = 50)
    private String ordfSysuser;

    @Column(name = "ORDF_SYSDATE")
    private LocalDate ordfSysdate;

    @Column(name = "ORDF_FLAG_ATTIVA")
    private Integer ordfFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrtdTipodocumentofiscale getOrdfFkOrtdtipodocfiscid() {
        return ordfFkOrtdtipodocfiscid;
    }

    public void setOrdfFkOrtdtipodocfiscid(OrtdTipodocumentofiscale ordfFkOrtdtipodocfiscid) {
        this.ordfFkOrtdtipodocfiscid = ordfFkOrtdtipodocfiscid;
    }

    public AndoDocumento getOrdfFkAndodocumentoid() {
        return ordfFkAndodocumentoid;
    }

    public void setOrdfFkAndodocumentoid(AndoDocumento ordfFkAndodocumentoid) {
        this.ordfFkAndodocumentoid = ordfFkAndodocumentoid;
    }

    public OrdiOrdine getOrdfFkOrdiordineid() {
        return ordfFkOrdiordineid;
    }

    public void setOrdfFkOrdiordineid(OrdiOrdine ordfFkOrdiordineid) {
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