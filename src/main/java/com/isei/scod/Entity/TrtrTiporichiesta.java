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
@Table(name = "TRTR_TIPORICHIESTA")
public class TrtrTiporichiesta implements Serializable {
    private static final long serialVersionUID = 863018159805834044L;
    @Id
    @Column(name = "TRTR_TIPORICHIESTAID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "TRTR_TIPORICHIESTADESC", length = 100)
    private String trtrTiporichiestadesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "TRTR_SYSUSER", nullable = false, length = 50)
    private String trtrSysuser;

    @Column(name = "TRTR_SYSDATE")
    private Instant trtrSysdate;

    @Column(name = "TRTR_FLAG_ATTIVA")
    private Integer trtrFlagAttiva;

}