package com.pavarenkin.vip_lab.db;

import org.greenrobot.greendao.annotation.*;

import java.util.List;
import com.pavarenkin.vip_lab.db.DaoSession;
import org.greenrobot.greendao.DaoException;

import com.pavarenkin.vip_lab.domain.enums.Action;
import com.pavarenkin.vip_lab.domain.enums.Kind;
import com.pavarenkin.vip_lab.domain.enums.State;
import com.pavarenkin.vip_lab.domain.enums.Status;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "FLEX".
 */
@Entity(active = true)
public class Flex {

    @Id(autoincrement = true)
    private Long id;

    @Convert(converter = com.pavarenkin.vip_lab.domain.converters.KindConverter.class, columnType = String.class)
    @NotNull
    private Kind kind;

    @Convert(converter = com.pavarenkin.vip_lab.domain.converters.StateConverter.class, columnType = String.class)
    @NotNull
    private State state;

    @Convert(converter = com.pavarenkin.vip_lab.domain.converters.ActionConverter.class, columnType = String.class)
    @NotNull
    private Action action;

    @Convert(converter = com.pavarenkin.vip_lab.domain.converters.StatusConverter.class, columnType = String.class)
    @NotNull
    private Status status;
    private Long parentId;
    private Long pictureId;
    private String name;
    private String caption;
    private String code;
    private String url;
    private String hash;
    private String audio;
    private String json;
    private Integer icon;
    private Integer number;
    private Integer image;
    private Integer color;
    private Integer fontColor;
    private Integer valuCcolor;
    private Integer knowledge;
    private Integer training;
    private Integer education;
    private Integer experience;
    private Integer favorite;
    private Integer sound;
    private java.util.Date date;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient FlexDao myDao;

    @ToOne(joinProperty = "parentId")
    private Flex parent;

    @Generated
    private transient Long parent__resolvedKey;

    @ToOne(joinProperty = "pictureId")
    private FlexPicture flexPicture;

    @Generated
    private transient Long flexPicture__resolvedKey;

    @ToMany(joinProperties = {
        @JoinProperty(name = "id", referencedName = "parentId")
    })
    private List<Flex> children;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Flex() {
    }

    public Flex(Long id) {
        this.id = id;
    }

    @Generated
    public Flex(Long id, Kind kind, State state, Action action, Status status, Long parentId, Long pictureId, String name, String caption, String code, String url, String hash, String audio, String json, Integer icon, Integer number, Integer image, Integer color, Integer fontColor, Integer valuCcolor, Integer knowledge, Integer training, Integer education, Integer experience, Integer favorite, Integer sound, java.util.Date date) {
        this.id = id;
        this.kind = kind;
        this.state = state;
        this.action = action;
        this.status = status;
        this.parentId = parentId;
        this.pictureId = pictureId;
        this.name = name;
        this.caption = caption;
        this.code = code;
        this.url = url;
        this.hash = hash;
        this.audio = audio;
        this.json = json;
        this.icon = icon;
        this.number = number;
        this.image = image;
        this.color = color;
        this.fontColor = fontColor;
        this.valuCcolor = valuCcolor;
        this.knowledge = knowledge;
        this.training = training;
        this.education = education;
        this.experience = experience;
        this.favorite = favorite;
        this.sound = sound;
        this.date = date;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFlexDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public Kind getKind() {
        return kind;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setKind(@NotNull Kind kind) {
        this.kind = kind;
    }

    @NotNull
    public State getState() {
        return state;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setState(@NotNull State state) {
        this.state = state;
    }

    @NotNull
    public Action getAction() {
        return action;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAction(@NotNull Action action) {
        this.action = action;
    }

    @NotNull
    public Status getStatus() {
        return status;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setStatus(@NotNull Status status) {
        this.status = status;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getFontColor() {
        return fontColor;
    }

    public void setFontColor(Integer fontColor) {
        this.fontColor = fontColor;
    }

    public Integer getValuCcolor() {
        return valuCcolor;
    }

    public void setValuCcolor(Integer valuCcolor) {
        this.valuCcolor = valuCcolor;
    }

    public Integer getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Integer knowledge) {
        this.knowledge = knowledge;
    }

    public Integer getTraining() {
        return training;
    }

    public void setTraining(Integer training) {
        this.training = training;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getFavorite() {
        return favorite;
    }

    public void setFavorite(Integer favorite) {
        this.favorite = favorite;
    }

    public Integer getSound() {
        return sound;
    }

    public void setSound(Integer sound) {
        this.sound = sound;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Flex getParent() {
        Long __key = this.parentId;
        if (parent__resolvedKey == null || !parent__resolvedKey.equals(__key)) {
            __throwIfDetached();
            FlexDao targetDao = daoSession.getFlexDao();
            Flex parentNew = targetDao.load(__key);
            synchronized (this) {
                parent = parentNew;
            	parent__resolvedKey = __key;
            }
        }
        return parent;
    }

    @Generated
    public void setParent(Flex parent) {
        synchronized (this) {
            this.parent = parent;
            parentId = parent == null ? null : parent.getId();
            parent__resolvedKey = parentId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public FlexPicture getFlexPicture() {
        Long __key = this.pictureId;
        if (flexPicture__resolvedKey == null || !flexPicture__resolvedKey.equals(__key)) {
            __throwIfDetached();
            FlexPictureDao targetDao = daoSession.getFlexPictureDao();
            FlexPicture flexPictureNew = targetDao.load(__key);
            synchronized (this) {
                flexPicture = flexPictureNew;
            	flexPicture__resolvedKey = __key;
            }
        }
        return flexPicture;
    }

    @Generated
    public void setFlexPicture(FlexPicture flexPicture) {
        synchronized (this) {
            this.flexPicture = flexPicture;
            pictureId = flexPicture == null ? null : flexPicture.getId();
            flexPicture__resolvedKey = pictureId;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<Flex> getChildren() {
        if (children == null) {
            __throwIfDetached();
            FlexDao targetDao = daoSession.getFlexDao();
            List<Flex> childrenNew = targetDao._queryFlex_Children(id);
            synchronized (this) {
                if(children == null) {
                    children = childrenNew;
                }
            }
        }
        return children;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetChildren() {
        children = null;
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
