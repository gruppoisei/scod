package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "NOTN_TIPONOTIFICA")
public class NotnTiponotifica implements Serializable {
    private static final long serialVersionUID = -4926929736078195119L;
    @Id
    @Column(name = "NOTN_TIPONOTIFICAID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "NOTN_TNOTDESC", nullable = false, length = 100)
    private String notnTnotdesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOTN_SYSUSER", nullable = false, length = 50)
    private String notnSysuser;

    @Column(name = "NOTN_SYSDATE")
    private Instant notnSysdate;

    @Column(name = "NOTN_FLAG_ATTIVA")
    private Integer notnFlagAttiva;

}