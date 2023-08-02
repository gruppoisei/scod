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
    private Instant coapSysdate;

    @Column(name = "COAP_FLAG_ATTIVA")
    private Integer coapFlagAttiva;

}