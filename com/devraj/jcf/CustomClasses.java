package com.devraj.jcf;

class Data {
    private Integer num;
    private String name;
    Data(Integer num, String name) {
        this.num = num;
        this.name = name;
    }
    public void setName(Integer num) {
        this.num = num;
    }
    public void setNum(String name) {
        this.name = name;
    }
    public Integer getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
}

public class CustomClasses {
    public static void main(String[] args) {
        Data dataObj1 = new Data(7, "Sahil");
        Data dataObj2 = new Data(007, "Devraj");
        System.out.println(dataObj1.getNum());
        System.out.println(dataObj2.getName());
    }
}
