package com.pavarenkin.vip_lab.app;

import android.app.Application;
import android.content.res.Configuration;
import android.media.MediaPlayer;

import com.pavarenkin.vip_lab.api.AxiomApi;
import com.pavarenkin.vip_lab.db.DaoMaster;
import com.pavarenkin.vip_lab.db.DaoSession;

import org.greenrobot.greendao.database.Database;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Дмитрий Паваренкин on 25.02.2017.
 * Наследование класса Application - самый долгоживущий класс в приложении.
 * Характеристики изображений для разных устройств.
 * xxhdpi 1920x1280, на Tab A, выглядит как фотография с высокой четкостью изображения.
 * xhdpi 1280х960
 * hdpi 960x720
 * mdpi 640x480
 */

public class VIPApplication extends Application {

    private static final boolean ENCRYPTED = true;
    // Статический интерфейс для работы по протоколу REST API и JSON-RPC.
    private static AxiomApi axiomApi = null;
    // Библиотека для работы по сетевому протоколу.
    private Retrofit retrofit;
    // Сессия с базой данных.
    private DaoSession daoSession;
    // Мультимедиа проигрыватель.
    private MediaPlayer mediaPlayer = null;

    private int orientation;
    private int drawerPosition;
    private long drawerId;
    private long menuId;


    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer = new MediaPlayer();
        retrofit = new Retrofit.Builder()
                .baseUrl(C.API.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        axiomApi = retrofit.create(AxiomApi.class);

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, ENCRYPTED ? "notes-db-encrypted" : "notes-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();

        drawerPosition = 0;
        drawerId = 1;
        menuId = 1;
    }

    @Override
    public final void onTerminate() {
        super.onTerminate();
        if(mediaPlayer != null) { mediaPlayer.release(); }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        orientation = newConfig.orientation;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
    }

    public static AxiomApi getAxiomApi() {
        return axiomApi;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    public MediaPlayer getMediaPlayer() { return mediaPlayer; }

    public int getOrientation() { return orientation; }

    public int getDrawerPosition() { return drawerPosition; }

    public void setDrawerPosition(int drawerPosition) { this.drawerPosition = drawerPosition; }

    public long getDrawerId() { return drawerId; }

    public void setDrawerId(long drawerId) { this.drawerId = drawerId; }

    public long getMenuId() { return menuId; }

    public void setMenuId(long menuId) { this.menuId = menuId; }


}
