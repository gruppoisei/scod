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
@Table(name = "GEPA_PAESE")
public class GepaPaese implements Serializable {
    private static final long serialVersionUID = 1241381074917407938L;
    @Id
    @Column(name = "GEPA_PAESEID", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "GEPA_CODICEPAESE", nullable = false, length = 20)
    private String gepaCodicepaese;

    @Size(max = 20)
    @NotNull
    @Column(name = "GEPA_CODICEPAESEALPHA2", nullable = false, length = 20)
    private String gepaCodicepaesealpha2;

    @Size(max = 20)
    @NotNull
    @Column(name = "GEPA_CODICEPAESEALPHA3", nullable = false, length = 20)
    private String gepaCodicepaesealpha3;

    @Size(max = 50)
    @NotNull
    @Column(name = "GEPA_SYSUSER", nullable = false, length = 50)
    private String gepaSysuser;

    @Column(name = "GEPA_SYSDATE")
    private Instant gepaSysdate;

    @Column(name = "GEPA_FLAG_ATTIVA")
    private Integer gepaFlagAttiva;

    @Size(max = 200)
    @NotNull
    @Column(name = "GEPA_DENOMINAZIONE", nullable = false, length = 200)
    private String gepaDenominazione;

}