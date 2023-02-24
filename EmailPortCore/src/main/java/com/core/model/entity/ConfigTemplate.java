package com.core.model.entity;

import com.core.model.dto.ConfigTemplateRequestDTO;
import com.core.model.entity.email.EmailType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConfigTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String templateName;

    protected String senderName;

    protected EmailType emailType;

    @Min(0)
    @Max(100)
    protected Integer priority;


    public ConfigTemplate(ConfigTemplateRequestDTO configTemplateRequestDTO) {
        this.templateName = configTemplateRequestDTO.getTemplateName();
        this.senderName = configTemplateRequestDTO.getSenderName();
        this.emailType = configTemplateRequestDTO.getEmailType();
        this.priority = configTemplateRequestDTO.getPriority();
    }
}
