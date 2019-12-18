package com.zhao.qq.models;

import lombok.Data;

import java.util.Date;

@Data
/**
 * 空间与日志之间的关系
 */
public class QZoneLogShip
{
    /*
    主键id
     */
    private Integer id;
    /*
    空间id
     */
    private Integer qZoneId;
    /*
    日志id
     */
    private Integer logId;
    /*
    创建的时间
     */
    private Date creatTime;
}
