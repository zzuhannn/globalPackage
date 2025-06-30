package com.hansung.likelion.global.response;

//공통 응답 코드 인터페이스
public interface BaseResponceCode {
    String getCode();
    int getHttpStatus();
    String getMessage();

}
