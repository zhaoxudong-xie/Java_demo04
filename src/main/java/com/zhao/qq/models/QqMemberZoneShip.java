package com.zhao.qq.models;

import lombok.Data;

@Data
/**
 * 空间与qq的关系
 */
public class QqMemberZoneShip
{
    /*
    主键id
     */
    private Integer id;
    /*
    qq号id
     */
    private Integer qqMemberId;
    /*
    qq空间id
     */
    private Integer qZoneId;
}
