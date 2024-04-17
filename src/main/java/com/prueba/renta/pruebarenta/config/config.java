package com.prueba.renta.pruebarenta.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class config {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    private static final String DATABASE_CONFIGURATION = "dataSource";

    @Bean(name = DATABASE_CONFIGURATION)
    public DataSource dataSource() {
        log.info(DATABASE_CONFIGURATION + " Ejecutando la configuracion de la BD en >>>>>>>> {}", this.getClass().getCanonicalName());
        return DataSourceBuilder.create()
                .url(url)
                .username(username)
                .password(password)
                .build();
    }
}
