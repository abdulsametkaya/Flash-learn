package com.flash.learnflash.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.flash.learnflash.entity.Customer} entity.
 *
 *
 *
 * @see java.io.Serializable
 *
 * @author abdulsametkaya
 */


@Data
public class CustomerDto implements Serializable {
    private final Long id;
    private final String name;
}
