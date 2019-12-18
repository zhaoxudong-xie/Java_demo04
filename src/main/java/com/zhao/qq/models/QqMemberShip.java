package com.zhao.qq.models;

import lombok.Data;

@Data
/**
 * qq关系类
 */
public class QqMemberShip
{
    /*
    主键id
     */
    private Integer id;
    /*
    自己的qq号id
     */
    private Integer QqMemberId;
    /*
    朋友qq号id
     */
    private Integer friendId;
    /*
    分组id
     */
    private Integer groupId;
    /*
    状态（1 正常 2 特别关注 0 删除 3 拉黑）
     */
    private Short status;
}
