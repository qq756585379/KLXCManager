package com.klxc.enums;

import lombok.Getter;

@Getter
public enum RoleEnum {

    CUSTOMER_USER(0, "普通用户"),

    AREA_MANAGER(1, "区域负责人"),

    ADMIN_MANAGER(2, "后台管理员");

    private Integer code;

    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

