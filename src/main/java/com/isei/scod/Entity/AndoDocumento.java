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
@Table(name = "ANDO_DOCUMENTO")
public class AndoDocumento implements Serializable {
    private static final long serialVersionUID = -3468920345446649501L;
    @Id
    @Column(name = "ANDO_DOCUMENTOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANDO_FK_ALTA_TIPOALLEGATOID")
    private AltaTipodocumento andoFkAltaTipoallegatoid;

    @Size(max = 255)
    @Column(name = "ANDO_PATHFILE")
    private String andoPathfile;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANDO_SYSUSER", nullable = false, length = 50)
    private String andoSysuser;

    @Column(name = "ANDO_SYSDATE")
    private Instant andoSysdate;

    @Column(name = "ANDO_FLAG_ATTIVA")
    private Integer andoFlagAttiva;

}