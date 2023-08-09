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
@Table(name = "COCC_CCNL")
public class CoccCcnl implements Serializable {
    private static final long serialVersionUID = 514839418268228024L;
    @Id
    @Column(name = "COCC_CCNLID", nullable = false)
    private Integer id;

    @Size(max = 400)
    @Column(name = "COCC_DESC", length = 400)
    private String coccDesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "COCC_SYSUSER", nullable = false, length = 50)
    private String coccSysuser;

    @Column(name = "COCC_SYSDATE")
    private LocalDate coccSysdate;

    @Column(name = "COCC_FLAG_ATTIVA")
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