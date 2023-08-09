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
@Table(name = "ANBABENEFITAZIENDALI")
public class Anbabenefitaziendali implements Serializable {
    private static final long serialVersionUID = -530353431167255148L;
    @Id
    @Column(name = "ANBA_BENEFITAZIENDALIID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANBA_FK_ANTB_TIPOBENEFITID")
    private AntbTipobenefitaziendali anbaFkAntbTipobenefitid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANBA_FK_ANPE_PERSONAID")
    private AnpePersona anbaFkAnpePersonaid;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANBA_SYSUSER", nullable = false, length = 50)
    private String anbaSysuser;

    @Column(name = "ANBA_SYSDATE")
    private LocalDate anbaSysdate;

    @Column(name = "ANBA_FLAG_ATTIVA")
    private Integer anbaFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AntbTipobenefitaziendali getAnbaFkAntbTipobenefitid() {
        return anbaFkAntbTipobenefitid;
    }

    public void setAnbaFkAntbTipobenefitid(AntbTipobenefitaziendali anbaFkAntbTipobenefitid) {
        this.anbaFkAntbTipobenefitid = anbaFkAntbTipobenefitid;
    }

    public AnpePersona getAnbaFkAnpePersonaid() {
        return anbaFkAnpePersonaid;
    }

    public void setAnbaFkAnpePersonaid(AnpePersona anbaFkAnpePersonaid) {
        this.anbaFkAnpePersonaid = anbaFkAnpePersonaid;
    }

    public String getAnbaSysuser() {
        return anbaSysuser;
    }

    public void setAnbaSysuser(String anbaSysuser) {
        this.anbaSysuser = anbaSysuser;
    }

    public LocalDate getAnbaSysdate() {
        return anbaSysdate;
    }

    public void setAnbaSysdate(LocalDate anbaSysdate) {
        this.anbaSysdate = anbaSysdate;
    }

    public Integer getAnbaFlagAttiva() {
        return anbaFlagAttiva;
    }

    public void setAnbaFlagAttiva(Integer anbaFlagAttiva) {
        this.anbaFlagAttiva = anbaFlagAttiva;
    }
}