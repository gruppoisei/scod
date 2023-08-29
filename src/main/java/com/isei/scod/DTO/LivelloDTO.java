package com.isei.scod.DTO;

import com.isei.scod.Entity.CoccCcnl;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class LivelloDTO {

    private Integer id;

    private CcnlDTO coliFkCoccccnlid;

    @Size(max = 50)
    private String coliLivellocontratto;

    @Size(max = 50)
    @NotNull
    private String coliSysuser;

    private LocalDate coliSysdate;

    private Integer coliFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CcnlDTO getColiFkCoccccnlid() {
        return coliFkCoccccnlid;
    }

    public void setColiFkCoccccnlid(CcnlDTO coliFkCoccccnlid) {
        this.coliFkCoccccnlid = coliFkCoccccnlid;
    }

    public String getColiLivellocontratto() {
        return coliLivellocontratto;
    }

    public void setColiLivellocontratto(String coliLivellocontratto) {
        this.coliLivellocontratto = coliLivellocontratto;
    }

    public String getColiSysuser() {
        return coliSysuser;
    }

    public void setColiSysuser(String coliSysuser) {
        this.coliSysuser = coliSysuser;
    }

    public LocalDate getColiSysdate() {
        return coliSysdate;
    }

    public void setColiSysdate(LocalDate coliSysdate) {
        this.coliSysdate = coliSysdate;
    }

    public Integer getColiFlagAttiva() {
        return coliFlagAttiva;
    }

    public void setColiFlagAttiva(Integer coliFlagAttiva) {
        this.coliFlagAttiva = coliFlagAttiva;
    }
}
