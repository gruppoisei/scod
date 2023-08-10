package com.isei.scod.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class SysaStatoAbilitazioneDTO {

    @Size(max = 20)
    @NotNull
    private String sysaStatoAbilitazioneDesc;

    @Size(max = 50)
    @NotNull
    private String sysaSysueser;

    private LocalDate sysaSysdate;

    private Integer sysaFlagAttivo;

    public String getSysaStatoAbilitazioneDesc() {
        return sysaStatoAbilitazioneDesc;
    }

    public void setSysaStatoAbilitazioneDesc(String sysaStatoAbilitazioneDesc) {
        this.sysaStatoAbilitazioneDesc = sysaStatoAbilitazioneDesc;
    }

    public String getSysaSysueser() {
        return sysaSysueser;
    }

    public void setSysaSysueser(String sysaSysueser) {
        this.sysaSysueser = sysaSysueser;
    }

    public LocalDate getSysaSysdate() {
        return sysaSysdate;
    }

    public void setSysaSysdate(LocalDate sysaSysdate) {
        this.sysaSysdate = sysaSysdate;
    }

    public Integer getSysaFlagAttivo() {
        return sysaFlagAttivo;
    }

    public void setSysaFlagAttivo(Integer sysaFlagAttivo) {
        this.sysaFlagAttivo = sysaFlagAttivo;
    }
}
