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
@Table(name = "ORDE_DETTAGLIOOFFERTA")
public class OrdeDettaglioofferta implements Serializable {

    private static final long serialVersionUID = -5988226330250315845L;
    @Id
    @Column(name = "ORDE_DETTAGLIOOFFERTAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDE_FK_ORSPTIPOPRODSERVID")
    private OrspTiposervizioprodotto ordeFkOrsptipoprodservid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDE_FK_OFFEOFFERTAID")
    private OffeOfferta ordeFkOffeoffertaid;

    @Size(max = 600)
    @Column(name = "ORDE_PRODSERVDESC", length = 600)
    private String ordeProdservdesc;

    @Size(max = 600)
    @Column(name = "ORDE_NOTE", length = 600)
    private String ordeNote;

    @Column(name = "ORDE_COSTO", precision = 15, scale = 2)
    private BigDecimal ordeCosto;

    @Column(name = "ORDE_QUANTITA")
    private Integer ordeQuantita;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORDE_SYSUSER", nullable = false, length = 50)
    private String ordeSysuser;

    @Column(name = "ORDE_SYSDATE")
    private LocalDate ordeSysdate;

    @Column(name = "ORDA_FLAG_ATTIVA")
    private Integer ordaFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrspTiposervizioprodotto getOrdeFkOrsptipoprodservid() {
        return ordeFkOrsptipoprodservid;
    }

    public void setOrdeFkOrsptipoprodservid(OrspTiposervizioprodotto ordeFkOrsptipoprodservid) {
        this.ordeFkOrsptipoprodservid = ordeFkOrsptipoprodservid;
    }

    public OffeOfferta getOrdeFkOffeoffertaid() {
        return ordeFkOffeoffertaid;
    }

    public void setOrdeFkOffeoffertaid(OffeOfferta ordeFkOffeoffertaid) {
        this.ordeFkOffeoffertaid = ordeFkOffeoffertaid;
    }

    public String getOrdeProdservdesc() {
        return ordeProdservdesc;
    }

    public void setOrdeProdservdesc(String ordeProdservdesc) {
        this.ordeProdservdesc = ordeProdservdesc;
    }

    public String getOrdeNote() {
        return ordeNote;
    }

    public void setOrdeNote(String ordeNote) {
        this.ordeNote = ordeNote;
    }

    public BigDecimal getOrdeCosto() {
        return ordeCosto;
    }

    public void setOrdeCosto(BigDecimal ordeCosto) {
        this.ordeCosto = ordeCosto;
    }

    public Integer getOrdeQuantita() {
        return ordeQuantita;
    }

    public void setOrdeQuantita(Integer ordeQuantita) {
        this.ordeQuantita = ordeQuantita;
    }

    public String getOrdeSysuser() {
        return ordeSysuser;
    }

    public void setOrdeSysuser(String ordeSysuser) {
        this.ordeSysuser = ordeSysuser;
    }

    public LocalDate getOrdeSysdate() {
        return ordeSysdate;
    }

    public void setOrdeSysdate(LocalDate ordeSysdate) {
        this.ordeSysdate = ordeSysdate;
    }

    public Integer getOrdaFlagAttiva() {
        return ordaFlagAttiva;
    }

    public void setOrdaFlagAttiva(Integer ordaFlagAttiva) {
        this.ordaFlagAttiva = ordaFlagAttiva;
    }
}