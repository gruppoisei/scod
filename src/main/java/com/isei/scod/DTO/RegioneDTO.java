package com.isei.scod.DTO;

import com.isei.scod.Entity.GeagAreaGeografica;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class RegioneDTO {

    private Integer id;

    @Size(max = 200)
    @NotNull
    private String gereDeno;

    private GeagAreaGeografica gereFkGeagAgeoid;

    @Size(max = 50)
    @NotNull
    private String gereSysuser;

    private Integer gereFlagAttiva;

    private LocalDate gereSysdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGereDeno() {
        return gereDeno;
    }

    public void setGereDeno(String gereDeno) {
        this.gereDeno = gereDeno;
    }

    public GeagAreaGeografica getGereFkGeagAgeoid() {
        return gereFkGeagAgeoid;
    }

    public void setGereFkGeagAgeoid(GeagAreaGeografica gereFkGeagAgeoid) {
        this.gereFkGeagAgeoid = gereFkGeagAgeoid;
    }

    public String getGereSysuser() {
        return gereSysuser;
    }

    public void setGereSysuser(String gereSysuser) {
        this.gereSysuser = gereSysuser;
    }

    public Integer getGereFlagAttiva() {
        return gereFlagAttiva;
    }

    public void setGereFlagAttiva(Integer gereFlagAttiva) {
        this.gereFlagAttiva = gereFlagAttiva;
    }

    public LocalDate getGereSysdate() {
        return gereSysdate;
    }

    public void setGereSysdate(LocalDate gereSysdate) {
        this.gereSysdate = gereSysdate;
    }
}
