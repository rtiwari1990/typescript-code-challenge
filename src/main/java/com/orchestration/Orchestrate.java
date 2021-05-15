package com.orchestration;

import com.log.TypescriptCodeChallengeLogger;
import com.model.Data;
import com.service.TransformDataServiceImpl;

public class Orchestrate {

    private static TypescriptCodeChallengeLogger log = TypescriptCodeChallengeLogger.getLogger(Orchestrate.class.getName());

    public static void main(String[] args)
    {
        OrchestrateThread oThread = new OrchestrateThread();
        oThread.start();
    }
}