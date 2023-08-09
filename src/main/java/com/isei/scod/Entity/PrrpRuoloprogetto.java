package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRRP_RUOLOPROGETTO")
public class PrrpRuoloprogetto implements Serializable {

    private static final long serialVersionUID = 5831371126613834908L;

    @Id
    @Column(name = "PRRP_RUOLOPROGETTOID", nullable = false)
    private Integer prrpRuoloprogettoid;

    @Size(max = 100)
    @Column(name = "PRRP_RUOLOPROGETTODESC", length = 100)
    private String prrpRuoloprogettodesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRRP_SYSUSER", nullable = false, length = 50)
    private String prrpSysuser;

    @Column(name = "PRRP_SYSDATE")
    private LocalDate prrpSysdate;

    @Column(name = "PRRP_FLAG_ATTIVA")
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