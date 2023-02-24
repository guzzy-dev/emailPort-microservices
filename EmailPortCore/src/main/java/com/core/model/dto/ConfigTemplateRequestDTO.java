package com.core.model.dto;

import com.core.model.entity.email.EmailType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * A DTO for the {@link com.core.model.entity.ConfigTemplate} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigTemplateRequestDTO implements Serializable {
    private String templateName;
    private String senderName;
    private EmailType emailType;
    @Min(0)
    @Max(100)
    private Integer priority;
}