package com.wanglibao.usedcar.carassess.modle;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by lugg on 2016/4/7.
 */
@DatabaseTable(tableName = "Defect")
public class Defect {

    @DatabaseField(generatedId = true)
    public int id;

    /**
     * 评估单号
     */
    @DatabaseField
    public String assessId;

    /**
     * 区域id
     */
    @DatabaseField
    public String positionId;

    /**
     * 缺陷id
     */
    @DatabaseField
    public String defectId;

    /**
     * 可以是漆膜数据,也可以是缺陷类型id
     */
    @DatabaseField
    public String defectValue;

    /**
     * 是否是漆膜数据
     */
    @DatabaseField
    public boolean film;
}
