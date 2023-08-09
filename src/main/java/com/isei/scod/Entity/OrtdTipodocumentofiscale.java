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
@Table(name = "ORTD_TIPODOCUMENTOFISCALE")
public class OrtdTipodocumentofiscale implements Serializable {
    private static final long serialVersionUID = -2972644658918440756L;
    @Id
    @Column(name = "ORTD_TIPODOCUMENTOFISCALEID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "ORTD_TIPODESC", length = 100)
    private String ortdTipodesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORTD_SYSUSER", nullable = false, length = 50)
    private String ortdSysuser;

    @Column(name = "ORTD_SYSDATE")
    private LocalDate ortdSysdate;

    @Column(name = "ORTD_FLAG_ATTIVA")
    private Integer ortdFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrtdTipodesc() {
        return ortdTipodesc;
    }

    public void setOrtdTipodesc(String ortdTipodesc) {
        this.ortdTipodesc = ortdTipodesc;
    }

    public String getOrtdSysuser() {
        return ortdSysuser;
    }

    public void setOrtdSysuser(String ortdSysuser) {
        this.ortdSysuser = ortdSysuser;
    }

    public LocalDate getOrtdSysdate() {
        return ortdSysdate;
    }

    public void setOrtdSysdate(LocalDate ortdSysdate) {
        this.ortdSysdate = ortdSysdate;
    }

    public Integer getOrtdFlagAttiva() {
        return ortdFlagAttiva;
    }

    public void setOrtdFlagAttiva(Integer ortdFlagAttiva) {
        this.ortdFlagAttiva = ortdFlagAttiva;
    }
}