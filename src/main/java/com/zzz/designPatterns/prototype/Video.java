package com.zzz.designPatterns.prototype;

import lombok.Data;

import java.util.Date;

/**
 * @author ZhaoZezhong
 * date 2021/7/28 18:35
 */
@Data
public class Video implements Cloneable {
    String name;

    Date createdDate;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Video v = (Video) super.clone();
        v.createdDate = (Date) this.createdDate.clone();
        return v;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
