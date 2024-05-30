package main.java.design_patterns.singleton.logger;


import org.springframework.boot.logging.LogLevel;
import java.io.*;
import java.time.LocalDateTime;

public class LoggerSolution implements Logger {

    private static LoggerSolution log;
    private PrintWriter printWriter;
    private String filePath;

    private LoggerSolution() {

    }

    public static LoggerSolution getInstance() {
        if(log == null) {
            log = new LoggerSolution();
        }
        return log;
    }

    public static void resetInstance() {
        log = null;
    }


    @Override
    public void log(LogLevel level, String message) {
        if(printWriter != null) {
            String logMessage = "Date: " + LocalDateTime.now() + "Log level: " + level + " Message: " + message;
            printWriter.println(logMessage);
        } else {
            throw new IllegalStateException("error");
        }
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