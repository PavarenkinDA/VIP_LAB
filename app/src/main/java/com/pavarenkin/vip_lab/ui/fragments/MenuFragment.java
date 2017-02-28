package com.pavarenkin.vip_lab.ui.fragments;

import android.app.ListFragment;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.pavarenkin.vip_lab.app.C;
import com.pavarenkin.vip_lab.app.VIPApplication;
import com.pavarenkin.vip_lab.ui.activities.TestActivity;

public class MenuFragment extends ListFragment {
    private VIPApplication main;

    public LayoutAnimationController createAnimation() {
        AnimationSet set = new AnimationSet(true);
        Animation animation;
        animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, -1.0f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        animation.setDuration(300);
        set.addAnimation(animation);
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(500);
        set.addAnimation(animation);
        return new LayoutAnimationController(set, 0.5f);
    }

    public void reload() {
        getListView().setLayoutAnimation(createAnimation());
//        try {
//            Cursor cursor = mainDatabase.getDrawer(main.getDrawerId());
//            CursorAdapter adapter = (CursorAdapter) getListView().getAdapter();
//            adapter.changeCursor(cursor);
//            drawerCursor = cursor;
//        } catch(SQLiteException e) {
//            Toast toast = Toast.makeText(getActivity(), "Database unavailable", Toast.LENGTH_SHORT);
//            toast.show();
//        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            main = (VIPApplication) getActivity().getApplication();
//            mainDatabase = main.getMainDatabase();
//            drawerCursor = mainDatabase.getDrawer(main.getDrawerId());
//            CursorAdapter cursorAdapter = new SimpleCursorAdapter(
//                    getActivity(),
//                    R.layout.fragment_menu_item,
//                    drawerCursor,
//                    C.MENU.DRAWER_VIEW,
//                    new int[]{android.R.id.text1, android.R.id.icon},
//                    0);
//            setListAdapter(cursorAdapter);
        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(getActivity(), "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
//        drawerCursor.close();
    }

    @Override
    public void onStart() {
        super.onStart();
        reload();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {

        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(getActivity(), "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        int kind = 0;
//        if (drawerCursor.moveToPosition(position)) {
//            kind = drawerCursor.getInt(drawerCursor.getColumnIndexOrThrow(C.MENU.KIND));
//        }
        if (kind == 3) {
            main.setDrawerId(id);
            reload();
        } else {
            main.setMenuId(id);
            Intent intent = new Intent(getActivity(), TestActivity.class);
            startActivity(intent);
        }
    }
}
