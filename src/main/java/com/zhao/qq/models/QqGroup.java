package com.zhao.qq.models;

import lombok.Data;

import java.util.Date;

@Data
/**
 * 分组类
 */
public class QqGroup
{
    /*
    主键id
     */
    private Integer id;
    /*
    分组名称
     */
    private String groupName;
    /*
    创建分组时间
     */
    private Date creatGroup;
}
