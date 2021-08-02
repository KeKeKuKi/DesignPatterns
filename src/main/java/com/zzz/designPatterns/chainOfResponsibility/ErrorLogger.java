package com.zzz.designPatterns.chainOfResponsibility;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 18:30
 */

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}

