package utils;

import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;


public final class LogUtils {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(LogUtils.class);

    public LogUtils() {
    }

    public static void initialize() {
        try (InputStream is = LogUtils.class
                .getClassLoader().getResourceAsStream("logging.properties")) {
            LogManager.getLogManager().readConfiguration(is);
        } catch (IOException e) {
            LOG.warn("Unable to load logging.properties", e);
        }
    }

    public static String exceptionStacktraceAsString(Exception excep) {
        StackTraceElement[] stack = excep.getStackTrace();
        String ex = "";
        for (StackTraceElement s : stack) {
            ex = ex + s.toString() + "\n\t\t";
        }
        return("Exception stacktrace: " +  ex);
    }

}
