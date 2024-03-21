package ru.tele2.test.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
    @Value("${openapi.prod-url}")
    private String prodUrl;

    @Bean
    public OpenAPI myOpenAPI() {
        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("URL в продакшн-среде");

        Contact contact = new Contact();
        contact.setName("Persa666");
        contact.setUrl("https://github.com/persa666");

        Info info = new Info()
                .title("Time Service")
                .version("1.0")
                .contact(contact)
                .description("Time Service предоставляет возможность получить текущее время сервера с точностью " +
                        "до секунды и указанием таймзоны.");

        return new OpenAPI().info(info).servers(List.of(prodServer));
    }
}
