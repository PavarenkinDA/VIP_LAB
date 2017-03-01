package com.pavarenkin.vip_lab.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.pavarenkin.vip_lab.domain.converters.ActionConverter;
import com.pavarenkin.vip_lab.domain.converters.KindConverter;
import com.pavarenkin.vip_lab.domain.converters.StateConverter;
import com.pavarenkin.vip_lab.domain.converters.StatusConverter;
import com.pavarenkin.vip_lab.domain.enums.Action;
import com.pavarenkin.vip_lab.domain.enums.Kind;
import com.pavarenkin.vip_lab.domain.enums.State;
import com.pavarenkin.vip_lab.domain.enums.Status;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FLEX_PICTURE".
*/
public class FlexPictureDao extends AbstractDao<FlexPicture, Long> {

    public static final String TABLENAME = "FLEX_PICTURE";

    /**
     * Properties of entity FlexPicture.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Kind = new Property(1, String.class, "kind", false, "KIND");
        public final static Property State = new Property(2, String.class, "state", false, "STATE");
        public final static Property Action = new Property(3, String.class, "action", false, "ACTION");
        public final static Property Status = new Property(4, String.class, "status", false, "STATUS");
        public final static Property Picture = new Property(5, String.class, "picture", false, "PICTURE");
        public final static Property Comment = new Property(6, String.class, "comment", false, "COMMENT");
        public final static Property Date = new Property(7, java.util.Date.class, "date", false, "DATE");
    }

    private final KindConverter kindConverter = new KindConverter();
    private final StateConverter stateConverter = new StateConverter();
    private final ActionConverter actionConverter = new ActionConverter();
    private final StatusConverter statusConverter = new StatusConverter();

    public FlexPictureDao(DaoConfig config) {
        super(config);
    }
    
    public FlexPictureDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FLEX_PICTURE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"KIND\" TEXT NOT NULL ," + // 1: kind
                "\"STATE\" TEXT NOT NULL ," + // 2: state
                "\"ACTION\" TEXT NOT NULL ," + // 3: action
                "\"STATUS\" TEXT NOT NULL ," + // 4: status
                "\"PICTURE\" TEXT," + // 5: picture
                "\"COMMENT\" TEXT," + // 6: comment
                "\"DATE\" INTEGER);"); // 7: date
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FLEX_PICTURE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FlexPicture entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, kindConverter.convertToDatabaseValue(entity.getKind()));
        stmt.bindString(3, stateConverter.convertToDatabaseValue(entity.getState()));
        stmt.bindString(4, actionConverter.convertToDatabaseValue(entity.getAction()));
        stmt.bindString(5, statusConverter.convertToDatabaseValue(entity.getStatus()));
 
        String picture = entity.getPicture();
        if (picture != null) {
            stmt.bindString(6, picture);
        }
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(7, comment);
        }
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(8, date.getTime());
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FlexPicture entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, kindConverter.convertToDatabaseValue(entity.getKind()));
        stmt.bindString(3, stateConverter.convertToDatabaseValue(entity.getState()));
        stmt.bindString(4, actionConverter.convertToDatabaseValue(entity.getAction()));
        stmt.bindString(5, statusConverter.convertToDatabaseValue(entity.getStatus()));
 
        String picture = entity.getPicture();
        if (picture != null) {
            stmt.bindString(6, picture);
        }
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(7, comment);
        }
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(8, date.getTime());
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public FlexPicture readEntity(Cursor cursor, int offset) {
        FlexPicture entity = new FlexPicture( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            kindConverter.convertToEntityProperty(cursor.getString(offset + 1)), // kind
            stateConverter.convertToEntityProperty(cursor.getString(offset + 2)), // state
            actionConverter.convertToEntityProperty(cursor.getString(offset + 3)), // action
            statusConverter.convertToEntityProperty(cursor.getString(offset + 4)), // status
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // picture
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // comment
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)) // date
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FlexPicture entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setKind(kindConverter.convertToEntityProperty(cursor.getString(offset + 1)));
        entity.setState(stateConverter.convertToEntityProperty(cursor.getString(offset + 2)));
        entity.setAction(actionConverter.convertToEntityProperty(cursor.getString(offset + 3)));
        entity.setStatus(statusConverter.convertToEntityProperty(cursor.getString(offset + 4)));
        entity.setPicture(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setComment(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDate(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FlexPicture entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FlexPicture entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FlexPicture entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}