package com.isei.scod.DTO;

import com.isei.scod.Entity.NotiNotifica;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class DestinatarionotificaDTO  {

    private Integer id;

    private NotificaDTO nodeFkNotiNotificaid;

    private PersonaDTO nodeFkAnpePersonaid;

    @Size(max = 50)
    @NotNull
    private String nodeSysuser;

    private LocalDate nodeSysdate;

    private Integer nodeFlagAttiva;


}