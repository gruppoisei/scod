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
@Table(name = "GETO_TOPONIMO")
public class GetoToponimo implements Serializable {
    private static final long serialVersionUID = -3201705764439528385L;
    @Id
    @Size(max = 20)
    @Column(name = "GETO_TOPONIMOID", nullable = false, length = 20)
    private String getoToponimoid;

    @Size(max = 50)
    @NotNull
    @Column(name = "GETO_SYSUSER", nullable = false, length = 50)
    private String getoSysuser;

    @Column(name = "GETO_SYSDATE")
    private Instant getoSysdate;

    @Column(name = "GETO_FLAG_ATTIVA")
    private Integer getoFlagAttiva;

}