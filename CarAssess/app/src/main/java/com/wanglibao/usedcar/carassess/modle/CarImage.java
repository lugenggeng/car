package com.wanglibao.usedcar.carassess.modle;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by lugg on 2016/4/7.
 */
@DatabaseTable(tableName = "CarImage")
public class CarImage {

    @DatabaseField(generatedId = true)
    public int id;

    /**
     * 评估车辆id
     */
    @DatabaseField
    public String assessId;

    /**
     * 图片的路径
     */
    @DatabaseField
    public String imagePath;

    /**
     * 是否必须,true,必须且只能有一张图片;false,可以没有也可以有多张图片
     */
    @DatabaseField
    public boolean must = false;

    /**
     * 图片的标示
     */
    @DatabaseField
    public String flag;

    /**
     * 是否为 遮盖版
     */
    @DatabaseField
    public boolean cover = false;






    //证件照
    public static final String CREDENTIALS_MUST_CHELIANGDENGJIZHENG_1 = "CheLiangDengJiZheng1";
    public static final String CREDENTIALS_MUST_CHELIANGDENGJIZHENG_2 = "CheLiangDengJiZheng2";
    public static final String CREDENTIALS_MUST_CHELIANGDENGJIZHENG_3 = "CheLiangDengJiZheng3";
    public static final String CREDENTIALS_MUST_CHELIANGDENGJIZHENG_4 = "CheLiangDengJiZheng4";
    public static final String CREDENTIALS_MUST_XINGSHIZHENG_ZHENG = "XingShiZheng_Zheng";
    public static final String CREDENTIALS_MUST_XINGSHIZHENG_FAN = "XingShiZheng_Fan";
    public static final String CREDENTIALS_MUST_XINGSHIZHENGFUBEN_ZHENG = "XingShiZhengFuBen_Zheng";
    public static final String CREDENTIALS_MUST_XINGSHIZHENGFUBEN_FAN = "XingShiZhengFuBen_Fan";
    public static final String CREDENTIALS_MUST_SHENFENZHENG_ZHENG = "ShenFenZheng_Zheng";
    public static final String CREDENTIALS_MUST_SHENFENZHENG_FAN = "ShenFenZheng_Fan";
    public static final String CREDENTIALS_MUST_VIN = "vin";

    public static final String CREDENTIALS_CHELIANGFAPIAO = "CheLiangFaPiao";
    public static final String CREDENTIALS_JIAOQIANGXIAN_SHANG = "JiaoQiangXian_Shang";
    public static final String CREDENTIALS_JIAOQIANGXIAN_XIA = "JiaoQiangXian_Xia";
    public static final String CREDENTIALS_SHANGYEXIAN_SHANG = "ShangYeXian_Shang";
    public static final String CREDENTIALS_SHANGYEXIAN_XIA = "ShangYeXian_Xia";
    public static final String CREDENTIALS_GOUZHISHUI_1 = "GouZhiShui_1";
    public static final String CREDENTIALS_GOUZHISHUI_2 = "GouZhiShui_2";

    public static final String[] CREDENTIALS_MUST_ARRAY = new String[]{
            CREDENTIALS_MUST_CHELIANGDENGJIZHENG_1,
            CREDENTIALS_MUST_CHELIANGDENGJIZHENG_2,
            CREDENTIALS_MUST_CHELIANGDENGJIZHENG_3,
            CREDENTIALS_MUST_CHELIANGDENGJIZHENG_4,
            CREDENTIALS_MUST_XINGSHIZHENG_ZHENG,
            CREDENTIALS_MUST_XINGSHIZHENG_FAN,
            CREDENTIALS_MUST_XINGSHIZHENGFUBEN_ZHENG,
            CREDENTIALS_MUST_XINGSHIZHENGFUBEN_FAN,
            CREDENTIALS_MUST_SHENFENZHENG_ZHENG,
            CREDENTIALS_MUST_SHENFENZHENG_FAN,
            CREDENTIALS_MUST_VIN};

    //车辆正前面
    public static final String ZHENGQIAN_MUST_ZHENGMIANZHAOPIAN = "ZhengMianZhaoPian";

    public static final String ZHANGMIANZHAOPIAN_QIANBAOXIANGANG = "QianBaoXianGang";
    public static final String ZHANGQIAN_QIANJIGAI = "QianJiGai";

    public static final String[] ZHENGQIAN_MUST_ARRAY = new String[]{ZHENGQIAN_MUST_ZHENGMIANZHAOPIAN};


    //左前45度
    public static final String ZUOQIAN45_MUST_ZUOQIAN45DU = "ZuoQian45DU";

    public static final String ZUOQIAN45_ZUOQIANYEZIBAN = "ZuoQianYeZiBan";
    public static final String ZUOQIAN45_ZUOAZHU = "ZuoAZhu";

    public static final String[] ZUOQIAN45_MUST_ARRAY = new String[]{ZUOQIAN45_MUST_ZUOQIAN45DU};

    //左侧正面
    public static final String ZUOCEZHENGMIAN_MUST_ZUOCEZHENGMIAN = "ZuoCeZhengMian";

