package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void getLastLog() {
        logger = Logger.INSTANCE;
        String s = "You are logged in";
        logger.log(s);
        Assertions.assertEquals(s, Logger.INSTANCE.getLastLog());
    }
}
