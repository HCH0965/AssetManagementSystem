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