package com.wanglibao.usedcar.carassess.modle.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.wanglibao.usedcar.carassess.config.Constant;
import com.wanglibao.usedcar.carassess.modle.Car;
import com.wanglibao.usedcar.carassess.modle.CarImage;
import com.wanglibao.usedcar.carassess.modle.CarRegister;
import com.wanglibao.usedcar.carassess.modle.Defect;

import java.sql.SQLException;

/**
 * Created by lugg on 2016/3/31.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper{

    private static DatabaseHelper instance;

    public static synchronized DatabaseHelper getDBUtil(Context context){
        context = context.getApplicationContext();
        if(instance == null){
            synchronized (DatabaseHelper.class){
                if (instance == null){
                    instance = new DatabaseHelper(context);
                }
            }
        }
        return instance;
    }

    private DatabaseHelper(Context context){
        super(context, Constant.DB_NAME,null, Constant.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Car.class);
            TableUtils.createTable(connectionSource, CarRegister.class);
            TableUtils.createTable(connectionSource, CarImage.class);
            TableUtils.createTable(connectionSource, Defect.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource,Car.class,true);
            TableUtils.dropTable(connectionSource,CarRegister.class,true);
            TableUtils.dropTable(connectionSource,CarImage.class,true);
            TableUtils.dropTable(connectionSource,Defect.class,true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        onCreate(database,connectionSource);
    }
}
