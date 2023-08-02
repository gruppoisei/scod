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
@Table(name = "ANCP_CORSOPERSONA")
public class AncpCorsopersona implements Serializable {
    private static final long serialVersionUID = 9191737394122114347L;
    @Id
    @Column(name = "ANCP_CORSOPERSONAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANCP_FK_ANCF_CORSOFORMAZIONEID")
    private AncfCorsoformazione ancpFkAncfCorsoformazioneid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANCP_FK_ANPE_PERSONAID")
    private AnpePersona ancpFkAnpePersonaid;

    @Column(name = "ANCP_DATA_INIZIO")
    private Instant ancpDataInizio;

    @Column(name = "ANCP_DATA_FINE")
    private Instant ancpDataFine;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANCP_SYSUSER", nullable = false, length = 50)
    private String ancpSysuser;

    @Column(name = "ANCP_SYSDATE")
    private Instant ancpSysdate;

    @Column(name = "ANCP_FLAG_ATTIVA")
    private Integer ancpFlagAttiva;

}