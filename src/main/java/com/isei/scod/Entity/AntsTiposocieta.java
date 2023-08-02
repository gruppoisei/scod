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
@Table(name = "ANTS_TIPOSOCIETA")
public class AntsTiposocieta implements Serializable {
    private static final long serialVersionUID = 7584401466293022950L;
    @Id
    @Column(name = "ANTS_TIPOSOCID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "ANTS_TIPOSOCDESC", nullable = false, length = 100)
    private String antsTiposocdesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANTS_SYSUSER", nullable = false, length = 50)
    private String antsSysuser;

    @Column(name = "ANTS_SYSDATE")
    private Instant antsSysdate;

    @Column(name = "ANTS_FLAG_ATTIVA")
    private Integer antsFlagAttiva;

}