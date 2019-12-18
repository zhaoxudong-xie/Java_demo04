package com.zhao.qq.dal;

import com.zhao.qq.models.QqMember;
import com.zhao.qq.sqlhelper.SqlHelper;

import java.sql.ResultSet;

public class QqMemberService
{
   public static Integer addQq(QqMember qqMember)
   {
       String sql="INSERT INTO t_qqMember(img_url,qq_member,qq_name,qq_pwd,sex)"+"VALUES('"+qqMember.getImgUrl()+"','"+qqMember.getQqNumber()+"','" +
               qqMember.getQqName()+"','"+qqMember.getQqPwd()+"','"+qqMember.getSex()+"')";
       Integer result=SqlHelper.update(sql);
       return result;
   }
   public static Integer deleteQqByQqNum(String qqNum)
   {
       String sql="DELETE FROM t_qqMemeber WHERE qq_member="+qqNum+"";
       Integer deleteResult=SqlHelper.update(sql);
       return deleteResult;
   }
   public static Integer modifyQq(QqMember qqMember)
   {
       String sql="UPDATE t_qqMember SET img_url="+qqMember.getImgUrl()+",qq_name="+qqMember.getQqName()+",qq_pwd="+qqMember.getQqPwd()+",sex="+qqMember.getSex()+"" +
               " WHERE qq_member="+qqMember.getQqNumber()+"";
       Integer modifyResult=SqlHelper.update(sql);
       return modifyResult;
   }

    public static void main(String[] args)
    {
        QqMember qqMember=new QqMember();
        qqMember.setImgUrl("Csadasd213");
        qqMember.setQqName("风继续吹");
        qqMember.setQqNumber("15565456");
        qqMember.setQqPwd("wwwwwwww");
        qqMember.setSex("男");
        Integer result=modifyQq(qqMember);
        if(result!=null)
        {
            System.out.println("成功！");
        }else
        {
            System.out.println("失败!");
        }
    }
}
