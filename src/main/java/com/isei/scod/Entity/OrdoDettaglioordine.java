package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ORDO_DETTAGLIOORDINE")
public class OrdoDettaglioordine implements Serializable {
    private static final long serialVersionUID = 4229046801884182667L;
    @Id
    @Column(name = "ORDO_DETTAGLIOORDINEID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDO_FK_ORSPTIPOPRODSERVID")
    private OrspTiposervizioprodotto ordoFkOrsptipoprodservid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDO_FK_ORDIORDINEID")
    private OrdiOrdine ordoFkOrdiordineid;

    @Size(max = 600)
    @Column(name = "ORDO_PRODSERVDESC", length = 600)
    private String ordoProdservdesc;

    @Size(max = 600)
    @Column(name = "ORDO_NOTE", length = 600)
    private String ordoNote;

    @Column(name = "ORDO_COSTO", precision = 15, scale = 2)
    private BigDecimal ordoCosto;

    @Column(name = "ORDO_QUANTITA")
    private Integer ordoQuantita;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORDO_SYSUSER", nullable = false, length = 50)
    private String ordoSysuser;

    @Column(name = "ORDO_SYSDATE")
    private Instant ordoSysdate;

    @Column(name = "ORDO_FLAG_ATTIVA")
    private Integer ordoFlagAttiva;

}