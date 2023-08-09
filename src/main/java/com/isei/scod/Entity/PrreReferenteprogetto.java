package com.isei.scod.Entity;

import jakarta.persistence.*;
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
@Table(name = "PRRE_REFERENTEPROGETTO")
public class PrreReferenteprogetto implements Serializable {
    private static final long serialVersionUID = 4482233800256838298L;
    @Id
    @Column(name = "PRRE_REFERENTEPROGETTOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRRE_FK_ANPEPERSONAID")
    private AnpePersona prreFkAnpepersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRRE_FK_PRRPRUOLOPROGETTOID", referencedColumnName = "PRRP_RUOLOPROGETTOID")
    private PrrpRuoloprogetto prreFkPrrpruoloprogettoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRRE_FK_PRPRPROGETTOID")
    private PrprProgetto prreFkPrprprogettoid;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRRE_SYSUSER", nullable = false, length = 50)
    private String prreSysuser;

    @Column(name = "PRRE_SYSDATE")
    private LocalDate prreSysdate;

    @Column(name = "PRRE_FLAG_ATTIVA")
    private Integer prreFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnpePersona getPrreFkAnpepersonaid() {
        return prreFkAnpepersonaid;
    }

    public void setPrreFkAnpepersonaid(AnpePersona prreFkAnpepersonaid) {
        this.prreFkAnpepersonaid = prreFkAnpepersonaid;
    }

    public PrrpRuoloprogetto getPrreFkPrrpruoloprogettoid() {
        return prreFkPrrpruoloprogettoid;
    }

    public void setPrreFkPrrpruoloprogettoid(PrrpRuoloprogetto prreFkPrrpruoloprogettoid) {
        this.prreFkPrrpruoloprogettoid = prreFkPrrpruoloprogettoid;
    }

    public PrprProgetto getPrreFkPrprprogettoid() {
        return prreFkPrprprogettoid;
    }

    public void setPrreFkPrprprogettoid(PrprProgetto prreFkPrprprogettoid) {
        this.prreFkPrprprogettoid = prreFkPrprprogettoid;
    }

    public String getPrreSysuser() {
        return prreSysuser;
    }

    public void setPrreSysuser(String prreSysuser) {
        this.prreSysuser = prreSysuser;
    }

    public LocalDate getPrreSysdate() {
        return prreSysdate;
    }

    public void setPrreSysdate(LocalDate prreSysdate) {
        this.prreSysdate = prreSysdate;
    }

    public Integer getPrreFlagAttiva() {
        return prreFlagAttiva;
    }

    public void setPrreFlagAttiva(Integer prreFlagAttiva) {
        this.prreFlagAttiva = prreFlagAttiva;
    }
}