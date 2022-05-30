package com.qsoft.repository.service

import com.qsoft.repository.model.Forecast
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonObject
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class CrudOps {
    @Value("\${weather.url}")
    val weatherUrl: String? = null
    @Value("\${access.token}")
    val access_token: String? = null

    fun getForecast(days: Int?): Forecast? {
        val url = "$weatherUrl/current?access_key=$access_token&query=New York"
        val restTemplate = RestTemplate()
        try {
            val response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                Forecast::class.java
            )
            return response?.body
        } catch (ex: Exception) {
          print("Error occurred: $ex")
        }
        return null
    }
}