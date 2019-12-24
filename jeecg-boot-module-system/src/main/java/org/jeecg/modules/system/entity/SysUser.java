package org.jeecg.modules.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecg.common.aspect.annotation.Dict;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 用户表
 * @Author: gaoliang
 * @Date: 2019-12-23
 * @Version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(type = IdType.ID_WORKER_STR)
    private String id;

    /**
     * 登录账号
     */
    @Excel(name = "登录账号", width = 15)
    private String username;

    /**
     * 真实姓名
     */
    @Excel(name = "真实姓名", width = 15)
    private String realname;

    /**
     * 密码
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    /**
     * md5密码盐
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String salt;

    /**
     * 头像
     */
    @Excel(name = "头像", width = 15)
    private String avatar;

    /**
     * 生日
     */
    @Excel(name = "生日", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 性别(0-默认未知,1-男,2-女)
     */
    @Excel(name = "性别", width = 15, dicCode = "sex")
    @Dict(dicCode = "sex")
    private Integer sex;

    /**
     * 电子邮件
     */
    @Excel(name = "电子邮件", width = 15)
    private String email;

    /**
     * 电话
     */
    @Excel(name = "电话", width = 15)
    private String phone;

    /**
     * 部门code
     */
    private String orgCode;

    /**
     * 状态(1-正常,2-冻结)
     */
    @Excel(name = "状态", width = 15, dicCode = "user_status")
    @Dict(dicCode = "user_status")
    private Integer status;

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @Excel(name = "删除状态", width = 15, dicCode = "del_flag")
    @TableLogic
    private String delFlag;

    /**
     * 工号，唯一键
     */
    @Excel(name = "工号", width = 15)
    private String workNo;

    /**
     * 职务，关联职务表
     */
    @Excel(name = "职务", width = 15)
    private String post;

    /**
     * 座机号
     */
    @Excel(name = "座机号", width = 15)
    private String telephone;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 同步工作流引擎(1-同步,0-不同步)
     */
    private String activitiSync;

    /**
     * 身份证号
     */
    @Excel(name = "身份证号", width = 15)
    private String idCard;

    /**
     * 婚姻状态
     */
    @Excel(name = "婚姻状态", width = 15)
    private String marriageStatus;

    /**
     * 民族
     */
    @Excel(name = "民族", width = 15)
    private String nationality;

    /**
     * 籍贯
     */
    @Excel(name = "籍贯", width = 15)
    private String nativePlace;

    /**
     * 政治面貌
     */
    @Excel(name = "政治面貌", width = 15)
    private String politicsStatus;

    /**
     * 联系地址
     */
    @Excel(name = "联系地址", width = 15)
    private String contactAddress;

    /**
     * 职称
     */
    @Excel(name = "职称", width = 15)
    private String professionalTitle;

    /**
     * 最高学历
     */
    @Excel(name = "最高学历", width = 15)
    private String educationBackground;

    /**
     * 毕业院校
     */
    @Excel(name = "毕业院校", width = 15)
    private String graduateInstitution;

    /**
     * 专业
     */
    @Excel(name = "专业", width = 15)
    private String major;

    /**
     * 入职时间
     */
    @Excel(name = "入职时间", width = 20, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;

    /**
     * 离职时间
     */
    @Excel(name = "离职时间", width = 20, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date resignationDate;

    /**
     * 转正时间
     */
    @Excel(name = "转正时间", width = 20, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date conversionDate;

    /**
     * 在职状态
     */
    @Excel(name = "在职状态", width = 15)
    private Integer workingState;

    /**
     * 聘用形式
     */
    @Excel(name = "聘用形式", width = 15)
    private String hireForm;

    /**
     * 合同起始日期
     */
    @Excel(name = "合同起始日期", width = 20, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date contractBeginDate;

    /**
     * 合同终止日期
     */
    @Excel(name = "合同终止日期", width = 20, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date contractEndDate;

    /**
     * 合同期限
     */
    @Excel(name = "合同期限", width = 15)
    private Integer contractPeriod;

    /**
     * 工龄
     */
    @Excel(name = "工龄", width = 15)
    private Integer workingAge;
}
