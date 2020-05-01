package com.brazil.cerp.code;

import lombok.Getter;

/**
 * 공통 코드
 */
@Getter
public enum CommonCode {

    DEL_Y("Y", "Y", "유"),
    DEL_N("N", "N", "무");

    private String code;
    private String name;
    private String description;

    CommonCode(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

}
