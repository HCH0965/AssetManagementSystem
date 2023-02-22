package com.hch.common.enums;

public enum MyEnum {
    /**
     * 资产状态
     */
    ASSET_STATE_VACANT(0,"未使用"),
    ASSET_STATE_USE(1,"使用中"),
    ASSET_STATE_SCRAP(2,"报废"),
    ASSET_STATE_NULL(3,"空值"),

    /**
     * 资产数量
     */
    ASSE_NUMBER_NONE(0, "0"),

    /**
     * 申请状态
     */
    APPLY_STATUS_ING(0, "已申请"),
    APPLY_STATUS_PASS(1, "已通过"),
    APPLY_STATUS_DONE(2, "已购买"),
    APPLY_STATUS_NOTPASS(3, "未通过审核"),

    /**
     * 用户权限
     */
    USER_AUTHORITY_APPLY(0, "可申请"),
    USER_AUTHORITY_APPROVE(1, "可审核"),
    USER_AUTHORITY_NONE(2, "无权限"),

    /**
     * 用户角色
     */
    USER_ROLE_USER(0, "用户"),
    USER_ROLE_MANAGER(1, "管理员"),

    USER_ROLE_NONE(2, "无权限用户"),

    /**
     * 审核是否通过
     */
    APPROVE_PASS_YES(0, "通过"),
    APPROVE_PASS_NO(1, "不通过"),

    /**
     * 错误标识
     */
    ERROR(100500,"错误标识");

    private Integer code;
    private String message;
    MyEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
    public Integer getCode() {
        return this.code;
    }
    public String getMessage() {
        return this.message;
    }

    /**
     * 根据code获取枚举对象
     * @param code 枚举编码
     * @return 枚举对象
     */
    public static MyEnum getApiMethodEnumByCode(Integer code){
        for(MyEnum e:MyEnum.values()){
            if(e.getCode().equals(code)){
                if("GET".equals(e.getMessage()) || "POST".equals(e.getMessage())){
                    return e;
                }
            }
        }
        return ERROR;
    }
}