package com.pavarenkin.vip_lab.domain.enums;

import android.support.annotation.NonNull;

public enum Kind {
    UNKNOWN("UNKNOWN", "Неизвестный тип данных"),
    TEXT("TEXT", "Простое текстовое поле"),
    READ_TEXT("READ_TEXT", "Текстовое значение"),
    READ_LONG_TEXT("READ_LONG_TEXT", "Текст с переносом строки"),
    EDIT_LONG_TEXT("EDIT_LONG_TEXT", "Поле для ввода многострочного текста"),
    EDIT_SHORT_TEXT("EDIT_SHORT_TEXT", "Поле для ввода в строке"),
    READ_DATE("READ_DATE", "Поле для вывода времени"),
    EDIT_DATE("EDIT_DATE", "Поле для выбора даты"),
    EDIT_TIME("EDIT_TIME", "Поле для выбора времени"),
    RADIO_BUTTONS("RADIO_BUTTONS", "Группа радиокнопок"),
    CHECKBOX("CHECKBOX", "Чекбокс"),
    CHECK_BUTTONS("CHECK_BUTTONS", "Группа чекбоксов"),
    FLEX("FLEX", "Флекс"),
    ACTION("ACTION", "Действие"),
    HYPERLINK("HYPERLINK", "Гиперссылка"),
    BANNER_ARROW_UP("BANNER_ARROW_UP", "Баннер свернут"),
    BANNER_ARROW_DOWN("BANNER_ARROW_DOWN", "Баннер развернут"),
    ENTITY_ARROW_UP("ENTITY_ARROW_UP", "Элемент свернут"),
    ENTITY_ARROW_DOWN("ENTITY_ARROW_DOWN", "Злемент развернут"),
    DOMAIN_ARROW_UP("DOMAIN_ARROW_UP", "Заголовок свернут"),
    DOMAIN_ARROW_DOWN("DOMAIN_ARROW_DOWN", "Заголовок разрвернут"),
    EDIT_VALUE("EDIT_VALUE", "Редатор значения"),
    EDIT_LONG_VALUE("EDIT_LONG_VALUE", "Редактор многострочного значения"),
    LIST("LIST", "Список"),
    PICTURE("PICTURE", "Изображение"),
    AUDIO("AUDIO", "Звукозапись"),
    PHOTO("PHOTO", "Фотография"),
    VIDEO("VIDEO", "Видеозапись"),
    CALL("CALL", "Звонок"),
    TICKET("TICKET", "Билет"),
    CARD("CARD", "Карта"),
    MULTIMEDIA("MULTIMEDIA", "Мультимедиа");

    private final String name;
    private final String caption;

    Kind(String name, String caption) {
        this.name = name;
        this.caption = caption;
    }

    public String getName() {
        return name;
    }

    public String getCaption() {
        return caption;
    }

    public static Kind getByName(@NonNull final String name) {
        for (Kind kind : values()) {
            if (name.equals(kind.getName())) return kind;
        }

        return null;
    }
}
