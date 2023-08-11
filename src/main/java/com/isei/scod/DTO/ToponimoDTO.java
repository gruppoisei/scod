package com.isei.scod.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class ToponimoDTO {

    private String getoToponimoid;

    @Size(max = 50)
    @NotNull
    private String getoSysuser;

    private LocalDate getoSysdate;

    private Integer getoFlagAttiva;

    public String getGetoToponimoid() {
        return getoToponimoid;
    }

    public void setGetoToponimoid(String getoToponimoid) {
        this.getoToponimoid = getoToponimoid;
    }

    public String getGetoSysuser() {
        return getoSysuser;
    }

    public void setGetoSysuser(String getoSysuser) {
        this.getoSysuser = getoSysuser;
    }

    public LocalDate getGetoSysdate() {
        return getoSysdate;
    }

    public void setGetoSysdate(LocalDate getoSysdate) {
        this.getoSysdate = getoSysdate;
    }

    public Integer getGetoFlagAttiva() {
        return getoFlagAttiva;
    }

    public void setGetoFlagAttiva(Integer getoFlagAttiva) {
        this.getoFlagAttiva = getoFlagAttiva;
    }
}
