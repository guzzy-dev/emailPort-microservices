package com.core.model.entity.converter;

import org.json.JSONObject;

import java.util.Map;

public class EmailMapDataConverter {
    private EmailMapDataConverter(){
        throw new IllegalStateException("Utility class");
    }

    public static String convertToDataBaseColumn(Map<String, Object> data) {
        return new JSONObject(data).toString();
    }

    public static Map<String, Object> convertToEntity(String data){
        return new JSONObject(data).toMap();
    }
}
