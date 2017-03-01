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
    private static final String ENUM = DOMAIN + ".enums.";
    private static final String CONVERTER = DOMAIN + ".converters.";

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

    private static Entity addController(final Schema schema, String schemaName) {
        Entity entity = schema.addEntity(schemaName);

        entity.addIdProperty().primaryKey().autoincrement();
        entity.addStringProperty("kind").notNull().customType(ENUM + "Kind", CONVERTER + "KindConverter");
        entity.addStringProperty("state").notNull().customType(ENUM + "State", CONVERTER + "StateConverter");
        entity.addStringProperty("action").notNull().customType(ENUM + "Action", CONVERTER + "ActionConverter");
        entity.addStringProperty("status").notNull().customType(ENUM + "Status", CONVERTER + "StatusConverter");

        return entity;
    }

    private static Entity addFlexPicture(final Schema schema) {
        Entity entity = addController(schema, "FlexPicture");

        entity.addStringProperty("picture");
        entity.addStringProperty("comment");
        entity.addDateProperty("date");

        return entity;
    }

    private static void addTables(final Schema schema) {
        Entity flexPicture = addFlexPicture(schema);
        Entity flex = addFlex(schema, flexPicture);
        Entity flexState = addFlexState(schema);

        Entity user = addUser(schema);
        Entity repo = addRepo(schema);
        Entity post = addPost(schema);

        Property userId = repo.addLongProperty("userId").notNull().getProperty();
        user.addToMany(repo, userId, "userRepos");

    }

    private static Entity addFlex(final Schema schema, Entity flexPicture) {
        Entity entity = addController(schema, "Flex");

        Property parentIdProperty = entity.addLongProperty("parentId").getProperty();
        entity.addToOne(entity, parentIdProperty).setName("parent");
        entity.addToMany(entity, parentIdProperty).setName("children");
        Property pictureIdProperty = entity.addLongProperty("pictureId").getProperty();
        entity.addToOne(flexPicture, pictureIdProperty);

        entity.addStringProperty("name");
        entity.addStringProperty("caption");
        entity.addStringProperty("code");
        entity.addStringProperty("url");
        entity.addStringProperty("hash");
        entity.addStringProperty("audio");
        entity.addStringProperty("json");
        entity.addIntProperty("icon");
        entity.addIntProperty("number");
        entity.addIntProperty("image");
        entity.addIntProperty("color");
        entity.addIntProperty("fontColor");
        entity.addIntProperty("valuCcolor");
        entity.addIntProperty("knowledge");
        entity.addIntProperty("training");
        entity.addIntProperty("education");
        entity.addIntProperty("experience");
        entity.addIntProperty("favorite");
        entity.addIntProperty("sound");
        entity.addDateProperty("date");

        return entity;
//        TODO USE TREE
//        TreeEntity parent = child.getParent();
//        List grandChildren = child.getChildren();
    }



    private static Entity addFlexState(final Schema schema) {
        Entity entity = addController(schema, "FlexState");

        entity.addDateProperty("date");
        entity.addDateProperty("dateFrom");
        entity.addDateProperty("dateTo");
        entity.addStringProperty("name");
        entity.addStringProperty("caption");
        entity.addStringProperty("code");
        entity.addStringProperty("json");
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

    private static Entity addPost(final Schema schema) {
        Entity post = schema.addEntity("Post");
        post.addIdProperty().primaryKey().autoincrement();
        post.addStringProperty("text").notNull();
        post.addIntProperty("value");

        return post;
    }


}
