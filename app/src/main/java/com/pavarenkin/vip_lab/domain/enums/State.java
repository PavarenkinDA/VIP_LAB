package com.pavarenkin.vip_lab.domain.enums;

import android.support.annotation.NonNull;

/**
 * Created by Дмитрий Паваренкин on 28.02.2017.
 */

public enum State {
    UNKNOWN("UNKNOWN", "Нет данных", false),
    OFFLINE("OFFLINE", "Нет сети", false),
    ONLINE("ONLINE", "В онлайне", false),
    LOGIN("LOGIN", "Попытка авторизации", false),
    LOGIN_ONLINE("LOGIN_ONLINE", "онлайн авторизация", false),
    LOGIN_OFFLINE("LOGIN_OFFLINE", "офлайн авторизация", false),
    ERROR("ERROR", "Ошибка", false),
    NOT_AUTHORIZED("NOT_AUTHORIZED", "Неправильный логин или пароль", false),
    INIT("INIT", "Инициализация", false),
    INIT_READY("INIT_READY", "Проиницилизирован", false),
    INIT_FAILED("INIT_FAILED", "Сессия разорвана", false),
    LOGOUT("LOGOUT", "Выход пользователя", false),
    LOADING("LOADING", "Загрузка", true),
    UPDATING("UPDATING", "Обновление", false),
    NOT_LOADED("NOT_LOADED", "Загрузка прервана", false),
    GPS_STATE("GPS_STATE", "Координаты", false),
    UNIT_STATE("UNIT_STATE", "Состояние", false),
    SEND("SEND", "Передача", false),
    SENT("SENT", "Отправлен", false),
    SAVE("SAVE", "Сохранен", false),
    ACCEPT("ACCEPT", "Подтвержден", false),
    UPDATED("UPDATED", "Обновлено", true),
    RECEIVE("RECEIVE", "Загружено", true),
    LOAD("LOAD", "Загрузить", true),
    ADMIN("ADMIN", "Администрирование", false),
    ASSIGNED("ASSIGNED", "Прият", false),
    NO_CARD("NO_CARD", "Нет карточки", false),
    NO_TICKET("NO_TICKET", "Нет билета", false),
    FIND("FIND", "Поиск", false),
    UPDATE("UPDATE", "Обновить", false),
    BASELINE("BASELINE", "Готов к работе", false),
    SYNC("SYNC", "Синхронизировано", false),
    NOT_INSTALLED("NOT_INSTALLED", "Не установлено", false),
    INVALID_PACKAGE("INVALID_PACKAGE", "Неправильный пакет", false),
    MULTIMEDIA("MULTIMEDIA", "Мультимедиа", false),
    REQUEST("REQUEST", "Запрос", false),
    TRANSFER("TRANSFER", "Передача", false),
    NEW("NEW", "Новое", false),
    NOT_FOUND("NOT_FOUND", "Не найдено", false);

    private final String name;
    private final String caption;
    private final boolean hasProgress;

    State(final String name, String caption, boolean isHavingProgress) {
        this.name = name;
        this.caption = caption;
        this.hasProgress = isHavingProgress;
    }


    public String getName() {
        return name;
    }

    public boolean isHavingProgress() {
        return hasProgress;
    }

    public String getCaption() {
        return caption;
    }

    public static State getByName(@NonNull final String name) {
        for (State state : values()) {
            if (name.equals(state.getName())) return state;
        }

        return null;
    }
}