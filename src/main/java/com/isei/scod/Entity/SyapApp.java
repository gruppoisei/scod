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
@Entity
@Table(name = "SYAP_APP")
public class SyapApp implements Serializable {
    private static final long serialVersionUID = 7103970020447823621L;
    @Id
    @Column(name = "SYAP_IDAPP", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "SYAP_DESCAPP", length = 100)
    private String syapDescapp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSyapDescapp() {
        return syapDescapp;
    }

    public void setSyapDescapp(String syapDescapp) {
        this.syapDescapp = syapDescapp;
    }
}