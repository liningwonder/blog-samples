package io.github.liningwonder.assembly.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TargetClassLog {

    private static final Logger logger = LoggerFactory.getLogger(TargetClassLog.class);

    public static Logger getLogger() {
        return logger;
    }
}
