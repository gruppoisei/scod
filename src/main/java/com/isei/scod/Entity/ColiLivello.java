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
@Table(name = "COLI_LIVELLO")
public class ColiLivello implements Serializable {
    private static final long serialVersionUID = 4313956977601241016L;
    @Id
    @Column(name = "COLI_LIVELLOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COLI_FK_COCCCCNLID")
    private CoccCcnl coliFkCoccccnlid;

    @Size(max = 50)
    @Column(name = "COLI_LIVELLOCONTRATTO", length = 50)
    private String coliLivellocontratto;

    @Size(max = 50)
    @NotNull
    @Column(name = "COLI_SYSUSER", nullable = false, length = 50)
    private String coliSysuser;

    @Column(name = "COLI_SYSDATE")
    private Instant coliSysdate;

    @Column(name = "COLI_FLAG_ATTIVA")
    private Integer coliFlagAttiva;

}