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
@Table(name = "ALTA_TIPODOCUMENTO")
public class AltaTipodocumento implements Serializable {
    private static final long serialVersionUID = -3725839509342770178L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ALTA_TIPODOCUMENTOID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "ALTA_TIPODOCUMENTODESC", length = 100)
    private String altaTipodocumentodesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ALTA_SYSUSER", nullable = false, length = 50)
    private String altaSysuser;

    @Column(name = "ALTA_SYSDATE")
    private Instant altaSysdate;

    @Column(name = "ALTA_FLAG_ATTIVA")
    private Integer altaFlagAttiva;

}