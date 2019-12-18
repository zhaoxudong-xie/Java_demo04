package com.zhao.qq.models;

import lombok.Data;

@Data
/**
 * 空间评论与日志的关系
 */
public class QZoneLogCommentShip
{
    /*
    主键id
     */
    private Integer id;
    /*
    日志id
     */
    private Integer logId;
    /*
    评论id
     */
    private Integer commentsId;
    /*
    创建时间
     */
    private Integer creatTime;
}
