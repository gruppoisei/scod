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
@Table(name = "ANTP_TITOLO_STUDIO_PERSONA")
public class AntpTitoloStudioPersona implements Serializable {
    private static final long serialVersionUID = 827937788258914530L;
    @EmbeddedId
    private AntpTitoloStudioPersonaId id;

    @MapsId("antpFkAnstTitolostudioid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANTP_FK_ANST_TITOLOSTUDIOID", nullable = false)
    private AnstTitoloStudio antpFkAnstTitolostudioid;

    @MapsId("antpFkAnpePersonaid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANTP_FK_ANPE_PERSONAID", nullable = false)
    private AnpePersona antpFkAnpePersonaid;

    @Column(name = "ANTP_DATA_CONSEGUIMENTO")
    private LocalDate antpDataConseguimento;

    @Column(name = "ANTP_VOTO")
    private Integer antpVoto;

    @Size(max = 100)
    @Column(name = "ANTP_ISTITUTO", length = 100)
    private String antpIstituto;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANTP_SYSUSER", nullable = false, length = 50)
    private String antpSysuser;

    @Column(name = "ANTP_SYSDATE")
    private LocalDate antpSysdate;

    @Column(name = "ANTP_FLAG_ATTIVA")
    private Integer antpFlagAttiva;

    public AntpTitoloStudioPersonaId getId() {
        return id;
    }

    public void setId(AntpTitoloStudioPersonaId id) {
        this.id = id;
    }

    public AnstTitoloStudio getAntpFkAnstTitolostudioid() {
        return antpFkAnstTitolostudioid;
    }

    public void setAntpFkAnstTitolostudioid(AnstTitoloStudio antpFkAnstTitolostudioid) {
        this.antpFkAnstTitolostudioid = antpFkAnstTitolostudioid;
    }

    public AnpePersona getAntpFkAnpePersonaid() {
        return antpFkAnpePersonaid;
    }

    public void setAntpFkAnpePersonaid(AnpePersona antpFkAnpePersonaid) {
        this.antpFkAnpePersonaid = antpFkAnpePersonaid;
    }

    public LocalDate getAntpDataConseguimento() {
        return antpDataConseguimento;
    }

    public void setAntpDataConseguimento(LocalDate antpDataConseguimento) {
        this.antpDataConseguimento = antpDataConseguimento;
    }

    public Integer getAntpVoto() {
        return antpVoto;
    }

    public void setAntpVoto(Integer antpVoto) {
        this.antpVoto = antpVoto;
    }

    public String getAntpIstituto() {
        return antpIstituto;
    }

    public void setAntpIstituto(String antpIstituto) {
        this.antpIstituto = antpIstituto;
    }

    public String getAntpSysuser() {
        return antpSysuser;
    }

    public void setAntpSysuser(String antpSysuser) {
        this.antpSysuser = antpSysuser;
    }

    public LocalDate getAntpSysdate() {
        return antpSysdate;
    }

    public void setAntpSysdate(LocalDate antpSysdate) {
        this.antpSysdate = antpSysdate;
    }

    public Integer getAntpFlagAttiva() {
        return antpFlagAttiva;
    }

    public void setAntpFlagAttiva(Integer antpFlagAttiva) {
        this.antpFlagAttiva = antpFlagAttiva;
    }
}