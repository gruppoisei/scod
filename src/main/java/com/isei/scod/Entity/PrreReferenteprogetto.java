package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
    private Instant prreSysdate;

    @Column(name = "PRRE_FLAG_ATTIVA")
    private Integer prreFlagAttiva;

}