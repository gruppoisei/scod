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
@Table(name = "ANBABENEFITAZIENDALI")
public class Anbabenefitaziendali implements Serializable {
    private static final long serialVersionUID = -530353431167255148L;
    @Id
    @Column(name = "ANBA_BENEFITAZIENDALIID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANBA_FK_ANTB_TIPOBENEFITID")
    private AntbTipobenefitaziendali anbaFkAntbTipobenefitid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANBA_FK_ANPE_PERSONAID")
    private AnpePersona anbaFkAnpePersonaid;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANBA_SYSUSER", nullable = false, length = 50)
    private String anbaSysuser;

    @Column(name = "ANBA_SYSDATE")
    private Instant anbaSysdate;

    @Column(name = "ANBA_FLAG_ATTIVA")
    private Integer anbaFlagAttiva;

}