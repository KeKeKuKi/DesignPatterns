package com.zzz.designPatterns.builder;

import lombok.Data;

/**
 *  产品
 *
 * @author ZhaoZezhong
 * date 2021/7/2817:09
 */
@Data
public class Product {

    private String modelA;

    private String modelB;

    private String modelC;

    private String modelD;
    public Product(){
    }

    public Product(Builder builder){
        this.modelA = builder.getModelA();
        this.modelB = builder.getModelB();
        this.modelC = builder.getModelC();
        this.modelD = builder.getModelD();
    }

    @Data
    public static class Builder{
        private String modelA;

        private String modelB;

        private String modelC;

        private String modelD;

        public Builder buildA(String A){
            this.modelA = A;
            return this;
        }
        public Builder buildB(String B){
            this.modelB = B;
            return this;
        }
        public Builder buildC(String C){
            this.modelC = C;
            return this;
        }
        public Builder buildD(String D){
            this.modelD = D;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "modelA='" + modelA + '\'' +
                ", modelB='" + modelB + '\'' +
                ", modelC='" + modelC + '\'' +
                ", modelD='" + modelD + '\'' +
                '}';
    }
}
