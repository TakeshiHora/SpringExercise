package com.example.demo.domain.service;

import com.example.demo.domain.repository.WeatherRepository;
import jp.ac.aiit.pbl.disaster.DisasterSubcategory;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;
import jp.ac.aiit.pbl.disaster.weather.WarningState;
import jp.ac.aiit.pbl.disaster.weather.Weather;
import jp.ac.aiit.pbl.disaster.weather.WeatherSubcategoryAndRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    //IDをキーにしてテーブルからフィールド毎に値を取り出したい
    public Weather findId(int id){
        Map<String, Object> map = weatherRepository.findId(id);

        Prefix prefix = (Prefix) map.get("prefix");
        WarningState warningState = (WarningState) map.get("warningState");
        List<WeatherSubcategoryAndRegion> disasterSubCategory1 = (List<WeatherSubcategoryAndRegion>) map.get("disasterSubCategory1");
        List<WeatherSubcategoryAndRegion> prefecturalForecastRegion1 = (List<WeatherSubcategoryAndRegion>) map.get("prefecturalForecastRegion1");
        List<WeatherSubcategoryAndRegion> disasterSubCategory2 = (List<WeatherSubcategoryAndRegion>) map.get("disasterSubCategory2");
        List<WeatherSubcategoryAndRegion> prefecturalForecastRegion2 = (List<WeatherSubcategoryAndRegion>) map.get("prefecturalForecastRegion2");
        List<WeatherSubcategoryAndRegion> disasterSubCategory3 = (List<WeatherSubcategoryAndRegion>) map.get("disasterSubCategory3");
        List<WeatherSubcategoryAndRegion> prefecturalForecastRegion3 = (List<WeatherSubcategoryAndRegion>) map.get("prefecturalForecastRegion3");
        List<WeatherSubcategoryAndRegion> disasterSubCategory4 = (List<WeatherSubcategoryAndRegion>) map.get("disasterSubCategory4");
        List<WeatherSubcategoryAndRegion> prefecturalForecastRegion4 = (List<WeatherSubcategoryAndRegion>) map.get("prefecturalForecastRegion4");
        
        //DBの値をsetする
        Weather weather = new Weather();
        weather.setPrefix(prefix);
        weather.setWarningState(warningState);
        weather.setWeatherSubcategoryAndRegions(disasterSubCategory1);
        weather.setWeatherSubcategoryAndRegions(prefecturalForecastRegion1);
        weather.setWeatherSubcategoryAndRegions(disasterSubCategory2);
        weather.setWeatherSubcategoryAndRegions(prefecturalForecastRegion2);
        weather.setWeatherSubcategoryAndRegions(disasterSubCategory3);
        weather.setWeatherSubcategoryAndRegions(prefecturalForecastRegion3);
        weather.setWeatherSubcategoryAndRegions(disasterSubCategory4);
        weather.setWeatherSubcategoryAndRegions(prefecturalForecastRegion4);
        
        return weather;
    }
}