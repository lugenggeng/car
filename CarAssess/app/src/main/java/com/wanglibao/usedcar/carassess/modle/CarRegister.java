package com.wanglibao.usedcar.carassess.modle;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by lugg on 2016/4/6.
 */
@DatabaseTable(tableName = "CarRegister")
public class CarRegister {

    /**
     * CarAssess表中对应的主键Id
     */
    @DatabaseField(id = true)
    public String assessId;

    /**
     * 车主姓名
     */
    @DatabaseField
    public String ownerName;

    /**
     * 身份证号码
     */
    @DatabaseField
    public String IDCard;

    /**
     * 身份证到期日
     */
    @DatabaseField
    public String IDExpiration;

    /**
     * 车牌号
     */
    @DatabaseField
    public String numberPlate;

    /**
     * 车辆类型
     */
    @DatabaseField
    public String carType;

    /**
     * 车辆所有人
     */
    @DatabaseField
    public String carHolder;

    /**
     * 使用性质
     */
    @DatabaseField
    public String useNature;

    /**
     * 品牌
     */
    @DatabaseField
    public String brand;

    /**
     * 车辆识别代号
     */
    @DatabaseField
    public String vin;

    /**
     * 发动机号
     */
    @DatabaseField
    public String engineNumber;

    /**
     * 注册时间 (车辆登记证)
     */
    @DatabaseField
    public Date registerDate;

    /**
     * 发证日期 (车辆登记证)
     */
    @DatabaseField
    public Date issuingDate;

    /**
     * 核定载客量
     */
    @DatabaseField
    public int approvedPassengersCapacity;

    /**
     * 年检有效期
     */
    @DatabaseField
    public Date annualInspectionValidity;

    /**
     * 出厂日期
     */
    @DatabaseField
    public Date dateOfProduction;

    /**
     * 颜色
     */
    @DatabaseField
    public String color;

    /**
     * 产地
     */
    @DatabaseField
    public String productionAddress;

    /**
     * 燃料种类
     */
    @DatabaseField
    public String fuelType;

    /**
     * 驱动
     */
    @DatabaseField
    public String drive;

    /**
     * 车辆获取方式
     */
    @DatabaseField
    public String carSource;

    /**
     * 汽车排量
     */
    @DatabaseField
    public String capacity;

    /**
     * 过户次数
     */
    @DatabaseField
    public String transferTimes;

    /**
     * 排放标准
     */
    @DatabaseField
    public String emissionStandard;

}
