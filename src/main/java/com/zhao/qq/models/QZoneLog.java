package com.zhao.qq.models;

import lombok.Data;

import java.util.Date;

@Data
/**
 * qq日志操作类
 */
public class QZoneLog
{
    /*
    主键id
     */
    private Integer id;
    /*
    日志名称
     */
    private String logName;
    /*
    日志内容
     */
    private String logContent;
    /*
    日志创建时间
     */
    private Date creatDate;
}
