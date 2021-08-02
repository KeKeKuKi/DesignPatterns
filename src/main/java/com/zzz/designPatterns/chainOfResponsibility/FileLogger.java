package com.zzz.designPatterns.chainOfResponsibility;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 18:30
 */

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}

