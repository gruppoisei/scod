package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class CcnlDTO {

    private Integer id;

    @Size(max = 400)
    private String coccDesc;

    @Size(max = 50)
    @NotNull
    private String coccSysuser;

    private LocalDate coccSysdate;

    private Integer coccFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoccDesc() {
        return coccDesc;
    }

    public void setCoccDesc(String coccDesc) {
        this.coccDesc = coccDesc;
    }

    public String getCoccSysuser() {
        return coccSysuser;
    }

    public void setCoccSysuser(String coccSysuser) {
        this.coccSysuser = coccSysuser;
    }

    public LocalDate getCoccSysdate() {
        return coccSysdate;
    }

    public void setCoccSysdate(LocalDate coccSysdate) {
        this.coccSysdate = coccSysdate;
    }

    public Integer getCoccFlagAttiva() {
        return coccFlagAttiva;
    }

    public void setCoccFlagAttiva(Integer coccFlagAttiva) {
        this.coccFlagAttiva = coccFlagAttiva;
    }
}
