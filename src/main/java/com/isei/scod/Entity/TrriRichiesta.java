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
@Table(name = "TRRI_RICHIESTA")
public class TrriRichiesta implements Serializable {
    private static final long serialVersionUID = -4636250961171535447L;
    @Id
    @Column(name = "TRRI_RICHIESTAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRRI_FK_ANPEPERSONAID")
    private AnpePersona trriFkAnpepersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRRI_FK_TRTRTIPORICHIESTAID")
    private TrtrTiporichiesta trriFkTrtrtiporichiestaid;

    @Size(max = 255)
    @Column(name = "TRRI_NOTE")
    private String trriNote;

    @Column(name = "TRRI_DATAINIZIO")
    private LocalDate trriDatainizio;

    @Column(name = "TRRI_DATAFINE")
    private LocalDate trriDatafine;

    @Size(max = 50)
    @NotNull
    @Column(name = "TRRI_SYSUSER", nullable = false, length = 50)
    private String trriSysuser;

    @Column(name = "TRRI_SYSDATE")
    private LocalDate trriSysdate;

    @Column(name = "TRRI_FLAG_ATTIVA")
    private Integer trriFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnpePersona getTrriFkAnpepersonaid() {
        return trriFkAnpepersonaid;
    }

    public void setTrriFkAnpepersonaid(AnpePersona trriFkAnpepersonaid) {
        this.trriFkAnpepersonaid = trriFkAnpepersonaid;
    }

    public TrtrTiporichiesta getTrriFkTrtrtiporichiestaid() {
        return trriFkTrtrtiporichiestaid;
    }

    public void setTrriFkTrtrtiporichiestaid(TrtrTiporichiesta trriFkTrtrtiporichiestaid) {
        this.trriFkTrtrtiporichiestaid = trriFkTrtrtiporichiestaid;
    }

    public String getTrriNote() {
        return trriNote;
    }

    public void setTrriNote(String trriNote) {
        this.trriNote = trriNote;
    }

    public LocalDate getTrriDatainizio() {
        return trriDatainizio;
    }

    public void setTrriDatainizio(LocalDate trriDatainizio) {
        this.trriDatainizio = trriDatainizio;
    }

    public LocalDate getTrriDatafine() {
        return trriDatafine;
    }

    public void setTrriDatafine(LocalDate trriDatafine) {
        this.trriDatafine = trriDatafine;
    }

    public String getTrriSysuser() {
        return trriSysuser;
    }

    public void setTrriSysuser(String trriSysuser) {
        this.trriSysuser = trriSysuser;
    }

    public LocalDate getTrriSysdate() {
        return trriSysdate;
    }

    public void setTrriSysdate(LocalDate trriSysdate) {
        this.trriSysdate = trriSysdate;
    }

    public Integer getTrriFlagAttiva() {
        return trriFlagAttiva;
    }

    public void setTrriFlagAttiva(Integer trriFlagAttiva) {
        this.trriFlagAttiva = trriFlagAttiva;
    }
}