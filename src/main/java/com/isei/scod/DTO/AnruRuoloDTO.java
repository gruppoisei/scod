package com.isei.scod.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
public class AnruRuoloDTO {

    @Size(max = 100)
    @NotNull
    private String anruRuolodesc;

    @Size(max = 50)
    @NotNull
    private String anruSysuser;

    private LocalDate anruSysdate;

    private Integer anruFlagAttiva;

    public String getAnruRuolodesc() {
        return anruRuolodesc;
    }

    public void setAnruRuolodesc(String anruRuolodesc) {
        this.anruRuolodesc = anruRuolodesc;
    }

    public String getAnruSysuser() {
        return anruSysuser;
    }

    public void setAnruSysuser(String anruSysuser) {
        this.anruSysuser = anruSysuser;
    }

    public LocalDate getAnruSysdate() {
        return anruSysdate;
    }

    public void setAnruSysdate(LocalDate anruSysdate) {
        this.anruSysdate = anruSysdate;
    }

    public Integer getAnruFlagAttiva() {
        return anruFlagAttiva;
    }

    public void setAnruFlagAttiva(Integer anruFlagAttiva) {
        this.anruFlagAttiva = anruFlagAttiva;
    }
}
