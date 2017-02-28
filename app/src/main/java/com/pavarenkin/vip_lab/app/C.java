package com.pavarenkin.vip_lab.app;

/**
 * Created by Дмитрий Паваренкин on 25.02.2017.
 */

public class C {
    public static class API {
        public static String URL = "http://192.168.1.139:8090";
    }

    public static class DB {
        public static final int VERSION = 1;
        public static final int BUFFER_SIZE = 2048;
        public static final String NAME = "MainDatabase.SQLite";
        public static final String CREATE_SCRIPT = "CreateDatabase.sql";
        public static final String ID = "_id";
        public static final String PARENT_ID = "PARENT_ID";

        public static final String OP_ID = C.DB.ID + " = ?";
        public static final String OP_PARENT_ID = C.DB.PARENT_ID + " = ?";
        public static final long NO_PARENT = 0;
    }

    public static class IMAGE {
        public static final String TABLE = "IMAGE";
        public static final String ID = C.DB.ID;
        public static final String DATA = "DATA";
        public static final String HASH = "HASH";
    }
    public static class SOUND {
        public static final String TABLE = "SOUND";
        public static final String ID = C.DB.ID;
        public static final String DATA = "DATA";
        public static final String HASH = "HASH";
    }

    public static class MENU {
        public static final String TABLE = "MENU";
        public static final String ID = C.DB.ID;
        public static final String KIND = "KIND";
        public static final String ICON = "ICON";
        public static final String NUMBER = "NUMBER";
        public static final String STATE = "STATE";
        public static final String NAME = "NAME";
        public static final String HASH = "HASH";
        public static final String JSON = "JSON";
        public static final String CAPTION = "CAPTION";
        public static final String IMAGE = "IMAGE";
        public static final String COLOR = "COLOR";
        public static final String FONTCOLOR = "FONTCOLOR";
        public static final String KNOWLEDGE = "KNOWLEDGE";
        public static final String TRAINING = "TRAINING";
        public static final String EDUCATION = "EDUCATION";
        public static final String EXPERIENCE = "EXPERIENCE";
        public static final String FAVORITE = "FAVORITE";
        public static final String SOUND = "SOUND";
        public static final String AUDIO = "AUDIO";
        public static final String PARENT_ID = C.DB.PARENT_ID;

        public static final String[] DRAWER = new String[]{ID, KIND, ICON, NAME};
        public static final String[] DRAWER_VIEW = new String[]{NAME, ICON};
        public static final String[] DRAWER_MENU = new String[]{ID, KIND, ICON, NUMBER,
                STATE, NAME, HASH, JSON, CAPTION, IMAGE, COLOR, FONTCOLOR, KNOWLEDGE, TRAINING,
                EDUCATION, EXPERIENCE, FAVORITE, SOUND, AUDIO, PARENT_ID};

    }

    public static class AUDIO {
        public static final String EXT_3GP = ".3gp";
        public static final String EXT_MP4 = ".mp4";
        public static final String EXT_WAV = ".wav";
        public static final String EXT_TMP = "temp.raw";
        public static final String PATH = "AudioRecorder";
        public static final String[] FORMATS = new String[]{"MPEG 4", "3GPP", "WAVE"};
    }
}
