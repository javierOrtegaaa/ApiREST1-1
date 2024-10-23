package com.vedruna.apiRest1_1.dto;

import com.vedruna.apiRest1_1.persistance.models.Contacto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactoDTO {
    private int contactoId;
    private String direccion;
    private int telefono;

    public ContactoDTO(Contacto contacto) {
        this.contactoId = contacto.getContactoId();
        this.direccion = contacto.getAddress();
        this.telefono = contacto.getPhone();
    }
}

