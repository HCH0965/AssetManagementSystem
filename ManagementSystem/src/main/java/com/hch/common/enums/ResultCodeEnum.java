package com.hch.common.enums;

import com.hch.common.R;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("AlibabaEnumConstantsMustHaveComment")
public enum ResultCodeEnum {

    SUCCESS(100200, "返回成功"),
    SYSTEM_EXCEPTION(100500, "系统异常"),
    REQUEST_PARAM_ERROR(100401,"请求参数错误"),
    REQUEST_OUT_OVERTIME(100408,"请求超时"),
    REQUEST_NOT_FOUND(100404,"请求的资源或服务未找到"),
    REQUEST_LENGTH_LIMIT(100414,"请求URI太长"),
    REQUEST_Format_NOT_SUPPORTED(100415,"请求的格式不支持"),
    TOKEN_EXPIRED_REDIRECT(100302,"token过期,请重新登录"),

    INTERFACE_BASIC_INFORMATION_NULL(100001, "接口基本信息为空"),
    INTERFACE_NAME_NULL(100002, "接口名称为空"),
    INTERFACE_SOURCE_NULL(100005, "接口来源为空"),
    INTERFACE_PROTOCOL_NULL(100003, "接口协议为空"),
    INTERFACE_NOT_ENABLED(100123, "接口未启用"),
    INTERFACE_IP_PORT_NULL(100012, "ip和端口为空"),
    INTERFACE_PATH_NULL(100004, "接口路径为空"),
    INTERFACE_REQUEST_METHOD_NULL(100008, "接口请求方式"),
    REQUEST_TIMEOUT(100014, "超时时限为空"),
    REQUEST_PARAM_NULL(100012, "请求参数为空"),
    INTERFACE_BASE_NOT_FOUND(100013, "未找到该条接口基本信息"),
    INTERFACE_SETTING_NOT_FOUND(100015, "未找到该条接口配置信息"),
    INTERFACE_BASE_EXIST(100026, "接口基本信息已存在"),
    INTERFACE_BASE_NOT_EXIST(100025, "接口基本信息不存在"),
    INTERFACE_SETTING_EXIST(100027, "接口配置信息已存在"),
    INTERFACE_SETTING_NOT_EXIST(100028, "接口配置信息不存在"),
    INTERFACE_PATH_ILLEGAL(100009, "接口路径不符合规范"),
    REQUIRED_FIELD_IS_BLANK(100007, "入参必填字段为空： "),
    REQUEST_OUT_API_FAIL(100018, "请求外部接口失败，返回状态码："),
    REQUEST_OUT_GET_OVERTIME(100019, "GET请求外部接口失败，请求超时"),
    REQUEST_OUT_POST_OVERTIME(100020, "POST请求外部接口失败，请求超时"),
    REQUEST_OUT_PUT_OVERTIME(100021, "PUT请求外部接口失败，请求超时"),
    REQUEST_OUT_DELETE_OVERTIME(100022, "DELETE请求外部接口失败，请求超时"),
    OTHER_METHODS_NOT_SUPPORTED(100023, "现阶段不支持其他请求方式"),
    PARAM_BODY_CONTENT_ERROR(100024, "请求body不是json格式"),
    SPLICING_PARAM_IS_FAIL(100031, "拼接GET请求入参出错，请检查参数"),

    CODE_NAME_EXIST(110001,"码表名已存在"),
    CODE_CONFIG_NAME_EXIST(110002,"码值名已存在"),
    CODE_RELEASE_PARAM_ERROR(110003,"发布参数有误"),
    CODE_DISABLE_PARAM_ERROR(110004,"停用参数有误"),
    CODE_DATACHECK_FAILED(110005, "数据校验失败"),
    CODE_CODECHECK_FAILED(110006, "请选择正确的码表"),
    CODE_STATE_UPDATE_ERROR(110007,"未知操作"),
    CODE_DELETE_FALSE(110008,"该状态不能删除"),
    CODE_SEARCH_FALSE(110009,"暂无数据"),
    CODE_UPDATE_NULL(110010,"未知码表编号！"),
    CODE_GET_EXCEL_FALSE(100066,"导出Excel失败"),
    CODE_READ_EXCEL_FALSE(100067,"导入Excel失败"),
    CODE_READ_EXCEL_NAME(100068,"码表名称不符合规则"),
    CODE_READ_EXCEL_NAME_REPEAT(100069,"码表名称重复"),
    STANDARD_CODE_FALSE(100070,"请传入正确的数据"),
    CODE_CONFIG_VALUE_EXIST(110011,"码值已存在"),
    /**
     * 数据源管理
     */

