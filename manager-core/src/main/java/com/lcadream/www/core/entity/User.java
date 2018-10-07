package com.lcadream.www.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`ma_user`")
public class User {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户头像
     */
    @Column(name = "`avatar`")
    private String avatar;

    /**
     * 用户登录名
     */
    @Column(name = "`user_name`")
    private String userName;

    /**
     * 登录密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * md5加盐--随机
     */
    @Column(name = "`salt`")
    private String salt;

    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 生日
     */
    @Column(name = "`birthday`")
    private Date birthday;

    /**
     * 性别(1:男，2:女)
     */
    @Column(name = "`sex`")
    private Integer sex;

    /**
     * 邮箱
     */
    @Column(name = "`email`")
    private String email;

    /**
     * 手机号码
     */
    @Column(name = "`phone`")
    private String phone;

    /**
     * 角色id
     */
    @Column(name = "`role_id`")
    private Integer roleId;

    /**
     * 部门id
     */
    @Column(name = "`dept_id`")
    private Integer deptId;

    /**
     * 状态（0：无效==删除，1启用，2，冻结）
     */
    @Column(name = "`record_status`")
    private Integer recordStatus;

    /**
     * 创建时间
     */
    @Column(name = "`create_date`")
    private Date createDate;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户头像
     *
     * @return avatar - 用户头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置用户头像
     *
     * @param avatar 用户头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取用户登录名
     *
     * @return user_name - 用户登录名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户登录名
     *
     * @param userName 用户登录名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取登录密码
     *
     * @return password - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取md5加盐--随机
     *
     * @return salt - md5加盐--随机
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置md5加盐--随机
     *
     * @param salt md5加盐--随机
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取性别(1:男，2:女)
     *
     * @return sex - 性别(1:男，2:女)
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别(1:男，2:女)
     *
     * @param sex 性别(1:男，2:女)
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取部门id
     *
     * @return dept_id - 部门id
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置部门id
     *
     * @param deptId 部门id
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取状态（0：无效==删除，1启用，2，冻结）
     *
     * @return record_status - 状态（0：无效==删除，1启用，2，冻结）
     */
    public Integer getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置状态（0：无效==删除，1启用，2，冻结）
     *
     * @param recordStatus 状态（0：无效==删除，1启用，2，冻结）
     */
    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}