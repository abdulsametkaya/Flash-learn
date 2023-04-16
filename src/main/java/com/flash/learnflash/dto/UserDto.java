package com.flash.learnflash.dto;

import com.flash.learnflash.entity.User;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity.
 *
 *
 *
 * @see java.io.Serializable
 *
 * @author abdulsametkaya
 */


@Data
public class UserDto implements Serializable {
    private final Long id;
    private final String name;
}
