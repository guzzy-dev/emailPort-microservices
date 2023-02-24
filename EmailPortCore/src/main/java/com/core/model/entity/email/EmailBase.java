package com.core.model.entity.email;

import com.core.model.entity.ConfigTemplate;
import com.core.model.entity.converter.EmailMapDataConverter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.sql.Time;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
public class EmailBase {
    @Min(0)
    @Max(100)
    @ApiModelProperty(notes = "priority of email which is going to be sent first", example = "50")
    protected Integer priority;

    @Email
    @ApiModelProperty(notes = "email address which will receive email", example = "some.email@gmail.com")
    protected String emailTo;

    @ApiModelProperty(notes = "sender email address which will send email", example = "marketing")
    protected String senderName;

    @ApiModelProperty(notes = "simple email or based on HTML")
    protected EmailType emailType;

    protected String configTemplateName;

    @JsonIgnore
    @Column(name = "data")
    protected String dataValue;

    @Transient
    protected Map<String, Object> data;

    protected Time createdTime;

    protected Time updatedTime;

    public void setData(Map<String, Object> data) {
        this.data = data;
        this.dataValue = EmailMapDataConverter.convertToDataBaseColumn(data);

    }

    @PreUpdate
    private void preUpdate() {
        this.updatedTime = new Time(System.currentTimeMillis());
    }

    public void setParamsFromConfigTemplate(ConfigTemplate configTemplate) {
        this.configTemplateName = configTemplate.getTemplateName();
        this.emailType = configTemplate.getEmailType();
        this.priority = configTemplate.getPriority();
        this.senderName = configTemplate.getSenderName();
    }
}
