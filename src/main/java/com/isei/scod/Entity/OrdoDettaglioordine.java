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
@Table(name = "ORDO_DETTAGLIOORDINE")
public class OrdoDettaglioordine implements Serializable {
    private static final long serialVersionUID = 4229046801884182667L;
    @Id
    @Column(name = "ORDO_DETTAGLIOORDINEID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDO_FK_ORSPTIPOPRODSERVID")
    private OrspTiposervizioprodotto ordoFkOrsptipoprodservid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDO_FK_ORDIORDINEID")
    private OrdiOrdine ordoFkOrdiordineid;

    @Size(max = 600)
    @Column(name = "ORDO_PRODSERVDESC", length = 600)
    private String ordoProdservdesc;

    @Size(max = 600)
    @Column(name = "ORDO_NOTE", length = 600)
    private String ordoNote;

    @Column(name = "ORDO_COSTO", precision = 15, scale = 2)
    private BigDecimal ordoCosto;

    @Column(name = "ORDO_QUANTITA")
    private Integer ordoQuantita;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORDO_SYSUSER", nullable = false, length = 50)
    private String ordoSysuser;

    @Column(name = "ORDO_SYSDATE")
    private LocalDate ordoSysdate;

    @Column(name = "ORDO_FLAG_ATTIVA")
    private Integer ordoFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrspTiposervizioprodotto getOrdoFkOrsptipoprodservid() {
        return ordoFkOrsptipoprodservid;
    }

    public void setOrdoFkOrsptipoprodservid(OrspTiposervizioprodotto ordoFkOrsptipoprodservid) {
        this.ordoFkOrsptipoprodservid = ordoFkOrsptipoprodservid;
    }

    public OrdiOrdine getOrdoFkOrdiordineid() {
        return ordoFkOrdiordineid;
    }

    public void setOrdoFkOrdiordineid(OrdiOrdine ordoFkOrdiordineid) {
        this.ordoFkOrdiordineid = ordoFkOrdiordineid;
    }

    public String getOrdoProdservdesc() {
        return ordoProdservdesc;
    }

    public void setOrdoProdservdesc(String ordoProdservdesc) {
        this.ordoProdservdesc = ordoProdservdesc;
    }

    public String getOrdoNote() {
        return ordoNote;
    }

    public void setOrdoNote(String ordoNote) {
        this.ordoNote = ordoNote;
    }

    public BigDecimal getOrdoCosto() {
        return ordoCosto;
    }

    public void setOrdoCosto(BigDecimal ordoCosto) {
        this.ordoCosto = ordoCosto;
    }

    public Integer getOrdoQuantita() {
        return ordoQuantita;
    }

    public void setOrdoQuantita(Integer ordoQuantita) {
        this.ordoQuantita = ordoQuantita;
    }

    public String getOrdoSysuser() {
        return ordoSysuser;
    }

    public void setOrdoSysuser(String ordoSysuser) {
        this.ordoSysuser = ordoSysuser;
    }

    public LocalDate getOrdoSysdate() {
        return ordoSysdate;
    }

    public void setOrdoSysdate(LocalDate ordoSysdate) {
        this.ordoSysdate = ordoSysdate;
    }

    public Integer getOrdoFlagAttiva() {
        return ordoFlagAttiva;
    }

    public void setOrdoFlagAttiva(Integer ordoFlagAttiva) {
        this.ordoFlagAttiva = ordoFlagAttiva;
    }
}