    DATA_SOURCE_ID_ERROR(110011,"id不合法！"),
    DATA_SOURCE_NOT_EXIST(110012,"该数据源不存在！"),
    DATA_SOURCE_DELETE_ALREADY_DELETED(110013,"该数据源已经删除！"),
    DATA_SOURCE_CONNECT_TEST_DRIVER_FAILED(110014,"加载驱动失败！"),
    DATA_SOURCE_CONNECT_TEST_FAILED(110015,"连接数据库失败！"),
    DATA_SOURCE_CHECK_FAILED(110016,"数据源校验失败！"),
    DATA_SOURCE_NAME_CHECK_FAILED(110017,"数据源名称重复！"),
    DATA_SOURCE_URL_CHECK_FAILED(110018,"连接信息重复！"),
    DATA_SOURCE_STATE_CHECK_FAILED(110019,"数据源状态错误！"),
    DATA_SOURCE_STATE_CHOOSE_FAILED(110020,"数据源状态选择错误！"),
    DATA_SOURCE_CONNECT_TEST_SUCCESS(110021,"连接数据库成功！"),
    DATA_SOURCE_UPDATE_CHECK_FAILED(110022,"数据源无法编辑！"),
    DATA_SOURCE_DELETE_STATE_ERROR(110023,"数据源无法编辑！"),
    DATA_SOURCE_NAME_URL_CHECK_FAILED(110014,"数据源重复！"),

    /**
     * 脚本管理
     */
    SCRIPT_NAME_EXIST(110024,"脚本名重复！"),
    SCRIPT_UNKNOWN_TYPE(110025,"未知脚本文件类型！"),
    SCRIPT_PARAMETER_EXIST(110026,"参数名重复！"),
    SCRIPT_REQUIRE_NULL(110027,"输入参数是否必填不能为空"),
    SCRIPT_REQUIRE_NOTNULL(110028,"输出参数是否必填应为空！"),
    SCRIPT_CATEGORY_NOT_EXIST(110029,"分类不存在"),
    SCRIPT_NOT_FIND(110030,"未找到脚本！"),
    SCRIPT_ADD_FAILED(110031,"新增失败！"),
    SCRIPT_UPDATE_FAILED(110032,"修改失败！"),
    SCRIPT_UPLOAD_FAILED(110033,"文件上传失败！"),
    SCRIPT_FILE_NULL(110034,"脚本文件为空！"),
    SCRIPT_ADD_SUCCESS(110035,"新增成功！"),
    SCRIPT_UPDATE_SUCCESS(110036,"修改成功！"),
    SCRIPT_CLASS_NULL(110037,"执行类为空"),
    SCRIPT_FUNCTION_NULL(110038,"执行类为空"),
    ;

    /**
     * 枚举值
     */
    private final Integer code;

    /**
     * 枚举描述
     */
    private final String message;

    /**
     * 构造一个<code>LocalCacheEnum</code>枚举对象
     *
     * @param code 枚举值
     * @param message 枚举描述
     */
    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public <T> R<T> result(){
        return new R(getCode(),getMessage());
    }
    public <T>  R<T> result(String message){
        return new R(getCode(),message);
    }
    /**将返回码标准的信息 填充到message里面，message必须包含一个%s*/
    public <T>  R<T> resultFillingMessage(String message){
        return new R(getCode(),String.format(message,getMessage()));
    }


    /**将message添加到返回码标准的信息后面 再返回{@link R}*/
    public <T> R<T> resultAppendMessage(String message){
        return new R(getCode(),getMessage()+message);
    }



    /**
     * 获取全部枚举
     *
     * @return List<LocalCacheEnum>
     */
    public static List<ResultCodeEnum> getAllEnum() {
        List<ResultCodeEnum> list = new ArrayList<>();
        for (ResultCodeEnum each : values()) {
            list.add(each);
        }
        return list;
    }

    /**
     * 获取全部枚举值
     *
     * @return List<String>
     */
    public static List<Integer> getAllEnumCode() {
        List<Integer> list = new ArrayList<>();
        for (ResultCodeEnum each : values()) {
            list.add(each.code);
        }
        return list;
    }
}