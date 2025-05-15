package com.hms.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmenityRequestDTO {
	@NotBlank(message = "Amenity name is required")
    private String name;
 
    @NotBlank(message = "Description is required")
    private String description;

}
