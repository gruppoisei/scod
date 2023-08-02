package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SYRU_RUOLISISTEMA")
public class SyruRuolisistema implements Serializable {
    private static final long serialVersionUID = -7629252391988290122L;
    @Id
    @Column(name = "SYRU_IDRUOLOSYS", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "SYRU_DESCRUOLOSYS", length = 100)
    private String syruDescruolosys;

}