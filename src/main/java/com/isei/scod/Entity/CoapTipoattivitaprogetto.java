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
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COAP_TIPOATTIVITAPROGETTO")
public class CoapTipoattivitaprogetto implements Serializable {
    private static final long serialVersionUID = 3593084527637743639L;
    @Id
    @Column(name = "COAP_TIPOATTIVITAPROGETTOID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "COAP_TIPOATTPROGDESC", nullable = false)
    private String coapTipoattprogdesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "COAP_SYSUSER", nullable = false, length = 50)
    private String coapSysuser;

    @Column(name = "COAP_SYSDATE")
    private LocalDate coapSysdate;

    @Column(name = "COAP_FLAG_ATTIVA")
    private Integer coapFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoapTipoattprogdesc() {
        return coapTipoattprogdesc;
    }

    public void setCoapTipoattprogdesc(String coapTipoattprogdesc) {
        this.coapTipoattprogdesc = coapTipoattprogdesc;
    }

    public String getCoapSysuser() {
        return coapSysuser;
    }

    public void setCoapSysuser(String coapSysuser) {
        this.coapSysuser = coapSysuser;
    }

    public LocalDate getCoapSysdate() {
        return coapSysdate;
    }

    public void setCoapSysdate(LocalDate coapSysdate) {
        this.coapSysdate = coapSysdate;
    }

    public Integer getCoapFlagAttiva() {
        return coapFlagAttiva;
    }

    public void setCoapFlagAttiva(Integer coapFlagAttiva) {
        this.coapFlagAttiva = coapFlagAttiva;
    }
}