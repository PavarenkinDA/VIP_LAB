package com.pavarenkin.vip_lab.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MENU".
*/
public class MenuDao extends AbstractDao<Menu, Long> {

    public static final String TABLENAME = "MENU";

    /**
     * Properties of entity Menu.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Kind = new Property(1, int.class, "kind", false, "KIND");
        public final static Property Icon = new Property(2, int.class, "icon", false, "ICON");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Uuid = new Property(4, String.class, "uuid", false, "UUID");
        public final static Property Action = new Property(5, Integer.class, "action", false, "ACTION");
        public final static Property Number = new Property(6, Integer.class, "number", false, "NUMBER");
        public final static Property State = new Property(7, Integer.class, "state", false, "STATE");
        public final static Property Hash = new Property(8, String.class, "hash", false, "HASH");
        public final static Property Json = new Property(9, String.class, "json", false, "JSON");
        public final static Property Caption = new Property(10, String.class, "caption", false, "CAPTION");
        public final static Property Image = new Property(11, Integer.class, "image", false, "IMAGE");
        public final static Property Color = new Property(12, Integer.class, "color", false, "COLOR");
        public final static Property Fontcolor = new Property(13, Integer.class, "fontcolor", false, "FONTCOLOR");
        public final static Property Knowledge = new Property(14, Integer.class, "knowledge", false, "KNOWLEDGE");
        public final static Property Training = new Property(15, Integer.class, "training", false, "TRAINING");
        public final static Property Education = new Property(16, Integer.class, "education", false, "EDUCATION");
        public final static Property Experience = new Property(17, Integer.class, "experience", false, "EXPERIENCE");
        public final static Property Favorite = new Property(18, Integer.class, "favorite", false, "FAVORITE");
        public final static Property Sound = new Property(19, Integer.class, "sound", false, "SOUND");
        public final static Property Audio = new Property(20, String.class, "audio", false, "AUDIO");
        public final static Property Parent = new Property(21, Integer.class, "parent", false, "PARENT");
    }


    public MenuDao(DaoConfig config) {
        super(config);
    }
    
    public MenuDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MENU\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"KIND\" INTEGER NOT NULL ," + // 1: kind
                "\"ICON\" INTEGER NOT NULL ," + // 2: icon
                "\"NAME\" TEXT NOT NULL ," + // 3: name
                "\"UUID\" TEXT," + // 4: uuid
                "\"ACTION\" INTEGER," + // 5: action
                "\"NUMBER\" INTEGER," + // 6: number
                "\"STATE\" INTEGER," + // 7: state
                "\"HASH\" TEXT," + // 8: hash
                "\"JSON\" TEXT," + // 9: json
                "\"CAPTION\" TEXT," + // 10: caption
                "\"IMAGE\" INTEGER," + // 11: image
                "\"COLOR\" INTEGER," + // 12: color
                "\"FONTCOLOR\" INTEGER," + // 13: fontcolor
                "\"KNOWLEDGE\" INTEGER," + // 14: knowledge
                "\"TRAINING\" INTEGER," + // 15: training
                "\"EDUCATION\" INTEGER," + // 16: education
                "\"EXPERIENCE\" INTEGER," + // 17: experience
                "\"FAVORITE\" INTEGER," + // 18: favorite
                "\"SOUND\" INTEGER," + // 19: sound
                "\"AUDIO\" TEXT," + // 20: audio
                "\"PARENT\" INTEGER);"); // 21: parent
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MENU\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Menu entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getKind());
        stmt.bindLong(3, entity.getIcon());
        stmt.bindString(4, entity.getName());
 
        String uuid = entity.getUuid();
        if (uuid != null) {
            stmt.bindString(5, uuid);
        }
 
        Integer action = entity.getAction();
        if (action != null) {
            stmt.bindLong(6, action);
        }
 
        Integer number = entity.getNumber();
        if (number != null) {
            stmt.bindLong(7, number);
        }
 
        Integer state = entity.getState();
        if (state != null) {
            stmt.bindLong(8, state);
        }
 
        String hash = entity.getHash();
        if (hash != null) {
            stmt.bindString(9, hash);
        }
 
        String json = entity.getJson();
        if (json != null) {
            stmt.bindString(10, json);
        }
 
        String caption = entity.getCaption();
        if (caption != null) {
            stmt.bindString(11, caption);
        }
 
        Integer image = entity.getImage();
        if (image != null) {
            stmt.bindLong(12, image);
        }
 
        Integer color = entity.getColor();
        if (color != null) {
            stmt.bindLong(13, color);
        }
 
        Integer fontcolor = entity.getFontcolor();
        if (fontcolor != null) {
            stmt.bindLong(14, fontcolor);
        }
 
        Integer knowledge = entity.getKnowledge();
        if (knowledge != null) {
            stmt.bindLong(15, knowledge);
        }
 
        Integer training = entity.getTraining();
        if (training != null) {
            stmt.bindLong(16, training);
        }
 
        Integer education = entity.getEducation();
        if (education != null) {
            stmt.bindLong(17, education);
        }
 
        Integer experience = entity.getExperience();
        if (experience != null) {
            stmt.bindLong(18, experience);
        }
 
        Integer favorite = entity.getFavorite();
        if (favorite != null) {
            stmt.bindLong(19, favorite);
        }
 
        Integer sound = entity.getSound();
        if (sound != null) {
            stmt.bindLong(20, sound);
        }
 
        String audio = entity.getAudio();
        if (audio != null) {
            stmt.bindString(21, audio);
        }
 
        Integer parent = entity.getParent();
        if (parent != null) {
            stmt.bindLong(22, parent);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Menu entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getKind());
        stmt.bindLong(3, entity.getIcon());
        stmt.bindString(4, entity.getName());
 
        String uuid = entity.getUuid();
        if (uuid != null) {
            stmt.bindString(5, uuid);
        }
 
        Integer action = entity.getAction();
        if (action != null) {
            stmt.bindLong(6, action);
        }
 
        Integer number = entity.getNumber();
        if (number != null) {
            stmt.bindLong(7, number);
        }
 
        Integer state = entity.getState();
        if (state != null) {
            stmt.bindLong(8, state);
        }
 
        String hash = entity.getHash();
        if (hash != null) {
            stmt.bindString(9, hash);
        }
 
        String json = entity.getJson();
        if (json != null) {
            stmt.bindString(10, json);
        }
 
        String caption = entity.getCaption();
        if (caption != null) {
            stmt.bindString(11, caption);
        }
 
        Integer image = entity.getImage();
        if (image != null) {
            stmt.bindLong(12, image);
        }
 
        Integer color = entity.getColor();
        if (color != null) {
            stmt.bindLong(13, color);
        }
 
        Integer fontcolor = entity.getFontcolor();
        if (fontcolor != null) {
            stmt.bindLong(14, fontcolor);
        }
 
        Integer knowledge = entity.getKnowledge();
        if (knowledge != null) {
            stmt.bindLong(15, knowledge);
        }
 
        Integer training = entity.getTraining();
        if (training != null) {
            stmt.bindLong(16, training);
        }
 
        Integer education = entity.getEducation();
        if (education != null) {
            stmt.bindLong(17, education);
        }
 
        Integer experience = entity.getExperience();
        if (experience != null) {
            stmt.bindLong(18, experience);
        }
 
        Integer favorite = entity.getFavorite();
        if (favorite != null) {
            stmt.bindLong(19, favorite);
        }
 
        Integer sound = entity.getSound();
        if (sound != null) {
            stmt.bindLong(20, sound);
        }
 
        String audio = entity.getAudio();
        if (audio != null) {
            stmt.bindString(21, audio);
        }
 
        Integer parent = entity.getParent();
        if (parent != null) {
            stmt.bindLong(22, parent);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Menu readEntity(Cursor cursor, int offset) {
        Menu entity = new Menu( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // kind
            cursor.getInt(offset + 2), // icon
            cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // uuid
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // action
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // number
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // state
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // hash
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // json
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // caption
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // image
            cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12), // color
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // fontcolor
            cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14), // knowledge
            cursor.isNull(offset + 15) ? null : cursor.getInt(offset + 15), // training
            cursor.isNull(offset + 16) ? null : cursor.getInt(offset + 16), // education
            cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17), // experience
            cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18), // favorite
            cursor.isNull(offset + 19) ? null : cursor.getInt(offset + 19), // sound
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // audio
            cursor.isNull(offset + 21) ? null : cursor.getInt(offset + 21) // parent
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Menu entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setKind(cursor.getInt(offset + 1));
        entity.setIcon(cursor.getInt(offset + 2));
        entity.setName(cursor.getString(offset + 3));
        entity.setUuid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAction(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setNumber(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setState(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setHash(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setJson(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setCaption(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setImage(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setColor(cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12));
        entity.setFontcolor(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setKnowledge(cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14));
        entity.setTraining(cursor.isNull(offset + 15) ? null : cursor.getInt(offset + 15));
        entity.setEducation(cursor.isNull(offset + 16) ? null : cursor.getInt(offset + 16));
        entity.setExperience(cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17));
        entity.setFavorite(cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18));
        entity.setSound(cursor.isNull(offset + 19) ? null : cursor.getInt(offset + 19));
        entity.setAudio(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setParent(cursor.isNull(offset + 21) ? null : cursor.getInt(offset + 21));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Menu entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Menu entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Menu entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
