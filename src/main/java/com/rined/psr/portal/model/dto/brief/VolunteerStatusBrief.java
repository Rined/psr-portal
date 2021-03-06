package com.rined.psr.portal.model.dto.brief;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VolunteerStatusBrief {

    @NotNull(message = "Name is mandatory!")
    @NotBlank(message = "Name is mandatory!")
    @JsonProperty("name")
    private String name;

}
