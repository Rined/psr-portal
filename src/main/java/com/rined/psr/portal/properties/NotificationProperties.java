package com.rined.psr.portal.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "notification")
public class NotificationProperties {

    private String urlTemplateMarkup;

    private String urlTemplate;

    private String markupTemplate;

    private String token;

}
