package com.pavarenkin.vip_lab.domain.enums;

import android.support.annotation.NonNull;

public enum Action {
    UNKNOWN("UNKNOWN", "Не задано"),
    TOAST("TOAST", "Уведомление пользователя"),
    MAIN_MENU("MAIN_MENU", "Клик в главном меню"),
    MAIN_LIST("MAIN_LIST", "Клик в главном списке"),
    API_GET("API_GET", "Передача запроса в методе API"),
    API_POST("API_POST", "Передача данных в методе API");

    private final String name;
    private final String caption;

    Action(String name, String caption) {
        this.name = name;
        this.caption = caption;
    }

    public String getName() {
        return name;
    }

    public String getCaption() {
        return caption;
    }

    public static Action getByName(@NonNull final String name) {
        for (Action action : values()) {
            if (name.equals(action.getName())) return action;
        }

        return null;
    }
}
