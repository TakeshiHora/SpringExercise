package com.example.demo.controller;

import com.example.demo.domain.service.WeatherService;
import jp.ac.aiit.pbl.disaster.QZQSMDecoder;
import jp.ac.aiit.pbl.disaster.weather.Weather;
import jp.ac.aiit.pbl.disaster.weather.WeatherParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/api/weather")
    public String getWeather(){
        
        return "weather";
    }
    
    //16進数をDecord後どのようにPOSTする？
    //weather
    //QZQSMDecoder qzqsmDecoder = new QZQSMDecoder();
    //    qzqsmDecoder.decode("53ADF36C518002D3885A7D8B5DEA82085041AA08AD42EE2864500013B6DE7A0");

    @PostMapping("/api/weather")
    public String WeatherPostRequestDB(Integer id, Model model){
        
        //weatherServiceでsetした値格納する
        Weather weather = weatherService.findId(id);

        model.addAttribute("prefix", weather.getPrefix());
        model.addAttribute("weatherSubcategoryAndRegions", weather.getWeatherSubcategoryAndRegions());
        model.addAttribute("warningState", weather.getWarningState());

        return "weatherResponseDB";

    }

}