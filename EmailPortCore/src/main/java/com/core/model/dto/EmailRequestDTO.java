package com.core.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
public class EmailRequestDTO {
    @ApiModelProperty(notes = "email address which will receive email", example = "some.email@gmail.com")
    protected String emailTo;

    @ApiModelProperty(notes = "sender email address which will send email", example = "marketing")
    protected String senderName;

    @ApiModelProperty(notes = "name of the template with configuration", example = "otp_template")
    protected String configTemplateName;

    protected String text;

    protected Map<String, Object> data;

}
