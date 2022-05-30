package com.qsoft.repository.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
open class WebConfig() : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry){
        registry.addMapping("/**").allowedOrigins("*").allowedHeaders("GET")
    }
}