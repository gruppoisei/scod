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
@Table(name = "OFTI_TIPOOFFERTA")
public class OftiTipoofferta implements Serializable {
    private static final long serialVersionUID = -7024514187863831759L;
    @Id
    @Column(name = "OFTI_TIPOOFFERTAID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "OFTI_OFFERTADESC")
    private String oftiOffertadesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "OFTI_SYSUSER", nullable = false, length = 50)
    private String oftiSysuser;

    @Column(name = "OFTI_SYSDATE")
    private Instant oftiSysdate;

    @Column(name = "OFTI_FLAG_ATTIVA")
    private Integer oftiFlagAttiva;

}