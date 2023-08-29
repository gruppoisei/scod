package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TitoloStudioPersonaIdDTO {

    @NotNull
    private Integer antpFkAnstTitolostudioid;

    @NotNull
    private Integer antpFkAnpePersonaid;

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