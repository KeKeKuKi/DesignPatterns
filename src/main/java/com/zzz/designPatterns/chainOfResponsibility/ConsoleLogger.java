package com.zzz.designPatterns.chainOfResponsibility;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 18:29
 */

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}

