package com.zhao.qq.models;

import lombok.Data;

@Data
public class QqMember
{
    /*
    主键id
     */
    private Integer id;
    /*
    qq图像
     */
    private String imgUrl;
    /*
    qq账号
     */
    private String qqNumber;
    /*
    qq昵称
    */
    private String qqName;
    /*
    qq密码
     */
    private String qqPwd;
    /*
    性别
     */
    private String sex;
}
