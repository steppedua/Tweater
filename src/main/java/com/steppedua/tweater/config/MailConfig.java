package com.steppedua.tweater.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Value("${spring.mail.host}")
    private String host;

    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.password}")
    private String password;

    @Value("${spring.mail.port}")
    private int port;

    @Value("${spring.mail.protocol}")
    private String protocol;

    @Value("${mail.debug}")
    private String debug;

    @Value("${spring.mail.properties.mail.smtp.auth}")
    private String auth;

    @Value("${spring.mail.properties.mail.smtp.starttls.enable}")
    private String enable;


    @Value("${spring.mail.properties.mail.smtp.connectiontimeout}")
    private String connectionTimeOut;

    @Value("${spring.mail.properties.mail.smtp.timeout}")
    private String timeout;

    @Value("${spring.mail.properties.mail.smtp.writetimeout}")
    private String writeTimeOut;

    @Bean
    public JavaMailSender getMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost(host);
        mailSender.setPort(port);
        mailSender.setUsername(username);
        mailSender.setPassword(password);
        mailSender.setProtocol(protocol);

        Properties properties = mailSender.getJavaMailProperties();

        properties.setProperty("spring.mail.protocol", protocol);
        properties.setProperty("mail.debug", debug);

        properties.setProperty("spring.mail.properties.mail.smtp.auth", auth);
        properties.setProperty("spring.mail.properties.mail.smtp.starttls.enable", enable);

        properties.setProperty("spring.mail.properties.mail.smtp.connectiontimeout", connectionTimeOut);
        properties.setProperty("spring.mail.properties.mail.smtp.timeout", timeout);
        properties.setProperty("spring.mail.properties.mail.smtp.writetimeout", writeTimeOut);
        return mailSender;
    }
}
