package com.hch.common.enums;

public enum MyEnum {
    /**
     * 接口协议
     */
    API_PROTOCOL_HTTP(0,"HTTP"),
    API_PROTOCOL_HTTPS(1,"HTTPS"),
    /**
     * 请求方式
     */
    API_METHOD_GET(0,"GET"),
    API_METHOD_POST(1,"POST"),
    /**
     * 接口状态
     */
    API_STATE_DRAFT(1,"草稿"),
    API_STATE_UNPUBLISH(2,"未发布"),
    API_STATE_PUBLISH(3,"已发布"),
    API_STATE_TERMINATED(4,"已停用"),
    /**
     * 接口逻辑删
     */
    API_DELETED(0,"未删除"),
    API_UNDELETED(1,"删除"),
    /**
     * 参数类型
     */
    PARAMETER_TYPE_STRING(0,"String"),
    PARAMETER_TYPE_INTEGER(1,"Integer"),
    PARAMETER_TYPE_FLOAT(2,"Float"),
    PARAMETER_TYPE_OBJECT(3,"Object"),
    PARAMETER_TYPE_ARRAY(4,"array"),

    /**
     * 数据标准管理状态
     */
    STANDARD_TYPE_INT(0,"int"),
    STANDARD_TYPE_ENUM(1,"enum"),
    STANDARD_TYPE_FLOAT(2,"float"),
    STANDARD_TYPE_STRING(3,"String"),
    /**
     * 参数是否必填
     */
    PARAMETER_UNREQUIRE(0,"非必填"),
    PARAMETER_REQUIRE(1,"必填"),
    /**
     * 参数位置
     */
    PARAMETER_POSITION_QUERY(0,"query"),
    PARAMETER_POSITION_HEADER(1,"header"),
    PARAMETER_POSITION_REQUEST(2,"body"),
    PARAMETER_POSITION_Response(3,"response"),

    /**
     * 分类分组
     */
    CATEGORY_SCHEMA_API(0,"接口分类"),
    CATEGORY_SCHEMA_ASSET(1,"数据资产目录分类"),
    CATEGORY_SCHEMA_SCRIPT(2,"脚本分类"),

    /**
     * 码表状态
     */
    CODE_STATE_UNPUBLISHED(0,"未发布"),
    CODE_STATE_PUBLISHED(1,"已发布"),
    CODE_STATE_TERMINATED(2,"已停用"),

    /**
     * 校验操作标识
     */
    CODE_CHECK_ADD(0,"新增"),
    CODE_CHECK_UPDATE(1,"修改"),

    /**
     * 批量操作标识
     */
    OPERATION_BATCH_TERMINATED(0,"批量停用"),
    OPERATION_BATCH_PUBLISH(1,"批量发布"),

    /**
     * 数据标准状态
     */
    STANDARD_STATE_UNPUBLISHED(0,"未发布"),
    STANDARD_STATE_PUBLISHED(1,"已发布"),
    STANDARD_STATE_TERMINATED(2,"已停用"),

    /**
     * 脚本状态
     */
    SCRIPT_STATE_UNPUBLISHED(0,"未发布"),
    SCRIPT_STATE_PUBLISHED(1,"已发布"),
    SCRIPT_STATE_TERMINATED(2,"已停用"),

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