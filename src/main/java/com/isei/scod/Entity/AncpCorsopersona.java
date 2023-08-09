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
@Table(name = "ANCP_CORSOPERSONA")
public class AncpCorsopersona implements Serializable {
    private static final long serialVersionUID = 9191737394122114347L;
    @Id
    @Column(name = "ANCP_CORSOPERSONAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANCP_FK_ANCF_CORSOFORMAZIONEID")
    private AncfCorsoformazione ancpFkAncfCorsoformazioneid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANCP_FK_ANPE_PERSONAID")
    private AnpePersona ancpFkAnpePersonaid;

    @Column(name = "ANCP_DATA_INIZIO")
    private LocalDate ancpDataInizio;

    @Column(name = "ANCP_DATA_FINE")
    private LocalDate ancpDataFine;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANCP_SYSUSER", nullable = false, length = 50)
    private String ancpSysuser;

    @Column(name = "ANCP_SYSDATE")
    private LocalDate ancpSysdate;

    @Column(name = "ANCP_FLAG_ATTIVA")
    private Integer ancpFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AncfCorsoformazione getAncpFkAncfCorsoformazioneid() {
        return ancpFkAncfCorsoformazioneid;
    }

    public void setAncpFkAncfCorsoformazioneid(AncfCorsoformazione ancpFkAncfCorsoformazioneid) {
        this.ancpFkAncfCorsoformazioneid = ancpFkAncfCorsoformazioneid;
    }

    public AnpePersona getAncpFkAnpePersonaid() {
        return ancpFkAnpePersonaid;
    }

    public void setAncpFkAnpePersonaid(AnpePersona ancpFkAnpePersonaid) {
        this.ancpFkAnpePersonaid = ancpFkAnpePersonaid;
    }

    public LocalDate getAncpDataInizio() {
        return ancpDataInizio;
    }

    public void setAncpDataInizio(LocalDate ancpDataInizio) {
        this.ancpDataInizio = ancpDataInizio;
    }

    public LocalDate getAncpDataFine() {
        return ancpDataFine;
    }

    public void setAncpDataFine(LocalDate ancpDataFine) {
        this.ancpDataFine = ancpDataFine;
    }

    public String getAncpSysuser() {
        return ancpSysuser;
    }

    public void setAncpSysuser(String ancpSysuser) {
        this.ancpSysuser = ancpSysuser;
    }

    public LocalDate getAncpSysdate() {
        return ancpSysdate;
    }

    public void setAncpSysdate(LocalDate ancpSysdate) {
        this.ancpSysdate = ancpSysdate;
    }

    public Integer getAncpFlagAttiva() {
        return ancpFlagAttiva;
    }

    public void setAncpFlagAttiva(Integer ancpFlagAttiva) {
        this.ancpFlagAttiva = ancpFlagAttiva;
    }
}