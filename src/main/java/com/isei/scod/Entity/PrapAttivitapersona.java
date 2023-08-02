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
@Table(name = "PRAP_ATTIVITAPERSONA")
public class PrapAttivitapersona implements Serializable {
    private static final long serialVersionUID = -7033883107497928420L;
    @Id
    @Column(name = "PRAP_ATTIVITAPERSONAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRAP_FK_ANPEPERSONAID")
    private AnpePersona prapFkAnpepersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRAP_FK_PRRPRUOLOPROGETTOID", referencedColumnName = "PRRP_RUOLOPROGETTOID")
    private PrrpRuoloprogetto prapFkPrrpruoloprogettoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRAP_FK_PRATATTIVITAPROGETTOID")
    private PratAttivitaprogetto prapFkPratattivitaprogettoid;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRAP_SYSUSER", nullable = false, length = 50)
    private String prapSysuser;

    @Column(name = "PRAP_SYSDATE")
    private Instant prapSysdate;

    @Column(name = "PRAP_FLAG_ATTIVA")
    private Integer prapFlagAttiva;

}