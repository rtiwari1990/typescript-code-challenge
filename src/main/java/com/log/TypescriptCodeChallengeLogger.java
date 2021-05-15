package com.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TypescriptCodeChallengeLogger {

    private static Logger logger = null;
    private static TypescriptCodeChallengeLogger tCCLogger = null;

    private static FileHandler fh = null;

    private TypescriptCodeChallengeLogger(String className){
        logger = Logger.getLogger(className);
    }

    public static TypescriptCodeChallengeLogger getLogger(String className) {
        if(tCCLogger == null)
        {
            tCCLogger = new TypescriptCodeChallengeLogger(className);

            try
            {
                fh = new FileHandler("./typescriptCodeChallenge.log");
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);
            }
            catch (IOException ex)
            {
                tCCLogger.error("getLogger: exception in creating file handler");
            }
        }

        return tCCLogger;
    }

    public void info(String message){
        logger.log(Level.INFO, message);
    }

    public void warning(String message){
        logger.log(Level.WARNING, message);
    }

    public void error(String message){
        logger.log(Level.SEVERE, message);
    }
}
