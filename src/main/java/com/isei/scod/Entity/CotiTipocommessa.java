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
@Table(name = "COTI_TIPOCOMMESSA")
public class CotiTipocommessa implements Serializable {
    private static final long serialVersionUID = -3015005378833064515L;
    @Id
    @Column(name = "COTI_TIPOCOMMESSAID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "COTI_TIPOCOMMESSADESC", nullable = false, length = 100)
    private String cotiTipocommessadesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "COTI_SYSUSER", nullable = false, length = 50)
    private String cotiSysuser;

    @Column(name = "COTI_SYSDATE")
    private Instant cotiSysdate;

    @Column(name = "COTI_FLAG_ATTIVA")
    private Integer cotiFlagAttiva;

}