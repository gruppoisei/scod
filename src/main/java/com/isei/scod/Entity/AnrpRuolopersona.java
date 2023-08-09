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
@Table(name = "ANRP_RUOLOPERSONA")
public class AnrpRuolopersona implements Serializable {
    private static final long serialVersionUID = -8162036409479713360L;
    @Id
    @Column(name = "ANRP_RUOLOPERSONAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANRP_FK_ANPE_PERSONAID")
    private AnpePersona anrpFkAnpePersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANRP_FK_ANRU_RUOLOID")
    private AnruRuolo anrpFkAnruRuoloid;

    @Column(name = "ANRP_DATAINIZIO")
    private LocalDate anrpDatainizio;

    @Column(name = "ANRP_DATAFINE")
    private LocalDate anrpDatafine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANRP_FK_ANPE_PERSONATUTORID")
    private AnpePersona anrpFkAnpePersonatutorid;

    @Size(max = 600)
    @Column(name = "ANRP_NOTE", length = 600)
    private String anrpNote;

    @Size(max = 100)
    @Column(name = "ANRP_FORMAZIONETRASVERSALE1ANNO", length = 100)
    private String anrpFormazionetrasversale1anno;

    @Size(max = 100)
    @Column(name = "ANRP_FORMAZIONETRASVERSALE2ANNO", length = 100)
    private String anrpFormazionetrasversale2anno;

    @Size(max = 100)
    @Column(name = "ANRP_FORMAZIONETRASVERSALE3ANNO", length = 100)
    private String anrpFormazionetrasversale3anno;

    @Column(name = "ANRP_DATAINIZIOFORMTECNICA")
    private LocalDate anrpDatainizioformtecnica;

    @Column(name = "ANRP_DATAFINEFORMTECNICA")
    private LocalDate anrpDatafineformtecnica;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANRP_SYSUSER", nullable = false, length = 50)
    private String anrpSysuser;

    @Column(name = "ANRP_SYSDATE")
    private LocalDate anrpSysdate;

    @Column(name = "ANRP_FLAG_ATTIVA")
    private Integer anrpFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnpePersona getAnrpFkAnpePersonaid() {
        return anrpFkAnpePersonaid;
    }

    public void setAnrpFkAnpePersonaid(AnpePersona anrpFkAnpePersonaid) {
        this.anrpFkAnpePersonaid = anrpFkAnpePersonaid;
    }

    public AnruRuolo getAnrpFkAnruRuoloid() {
        return anrpFkAnruRuoloid;
    }

    public void setAnrpFkAnruRuoloid(AnruRuolo anrpFkAnruRuoloid) {
        this.anrpFkAnruRuoloid = anrpFkAnruRuoloid;
    }

    public LocalDate getAnrpDatainizio() {
        return anrpDatainizio;
    }

    public void setAnrpDatainizio(LocalDate anrpDatainizio) {
        this.anrpDatainizio = anrpDatainizio;
    }

    public LocalDate getAnrpDatafine() {
        return anrpDatafine;
    }

    public void setAnrpDatafine(LocalDate anrpDatafine) {
        this.anrpDatafine = anrpDatafine;
    }

    public AnpePersona getAnrpFkAnpePersonatutorid() {
        return anrpFkAnpePersonatutorid;
    }

    public void setAnrpFkAnpePersonatutorid(AnpePersona anrpFkAnpePersonatutorid) {
        this.anrpFkAnpePersonatutorid = anrpFkAnpePersonatutorid;
    }

    public String getAnrpNote() {
        return anrpNote;
    }

    public void setAnrpNote(String anrpNote) {
        this.anrpNote = anrpNote;
    }

    public String getAnrpFormazionetrasversale1anno() {
        return anrpFormazionetrasversale1anno;
    }

    public void setAnrpFormazionetrasversale1anno(String anrpFormazionetrasversale1anno) {
        this.anrpFormazionetrasversale1anno = anrpFormazionetrasversale1anno;
    }

    public String getAnrpFormazionetrasversale2anno() {
        return anrpFormazionetrasversale2anno;
    }

    public void setAnrpFormazionetrasversale2anno(String anrpFormazionetrasversale2anno) {
        this.anrpFormazionetrasversale2anno = anrpFormazionetrasversale2anno;
    }

    public String getAnrpFormazionetrasversale3anno() {
        return anrpFormazionetrasversale3anno;
    }

    public void setAnrpFormazionetrasversale3anno(String anrpFormazionetrasversale3anno) {
        this.anrpFormazionetrasversale3anno = anrpFormazionetrasversale3anno;
    }

    public LocalDate getAnrpDatainizioformtecnica() {
        return anrpDatainizioformtecnica;
    }

    public void setAnrpDatainizioformtecnica(LocalDate anrpDatainizioformtecnica) {
        this.anrpDatainizioformtecnica = anrpDatainizioformtecnica;
    }

    public LocalDate getAnrpDatafineformtecnica() {
        return anrpDatafineformtecnica;
    }

    public void setAnrpDatafineformtecnica(LocalDate anrpDatafineformtecnica) {
        this.anrpDatafineformtecnica = anrpDatafineformtecnica;
    }

    public String getAnrpSysuser() {
        return anrpSysuser;
    }

    public void setAnrpSysuser(String anrpSysuser) {
        this.anrpSysuser = anrpSysuser;
    }

    public LocalDate getAnrpSysdate() {
        return anrpSysdate;
    }

    public void setAnrpSysdate(LocalDate anrpSysdate) {
        this.anrpSysdate = anrpSysdate;
    }

    public Integer getAnrpFlagAttiva() {
        return anrpFlagAttiva;
    }

    public void setAnrpFlagAttiva(Integer anrpFlagAttiva) {
        this.anrpFlagAttiva = anrpFlagAttiva;
    }
}