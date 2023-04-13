package com.flash.learnflash.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.flash.learnflash.entity.Word} entity.
 *
 * @param id
 * @param name
 *
 *
 * @author abdulsametkaya
 */
@Data
public record WordDto(Long id, String name) implements Serializable {

}
