package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AntpTitoloStudioPersonaId implements Serializable {
    private static final long serialVersionUID = 6028466450979968710L;
    @NotNull
    @Column(name = "ANTP_FK_ANST_TITOLOSTUDIOID", nullable = false)
    private Integer antpFkAnstTitolostudioid;

    @NotNull
    @Column(name = "ANTP_FK_ANPE_PERSONAID", nullable = false)
    private Integer antpFkAnpePersonaid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AntpTitoloStudioPersonaId entity = (AntpTitoloStudioPersonaId) o;
        return Objects.equals(this.antpFkAnstTitolostudioid, entity.antpFkAnstTitolostudioid) &&
                Objects.equals(this.antpFkAnpePersonaid, entity.antpFkAnpePersonaid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(antpFkAnstTitolostudioid, antpFkAnpePersonaid);
    }

    public Integer getAntpFkAnstTitolostudioid() {
        return antpFkAnstTitolostudioid;
    }

    public void setAntpFkAnstTitolostudioid(Integer antpFkAnstTitolostudioid) {
        this.antpFkAnstTitolostudioid = antpFkAnstTitolostudioid;
    }

    public Integer getAntpFkAnpePersonaid() {
        return antpFkAnpePersonaid;
    }

    public void setAntpFkAnpePersonaid(Integer antpFkAnpePersonaid) {
        this.antpFkAnpePersonaid = antpFkAnpePersonaid;
    }
}