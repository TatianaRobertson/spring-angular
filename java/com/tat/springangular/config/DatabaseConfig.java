package com.tat.springangular.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.tat.springangular.repository")
@EnableTransactionManagement
public class DatabaseConfig {

}
