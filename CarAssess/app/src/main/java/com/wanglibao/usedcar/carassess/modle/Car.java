package com.wanglibao.usedcar.carassess.modle;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Date;

/**
 * Created by lugg on 2016/4/6.
 * 主表,点击新增时增加一条记录
 *
 */
@DatabaseTable(tableName = "Car")
public class Car {

    /**
     * 评估单号  为id
     */
    @DatabaseField(id = true)
    public String assessId;

    /**
     * 评估日期
     */
    @DatabaseField
    public Date createDate;

    /**
     * 评估人员姓名
     */
    @DatabaseField
    public String userName;

    /**
     * 最后一次修改的时间
     */
    @DatabaseField
    public Date lastUpdateTime;

}
