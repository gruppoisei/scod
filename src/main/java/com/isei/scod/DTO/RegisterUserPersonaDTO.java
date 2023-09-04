package com.isei.scod.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserPersonaDTO {

    private RegisterUserDTO userDTO;
    private PersonaDTO personaDTO;

    public RegisterUserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(RegisterUserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public PersonaDTO getPersonaDTO() {
        return personaDTO;
    }

    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }
}
