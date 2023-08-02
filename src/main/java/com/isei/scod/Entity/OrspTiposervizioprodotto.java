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
@Table(name = "ORSP_TIPOSERVIZIOPRODOTTO")
public class OrspTiposervizioprodotto implements Serializable {
    private static final long serialVersionUID = 1279683733438118121L;
    @Id
    @Column(name = "ORSP_TIPOSERVIZIOPRODOTTOID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "ORSP_PRODSERVNOME")
    private String orspProdservnome;

    @Size(max = 50)
    @NotNull
    @Column(name = "ORSP_SYSUSER", nullable = false, length = 50)
    private String orspSysuser;

    @Column(name = "ORSP_SYSDATE")
    private Instant orspSysdate;

    @Column(name = "ORSP_FLAG_ATTIVA")
    private Integer orspFlagAttiva;

}