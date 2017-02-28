package com.pavarenkin;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Property;
import org.greenrobot.greendao.generator.Schema;

public class MainGenerator {

    private static final String PROJECT_DIR = System.getProperty("user.dir");
    private static final String GENERATE_TO = PROJECT_DIR + "/app/src/main/java";
    private static final String SCHEMA_NAME = "com.pavarenkin.vip_lab.db";
    private static final String DOMAIN = "com.pavarenkin.vip_lab.domain";

    public static void main(String[] args) {
        Schema schema = new Schema(1, SCHEMA_NAME);
        schema.enableKeepSectionsByDefault();

        addTables(schema);

        try {
            new DaoGenerator().generateAll(schema, GENERATE_TO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addTables(final Schema schema) {
        Entity menu = addMenu(schema);

        Entity user = addUser(schema);
        Entity repo = addRepo(schema);
        Entity note = addNote(schema);
        Entity post = addPost(schema);

        Property userId = repo.addLongProperty("userId").notNull().getProperty();
        user.addToMany(repo, userId, "userRepos");
    }

    private static Entity addMenu(final Schema schema) {
        Entity entity = schema.addEntity("Menu");
        entity.addIdProperty().primaryKey().autoincrement();
        entity.addIntProperty("kind").notNull();
        entity.addIntProperty("icon").notNull();
        entity.addStringProperty("name").notNull();
        entity.addStringProperty("uuid");
        entity.addIntProperty("action");
        entity.addIntProperty("number");
        entity.addIntProperty("state");
        entity.addStringProperty("hash");
        entity.addStringProperty("json");
        entity.addStringProperty("caption");
        entity.addIntProperty("image");
        entity.addIntProperty("color");
        entity.addIntProperty("fontcolor");
        entity.addIntProperty("knowledge");
        entity.addIntProperty("training");
        entity.addIntProperty("education");
        entity.addIntProperty("experience");
        entity.addIntProperty("favorite");
        entity.addIntProperty("sound");
        entity.addStringProperty("audio");
        entity.addIntProperty("parent");

        return entity;
    }


    private static Entity addUser(final Schema schema) {
        Entity user = schema.addEntity("User");
        user.addIdProperty().primaryKey().autoincrement();
        user.addStringProperty("name").notNull();
        user.addShortProperty("age");

        return user;
    }

    private static Entity addRepo(final Schema schema) {
        Entity repo = schema.addEntity("Repo");
        repo.addIdProperty().primaryKey().autoincrement();
        repo.addStringProperty("title").notNull();
        repo.addStringProperty("language");
        repo.addIntProperty("watchers_count");

        return repo;
    }

    private static Entity addNote(final Schema schema) {
        Entity note = schema.addEntity("Note");
        note.addIdProperty().primaryKey().autoincrement();
        note.addStringProperty("text").notNull();
        note.addStringProperty("comment");
        note.addDateProperty("date");
        note.addStringProperty("type").customType(DOMAIN + ".enums.NoteType", DOMAIN + ".enums.NoteTypeConverter");

        return note;
    }

    private static Entity addPost(final Schema schema) {
        Entity post = schema.addEntity("Post");
        post.addIdProperty().primaryKey().autoincrement();
        post.addStringProperty("text").notNull();
        post.addIntProperty("value");

        return post;
    }
}
