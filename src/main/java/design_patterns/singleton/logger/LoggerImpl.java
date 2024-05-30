package main.java.design_patterns.singleton.logger;


import org.springframework.boot.logging.LogLevel;
import java.io.*;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger {

    private static LoggerImpl log;
    private PrintWriter printWriter;
    private String filePath;

    private LoggerImpl() {

    }

    public static LoggerImpl getInstance() {
        if(log == null) {
            synchronized(LoggerImpl.class) {
                if(log == null) log = new LoggerImpl();
            }
        }
        return log;
    }

    public static void resetInstance() {
        log = null;
    }

    @Override
    public void log(LogLevel level, String message) {
        if(this.printWriter == null) {
            throw new IllegalStateException("Logger is not initialized in setLogFile()");

        }
        String logMessage = "DateTime:" + LocalDateTime.now() + "LogLevel: " + level + " Message: " + message;
        printWriter.println(logMessage);

    }

    @Override
    public void setLogFile(String filePath) {
        try {
            this.filePath = filePath;
            this.printWriter = new PrintWriter(new FileWriter(this.filePath, true));
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Invalid file path.");
        }
    }

    @Override
    public String getLogFile() {
        return filePath;
    }

    @Override
    public void flush() {
        if(printWriter != null) printWriter.flush();
    }

    @Override
    public void close() {
        if(printWriter != null) {
            printWriter.close();
            printWriter = null;
        }
    }
}
