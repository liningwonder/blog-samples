package io.github.liningwonder.assembly.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("REQUEST_ID", UUID.randomUUID().toString());
        LOG.info("start programme");
        if (LOG.isDebugEnabled()) {
            LOG.debug("debug test");
        }
        TargetClassLog.getLogger().info("Hello world");
    }

}
