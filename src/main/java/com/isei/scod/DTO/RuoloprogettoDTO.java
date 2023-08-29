package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class RuoloprogettoDTO {

    private Integer prrpRuoloprogettoid;

    @Size(max = 100)
    private String prrpRuoloprogettodesc;

    @Size(max = 50)
    @NotNull
    private String prrpSysuser;

    private LocalDate prrpSysdate;

    private Integer prrpFlagAttiva;

    public Integer getPrrpRuoloprogettoid() {
        return prrpRuoloprogettoid;
    }

    public void setPrrpRuoloprogettoid(Integer prrpRuoloprogettoid) {
        this.prrpRuoloprogettoid = prrpRuoloprogettoid;
    }

    public String getPrrpRuoloprogettodesc() {
        return prrpRuoloprogettodesc;
    }

    public void setPrrpRuoloprogettodesc(String prrpRuoloprogettodesc) {
        this.prrpRuoloprogettodesc = prrpRuoloprogettodesc;
    }

    public String getPrrpSysuser() {
        return prrpSysuser;
    }

    public void setPrrpSysuser(String prrpSysuser) {
        this.prrpSysuser = prrpSysuser;
    }

    public LocalDate getPrrpSysdate() {
        return prrpSysdate;
    }

    public void setPrrpSysdate(LocalDate prrpSysdate) {
        this.prrpSysdate = prrpSysdate;
    }

    public Integer getPrrpFlagAttiva() {
        return prrpFlagAttiva;
    }

    public void setPrrpFlagAttiva(Integer prrpFlagAttiva) {
        this.prrpFlagAttiva = prrpFlagAttiva;
    }
}