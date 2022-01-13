package com.example.admin.configuration;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;


@RefreshScope
@Data
@Component
public class Config implements Serializable{

	private static final long serialVersionUID = -8091879091924046844L;

    @Value("${admin.greeting:empty}")
    private String greeting;

    @Value("${base.url:empty}")
    private String testurl;
}