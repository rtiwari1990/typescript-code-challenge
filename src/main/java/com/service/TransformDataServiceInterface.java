package com.service;

import com.model.Data;

public interface TransformDataServiceInterface {

    public Data[] convertJsonToDataObject(String filePath);

    public void convertDataObjectToJson(Data[] data, String filePath);
}
