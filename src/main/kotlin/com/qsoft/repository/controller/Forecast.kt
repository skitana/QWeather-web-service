package com.qsoft.repository.controller

import com.qsoft.repository.service.ForecastService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.encodeToJsonElement

@RestController
@RequestMapping("/forecast")
class Forecast(
    @Autowired
    val forecastService: ForecastService
) {
    @GetMapping("")
    fun getForecast(
        @RequestParam(value = "days", required= false) days: Int?
    ): JsonElement {
        val result = forecastService.getForecast(days)
        return Json.encodeToJsonElement(result)
    }
}