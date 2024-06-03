package com.mainweb.DTO;
/**
 * 저자: 한승헌
 * 기능: 품종 분류 정보를 저장하는 DTO
 *      인공 지능 서버에서 전달받은 JSON 객체를 파싱하여 저장
 *
 * description
 * name : 품종명
 * value : 섞인 비율
 * */
public class classificationData {
    private String name;
    private int value;

    public classificationData(String name, int value){
        this.name = name;
        this. value = value;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}