package com.isei.scod.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class AreaGeograficaDTO {

    private Integer id;

    @Size(max = 200)
    @NotNull
    private String geagDeno;

    private LocalDate geagSysdate;

    @Size(max = 50)
    @NotNull
    private String geagSysuser;

    private Integer geagFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGeagDeno() {
        return geagDeno;
    }

    public void setGeagDeno(String geagDeno) {
        this.geagDeno = geagDeno;
    }

    public LocalDate getGeagSysdate() {
        return geagSysdate;
    }

    public void setGeagSysdate(LocalDate geagSysdate) {
        this.geagSysdate = geagSysdate;
    }

    public String getGeagSysuser() {
        return geagSysuser;
    }

    public void setGeagSysuser(String geagSysuser) {
        this.geagSysuser = geagSysuser;
    }

    public Integer getGeagFlagAttiva() {
        return geagFlagAttiva;
    }

    public void setGeagFlagAttiva(Integer geagFlagAttiva) {
        this.geagFlagAttiva = geagFlagAttiva;
    }

}
