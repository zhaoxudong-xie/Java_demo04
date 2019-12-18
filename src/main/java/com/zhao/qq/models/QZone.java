package com.zhao.qq.models;

import lombok.Data;

import java.util.List;

@Data
/**
 * qq空间操作类
 */
public class QZone
{
    /*
    主键id
     */
    private Integer id;
    /*
    空间名称
     */
    private String zoneName;
    /*
    空间背景图
     */
    private String backGroundPicture;
    /*
    qq秀
     */
    private String qqShow;
    /*
    空间日志
     */
    private List<QZoneLog> list;
}
