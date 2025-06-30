package com.hansung.likelion.global.response.code;

import com.hansung.likelion.global.response.BaseResponceCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.hansung.likelion.global.constant.StaticValue.CREATED;
import static com.hansung.likelion.global.constant.StaticValue.OK;

// 공통 성공 응답 코드
@Getter
@AllArgsConstructor
public enum SuccessResponseCode implements BaseResponceCode {
    SUCCESS_OK("SUCCESS_200",OK,"호출에 성공하였습니다."),
    SUCCESS_CREATED("SUCCESS_201",CREATED,"호출에 성공하였습니다.");

    private final String code;
    private final int httpStatus;
    private final String message;
}
