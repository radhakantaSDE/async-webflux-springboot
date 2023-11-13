package com.learn.app.config;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static io.r2dbc.spi.ConnectionFactoryOptions.*;

@Configuration
public class MySqlConnectionPool {

//    @Bean
//    public ConnectionFactory connectionFactory() {
//        return ConnectionFactories.get(
//                ConnectionFactoryOptions.builder()
//                        .option(DRIVER, "mysql")
//                        .option(HOST, "localhost")
//                        .option(PORT, 3306)
//                        .option(USER, "root")
//                        .option(PASSWORD, "root@123")
//                        .option(DATABASE, "async-db-demo")
//                        .build());
//    }
}
