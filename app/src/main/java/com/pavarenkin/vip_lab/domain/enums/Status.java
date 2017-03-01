package com.pavarenkin.vip_lab.domain.enums;

import android.support.annotation.NonNull;

/**
 * Created by Дмитрий Паваренкин on 28.02.2017.
 */

public enum Status {
    UNKNOWN("UNKNOWN", "НЕТ ДАННЫХ"),
    CLOSED("CLOSED", "ЗАКРЫТ"),
    OPENED("OPENED", "ОТКРЫТ"),
    ASSIGNED("ASSIGNED", "НАЗНАЧЕН"),
    CREATED("CREATED", "СОЗДАН"),
    ACTIVE("ACTIVE", "НА ЛИНИИ"),
    BREAKDOWN("BREAKDOWN", "ПОЛОМКА"),
    HANDLING("HANDLING", "ОБРАБОТКА"),
    STUCK("STUCK", "ЗАСТРЯЛ"),
    FILLING("FILLING", "ПОДЗАРЯДКА"),
    PLANNED("PLANNED", "В ПЛАНЕ"),
    EMERGENCY("EMERGENCY", "ЭКСТРЕННО"),
    AT_STORAGE("AT_STORAGE", "В ХРАНИЛИЩЕ"),
    INITIATED("INITIATED", "ИНИЦИАЛИЗИРОВАН"),
    ISSUED("ISSUED", "ВЫДАН"),
    RETURN_INITIATED("RETURN_INITIATED", "ИНИЦИИРОВАН ВОЗВРАТ"),

    SENT("SENT", "ОТПРАВКА"),
    SEND("SEND", "Отправлен"),
    CONFIRM("CONFIRM", "Подтвержден"),
    RECEIVE("RECEIVE", "Получен"),
    NOT_SEND("NOT_SEND", "Не отправлен"),
    UPDATED("UPDATED", "Обновлено"),
    READY("READY", "Готово"),
    BASELINE("BASELINE", "Без изменений"),

    DEPARTURED("DEPARTURED", "ВЫЕХАЛ"),
    ARRIVAL("ARRIVAL", "ПРИБЫЛ"),
    DECLINED("DECLINED", "ОТКЛОНЕН"),
    TRANSFERRED("TRANSFERRED", "ПЕРЕДАН"),
    COMPLETE("COMPLETE", "ВЫПОЛНЕН"),
    CANCELED("CANCELED", "ОТМЕНЕН"),
    NEW("NEW", "НОВЫЙ"),


    ACCEPTED("ACCEPTED", "ПРИНЯТ"),
    REJECTED("REJECTED", "ЗАПРОС ОТКЛОНЕН"),

    DRAFT("DRAFT", "Черновик"),
    CONFIRMED("CONFIRMED", "Подтвержден"),

    ACCEPT("ACCEPT", "Вызов принят"),
    REJECT("REJECT", "Вызов отклонен"),
    DEPARTURE("DEPARTURE", "Выезд на вызов"),
    ARRIVE("ARRIVE", "Прибытие на вызов"),

    NOT_REQUIRED("NOT_REQUIRED", "Не требуется"),
    NEED_ACTIVE_CALL("NEED_ACTIVE_CALL", "Больной нуждается в активном выезде"),
    ATTENDING_CLINICS("ATTENDING_CLINICS", "Больной подлежит активному посещению врачом поликлиники"),
    NEED_SOME_ACTIVITIES("NEED_SOME_ACTIVITIES", "Больной нуждается в другом активном действии"),

    PROCESSING("PROCESSING", "PROCESSING"),
    NOT_OBTAIN("NOT_OBTAIN", "Не получалось"),
    CONSENT("CONSENT", "Согласие"),
    REFUSAL("REFUSAL", "Отказ"),

    PRIMARY("PRIMARY", "Первичный"),
    PASSING("PASSING", "Попутный"),

    COMPLETED("ЗАВЕРШИТЬ", "ВЫЗОВ ЗАВЕРШЕН"),
    SERVICING("ДЕЙСТВИЕ", "НА ВЫЗОВЕ"),

    GOT_OUT("ПРИБЫТИЕ", "БРИГАДА В ПУТИ"),
    BROKE_OFF("ПОПУТНЫЙ ВЫЗОВ", "ОСТАНОВКА ПОПУТНО"),
    ARRIVED_ON_CALL("ДЕЙСТВИЕ", "ПРИБЫТИЕ НА ВЫЗОВ"),
    WAITING_FOR_BRIGADE("ПРИБЫТИЕ СПЕЦБРИГАДЫ", "ОЖИДАНИЕ СПЕЦБРИГАДЫ"),
    WAITING_FOR_SERVICES("ПРИБЫТИЕ СМЕЖНЫХ СЛУЖБ", "ОЖИДАНИЕ СМЕЖНЫХ СЛУЖБ"),
    REQUEST_FOR_HOSPITAL("ДОСТАВКА В СТАЦИОНАР", "ЗАПРОС НА ГОСПИТАЛИЗАЦИЮ"),
    DELIVERY_TO_HOSPITAL("ПРИБЫТИЕ В СТАЦИОНАР", "ДОСТАВКА В СТАЦИОНАР"),
    ARRIVED_ON_HOSPITAL("ЗАВЕРШЕНИЕ ВЫЗОВА", "ПРИБЫТИЕ В СТАЦИОНАР"),
    DELIVERY_TO_EMERGENCY_ROOM("ПРИБЫТИЕ В ТРАВМПУНКТ", "ДОСТАВКА В ТРАВМПУНКТ"),
    ARRIVED_ON_EMERGENCY_ROOM("ЗАВЕРШЕНИЕ ВЫЗОВА", "ПРИБЫТИЕ В ТРАВМПУНКТ"),
    FINISHED("ВЫЗОВ ОБСЛУЖЕН", "ВЫЗОВ ОБСЛУЖЕН"),
    FREE("СВОБОДНА", "НОВЫЙ ВЫЗОВ"),

    DOING_JOB("DOING_JOB", "НА ВЫЗОВЕ"),
    SHIFT_CHANGE("SHIFT_CHANGE", "ПЕРЕСМЕНКА"),
    AT_LUNCH("AT_LUNCH", "НА ОБЕДЕ"),
    RETURNING("RETURNING", "ВОЗВРАЩЕНИЕ"),
    ON_STATION("ON_STATION", "НА СТАНЦИИ"),
    DRUG_REFILLING("DRUG_REFILLING", "ЗАПРАВКА МЕДИКАМЕНТАМИ"),
    DUTY("DUTY",  "ДЕЖУРСТВО"),
    AUTO("AUTO", "АВТОТРАНСПОРТ"),
    NO_BRIGADE("NO_BRIGADE", "НЕ В БРИГАДЕ");

    private final String name;
    private final String caption;

    Status(String name, String caption) {
        this.name  = name;
        this.caption = caption;
    }

    public String getName() {
        return name;
    }

    public String getCaption() {
        return caption;
    }

    public static Status getByName(@NonNull final String name) {
        for (Status status : values()) {
            if (name.equals(status.getName())) return status;
        }

        return null;
    }


}

