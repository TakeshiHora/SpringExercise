package com.example.demo.domain.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class WeatherRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public Map<String, Object> findId(int id){
        
        //DBに登録されたものを抽出
        String query = "SELECT"
                + "weather_id,"
                + "weatherState,"
                + "disasterSubCategoryRegion1"
                + "prefecturalForecastRegion1"
                + "disasterSubCategoryRegion2"
                + "prefecturalForecastRegion2"
                + "disasterSubCategoryRegion3"
                + "prefecturalForecastRegion3"
                + "disasterSubCategoryRegion4"
                + "prefecturalForecastRegion4";
        
        Map<String, Object> weather = jdbcTemplate.queryForMap(query, id);
        
        return weather;
    }
    
    //INSERT INTOの記述方法は？JDBCのUPDATEを使う？
    public Map<String, Object> registId(int id){
        
        String query = "INSERT INTO weather"
                + "weather_id,"
                + "weatherState,"
                + "disasterSubCategoryRegion1"
                + "prefecturalForecastRegion1"
                + "disasterSubCategoryRegion2"
                + "prefecturalForecastRegion2"
                + "disasterSubCategoryRegion3"
                + "prefecturalForecastRegion3"
                + "disasterSubCategoryRegion4"
                + "prefecturalForecastRegion4";
        
        Map<String, Object> weather = jdbcTemplate.queryForMap(query, id);
        
        return weather;
    }
    
}
