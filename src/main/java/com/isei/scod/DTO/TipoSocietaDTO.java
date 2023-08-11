package com.isei.scod.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class TipoSocietaDTO {

    @Size(max = 100)
    @NotNull
    private String antsTiposocdesc;

    @Size(max = 50)
    @NotNull
    private String antsSysuser;

    private LocalDate antsSysdate;

    private Integer antsFlagAttiva;

    public String getAntsTiposocdesc() {
        return antsTiposocdesc;
    }

    public void setAntsTiposocdesc(String antsTiposocdesc) {
        this.antsTiposocdesc = antsTiposocdesc;
    }

    public String getAntsSysuser() {
        return antsSysuser;
    }

    public void setAntsSysuser(String antsSysuser) {
        this.antsSysuser = antsSysuser;
    }

    public LocalDate getAntsSysdate() {
        return antsSysdate;
    }

    public void setAntsSysdate(LocalDate antsSysdate) {
        this.antsSysdate = antsSysdate;
    }

    public Integer getAntsFlagAttiva() {
        return antsFlagAttiva;
    }

    public void setAntsFlagAttiva(Integer antsFlagAttiva) {
        this.antsFlagAttiva = antsFlagAttiva;
    }
}
