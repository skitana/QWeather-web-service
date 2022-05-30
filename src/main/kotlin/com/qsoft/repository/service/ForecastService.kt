package com.qsoft.repository.service

import com.qsoft.repository.model.Forecast
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ForecastService(
    @Autowired
    val crudOps: CrudOps
) {
    lateinit var forecast: Forecast

    fun getForecast(
        daysBack: Int?,
    ) : Forecast?{
        val result = crudOps.getForecast(daysBack)
        print(result)
        return forecast
    }
}