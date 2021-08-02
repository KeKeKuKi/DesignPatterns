package com.zzz.designPatterns.decorate;

import lombok.Data;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 14:01
 */
@Data
public abstract class Decorate {
    Decorate drink;

    abstract Integer cost();

    abstract String name();
}
