package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TRTR_TIPORICHIESTA")
public class TrtrTiporichiesta implements Serializable {
    private static final long serialVersionUID = 863018159805834044L;
    @Id
    @Column(name = "TRTR_TIPORICHIESTAID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "TRTR_TIPORICHIESTADESC", length = 100)
    private String trtrTiporichiestadesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "TRTR_SYSUSER", nullable = false, length = 50)
    private String trtrSysuser;

    @Column(name = "TRTR_SYSDATE")
    private LocalDate trtrSysdate;

    @Column(name = "TRTR_FLAG_ATTIVA")
    private Integer trtrFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrtrTiporichiestadesc() {
        return trtrTiporichiestadesc;
    }

    public void setTrtrTiporichiestadesc(String trtrTiporichiestadesc) {
        this.trtrTiporichiestadesc = trtrTiporichiestadesc;
    }

    public String getTrtrSysuser() {
        return trtrSysuser;
    }

    public void setTrtrSysuser(String trtrSysuser) {
        this.trtrSysuser = trtrSysuser;
    }

    public LocalDate getTrtrSysdate() {
        return trtrSysdate;
    }

    public void setTrtrSysdate(LocalDate trtrSysdate) {
        this.trtrSysdate = trtrSysdate;
    }

    public Integer getTrtrFlagAttiva() {
        return trtrFlagAttiva;
    }

    public void setTrtrFlagAttiva(Integer trtrFlagAttiva) {
        this.trtrFlagAttiva = trtrFlagAttiva;
    }
}