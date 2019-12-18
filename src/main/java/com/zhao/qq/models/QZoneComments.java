package com.zhao.qq.models;

import lombok.Data;

import java.util.Date;

@Data
/**
 * 空间评论类
 */
public class QZoneComments
{
    /*
    主键id
     */
    private Integer id;
    /*
    评论内容
     */
    private String content;
    /*
    评论者的id
     */
    private Integer writerId;
    /*
    给谁评论的id
     */
    private Integer receivedId;
    /*
    评论的时间
     */
    private Date createComments;
}
