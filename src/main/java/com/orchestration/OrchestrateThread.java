package com.orchestration;

import com.log.TypescriptCodeChallengeLogger;
import com.model.Data;
import com.service.TransformDataServiceImpl;

public class OrchestrateThread extends Thread{

    private static TypescriptCodeChallengeLogger log = TypescriptCodeChallengeLogger.getLogger(OrchestrateThread.class.getName());

    public void run()
    {
        TransformDataServiceImpl dataService = new TransformDataServiceImpl();

        String dataFilePath = "./data.json";
        log.info("main: dataFilePath is " + dataFilePath);
        Data[] data = dataService.convertJsonToDataObject(dataFilePath);

        String tDataFilePath = "./transformed-data.json";
        log.info("main: tDataFilePath is " + tDataFilePath);
        dataService.convertDataObjectToJson(data, tDataFilePath);
    }
}
