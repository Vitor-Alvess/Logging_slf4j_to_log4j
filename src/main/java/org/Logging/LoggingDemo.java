package org.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        logger.warn("Hello World!");
        logger.error("Hello World!");
        logger.info("Hello World!");
        logger.error("Hello World!");
        logger.info("Hello World!");
        logger.info("Hello World!");
        logger.debug("Hello World!");
    }
}