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
@Table(name = "PRAT_ATTIVITAPROGETTO")
public class PratAttivitaprogetto implements Serializable {
    private static final long serialVersionUID = -871042350999854582L;
    @Id
    @Column(name = "PRAT_ATTIVITAPROGETTOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRAT_FK_PRPRPROGETTOID")
    private PrprProgetto pratFkPrprprogettoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRAT_FK_COAPATTIVITAPROGETTOID")
    private CoapTipoattivitaprogetto pratFkCoapattivitaprogettoid;

    @Column(name = "PRAT_DATAINIZIO")
    private Instant pratDatainizio;

    @Column(name = "PRAT_DATAFINE")
    private Instant pratDatafine;

    @Size(max = 100)
    @Column(name = "PRAT_NOTE", length = 100)
    private String pratNote;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRAT_SYSUSER", nullable = false, length = 50)
    private String pratSysuser;

    @Column(name = "PRAT_SYSDATE")
    private Instant pratSysdate;

    @Column(name = "PRAT_FLAG_ATTIVA")
    private Integer pratFlagAttiva;

}