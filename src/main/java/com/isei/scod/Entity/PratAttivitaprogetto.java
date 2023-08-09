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
@Table(name = "PRAT_ATTIVITAPROGETTO")
public class PratAttivitaprogetto implements Serializable {
    private static final long serialVersionUID = -871042350999854582L;
    @Id
    @Column(name = "PRAT_ATTIVITAPROGETTOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRAT_FK_PRPRPROGETTOID")
    private PrprProgetto pratFkPrprprogettoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRAT_FK_COAPATTIVITAPROGETTOID")
    private CoapTipoattivitaprogetto pratFkCoapattivitaprogettoid;

    @Column(name = "PRAT_DATAINIZIO")
    private LocalDate pratDatainizio;

    @Column(name = "PRAT_DATAFINE")
    private LocalDate pratDatafine;

    @Size(max = 100)
    @Column(name = "PRAT_NOTE", length = 100)
    private String pratNote;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRAT_SYSUSER", nullable = false, length = 50)
    private String pratSysuser;

    @Column(name = "PRAT_SYSDATE")
    private LocalDate pratSysdate;

    @Column(name = "PRAT_FLAG_ATTIVA")
    private Integer pratFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PrprProgetto getPratFkPrprprogettoid() {
        return pratFkPrprprogettoid;
    }

    public void setPratFkPrprprogettoid(PrprProgetto pratFkPrprprogettoid) {
        this.pratFkPrprprogettoid = pratFkPrprprogettoid;
    }

    public CoapTipoattivitaprogetto getPratFkCoapattivitaprogettoid() {
        return pratFkCoapattivitaprogettoid;
    }

    public void setPratFkCoapattivitaprogettoid(CoapTipoattivitaprogetto pratFkCoapattivitaprogettoid) {
        this.pratFkCoapattivitaprogettoid = pratFkCoapattivitaprogettoid;
    }

    public LocalDate getPratDatainizio() {
        return pratDatainizio;
    }

    public void setPratDatainizio(LocalDate pratDatainizio) {
        this.pratDatainizio = pratDatainizio;
    }

    public LocalDate getPratDatafine() {
        return pratDatafine;
    }

    public void setPratDatafine(LocalDate pratDatafine) {
        this.pratDatafine = pratDatafine;
    }

    public String getPratNote() {
        return pratNote;
    }

    public void setPratNote(String pratNote) {
        this.pratNote = pratNote;
    }

    public String getPratSysuser() {
        return pratSysuser;
    }

    public void setPratSysuser(String pratSysuser) {
        this.pratSysuser = pratSysuser;
    }

    public LocalDate getPratSysdate() {
        return pratSysdate;
    }

    public void setPratSysdate(LocalDate pratSysdate) {
        this.pratSysdate = pratSysdate;
    }

    public Integer getPratFlagAttiva() {
        return pratFlagAttiva;
    }

    public void setPratFlagAttiva(Integer pratFlagAttiva) {
        this.pratFlagAttiva = pratFlagAttiva;
    }
}