    public static final String ZUOCEZHENGMIAN_ZUOQIANCHEMEN = "ZuoQianCheMen";
    public static final String ZUOCEZHENGMIAN_ZUOBZHU = "ZuoBZhu";
    public static final String ZUOCEZHENGMIAN_ZUOHOUMEN = "ZuoHouMen";
    public static final String ZUOCEZHENGMIAN_CHEDING = "CheDing";
    public static final String ZUOCEZHENGMIAN_ZUOQIANZUOYI = "ZuoQianZuoYi";
    public static final String ZUOCEZHENGMIAN_CHEYAOSHI = "CheYaoShi";
    public static final String ZUOCEZHENGMIAN_CHEYIBIAO = "CheYiBiao";
    public static final String ZUOCEZHENGMIAN_HOUPAIZUOYI = "HouPaiZuoYi";
    public static final String ZUOCEZHENGMIAN_YIBIAOTAINEISHI = "YiBiaoTaiNeiShi";
    public static final String ZUOCEZHENGMIAN_CHENEISHI = "CheNeishi";

    public static final String[] ZUOCEZHENGMIAN_MUST_ARRAY = new String[]{ZUOCEZHENGMIAN_MUST_ZUOCEZHENGMIAN};

    //左后45度
    public static final String ZUOHOU45DU_MUST_ZUOHOU45DU = "ZuoHou45Du";

    public static final String ZUOHOU45DU_ZUOCZHU = "ZuoCZhu";
    public static final String ZUOHOU45DU_ZUOHOUYEZIBAN = "ZuoHouYeZiBan";

    public static final String[] ZUOHOU45DU_MUST_ARRAY = new String[]{ZUOHOU45DU_MUST_ZUOHOU45DU};

    //正后方
    public static final String ZHENGHOUFANG_MUST_ZHENGHOUFANG = "ZhengHouFang";

    public static final String ZHENGHOUFANG_HOUPEIXIANGGAI = "HouBeiXiangGai";
    public static final String ZHENGHOUFANG_HOUBAOXIANGANG = "HouBaoXianGang";
    public static final String ZHENGHOUFANG_HOUBEITAI = "HouBeiTai";

    public static final String[] ZHENGHOUFANG_MUST_ARRAY = new String[]{ZHENGHOUFANG_MUST_ZHENGHOUFANG};

    //右后45度
    public static final String YOUHOU45DU_MUST_YOUHOU45DU = "YouHou45Du";

    public static final String YOUHOU45DU_YOUHOUWEIBAN = "YouHouWeiBan";
    public static final String YOUHOUWEIBAN_YOUCZHU = "YouCZhu";

    public static final String[] YOUHOU45DU_MUST_ARRAY = new String[]{YOUHOU45DU_MUST_YOUHOU45DU};

    //右侧正面
    public static final String YOUCEZHENGMIAN_MUST_YOUCEZHENGMIAN = "YouCeZhengMian";

    public static final String YOUCEZHENGMIAN_YOUHOUMEN = "YouHouMen";
    public static final String YOUCEZHENGMIAN_YOUQIANMEN = "YouQianMen";
    public static final String YOUCEZHENGMIAN_YOUBZHU = "YouBZhu";

    public static final String[] YOUCEZHENGMIAN_MUST_ARRAY = new String[]{YOUCEZHENGMIAN_MUST_YOUCEZHENGMIAN};

    //右前45度
    public static final String YOUQIAN45DU_MUST_YOUQIAN45DU = "YouQian45Du";

    public static final String YOUQIAN45DU_YOUAZHU = "YouAZhu";
    public static final String YOUQIAN45DU_YOUQIANYEZIBAN = "YouQianYeZiBan";

    public static final String[] YOUQIAN45DU_MUST_ARRAY = new String[]{YOUQIAN45DU_MUST_YOUQIAN45DU};

    //其他
    public static final String QITA_FANGHUOQIANG = "FangHuoQiang";
    public static final String QITA_BOLI = "BoLi";
    public static final String QITA_DIPAN = "DiPan";
    public static final String QITA_FADONGJICANG = "FaDongJiCang";
    public static final String QITA_CHEPAIHAO = "ChePaiHao";
    public static final String QITA_JIYOUXIANGGUANJIANCE = "JiYouXiangGuanJianCe";
    public static final String QITA_GONGKUANGXIANGGUANJIANCE = "GongKuangXiangGuanJianCe";

    public static final String[][] MUST_ARRAY = new String[][]{CREDENTIALS_MUST_ARRAY,
            ZHENGQIAN_MUST_ARRAY,ZUOQIAN45_MUST_ARRAY,ZUOCEZHENGMIAN_MUST_ARRAY,
            ZUOHOU45DU_MUST_ARRAY,ZHENGHOUFANG_MUST_ARRAY,YOUHOU45DU_MUST_ARRAY,
            YOUCEZHENGMIAN_MUST_ARRAY,YOUQIAN45DU_MUST_ARRAY};

    /**
     * 遮盖 字段  在图片的标示的后边加上 此字段
     */
    public static final String COVER = "_cover";
}
