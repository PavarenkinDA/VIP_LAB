package com.pavarenkin.vip_lab.ui.activities;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ShareActionProvider;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.jakewharton.rxbinding.widget.RxTextView;
import com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEvent;

import com.pavarenkin.vip_lab.R;
import com.pavarenkin.vip_lab.app.C;
import com.pavarenkin.vip_lab.app.VIPApplication;
import com.pavarenkin.vip_lab.db.DaoSession;
import com.pavarenkin.vip_lab.db.Note;
import com.pavarenkin.vip_lab.db.NoteDao;
import com.pavarenkin.vip_lab.db.Post;
import com.pavarenkin.vip_lab.domain.DaoAdapter;
import com.pavarenkin.vip_lab.domain.enums.NoteType;
import com.pavarenkin.vip_lab.ui.fragments.MainFragment;
import com.pavarenkin.vip_lab.ui.fragments.MenuFragment;

import org.greenrobot.greendao.rx.RxDao;
import org.greenrobot.greendao.rx.RxQuery;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

public class MainActivity extends Activity {

//    private VIPApplication main;
//    private MainDatabase mainDatabase;
//    private ShareActionProvider shareActionProvider;
//
//    // Обслуживание дравера.
//    private Cursor drawerCursor;
//    private ListView drawerList;
//    private DrawerLayout drawerLayout;
//    private ActionBarDrawerToggle drawerToggle;
//
//    private class DrawerItemClickListener implements ListView.OnItemClickListener {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            main.setDrawerId(id);
//            main.setDrawerPosition(position);
//            drawerChange(view, position, id);
//        }
//    }
//
//    ;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        // Настройка связи с макетом активности.
//        setContentView(R.layout.activity_main);
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
//        drawerList = (ListView) findViewById(R.id.drawerList);
//        drawerList.setOnItemClickListener(new DrawerItemClickListener());
//        main = (VIPApplication) getApplication();
//
//        setUpViews();
//
//        // get the Rx variant of the note DAO
//        DaoSession daoSession = ((VIPApplication) getApplication()).getDaoSession();
//        noteDao = daoSession.getNoteDao().rx();
//
//        // query all notes, sorted a-z by their text
//        notesQuery = daoSession.getNoteDao().queryBuilder().orderAsc(NoteDao.Properties.Text).rx();
//        updateNotes();
//
//        // Установка адаптера для списка главного меню.
//        try {
//            mainDatabase = main.getMainDatabase();
//            drawerCursor = mainDatabase.getDrawer(C.DB.NO_PARENT);
//            CursorAdapter cursorAdapter = new SimpleCursorAdapter(
//                    MainActivity.this,
//                    R.layout.item_drawer,
//                    drawerCursor,
//                    C.MENU.DRAWER_VIEW,
//                    new int[]{android.R.id.text1, android.R.id.icon},
//                    0);
//            drawerList.setAdapter(cursorAdapter);
//        } catch (SQLiteException e) {
//            Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT).show();
//        }
//
//        //Display the correct fragment.
//        if (savedInstanceState != null) {
//            setActionBarTitle();
//        } else {
//            drawerChange(null, main.getDrawerPosition(), main.getDrawerId());
//        }
//        //Create the ActionBarDrawerToggle
//        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_drawer, R.string.close_drawer) {
//            //Called when a drawer has settled in a completely closed state
//            @Override
//            public void onDrawerClosed(View view) {
//                super.onDrawerClosed(view);
//                invalidateOptionsMenu();
//            }
//
//            //Called when a drawer has settled in a completely open state.
//            @Override
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//                invalidateOptionsMenu();
//            }
//        };
//        drawerLayout.setDrawerListener(drawerToggle);
//
//        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
//            getActionBar().setDisplayHomeAsUpEnabled(true);
//            getActionBar().setHomeButtonEnabled(true);
//        }
//        getFragmentManager().addOnBackStackChangedListener(
//                new FragmentManager.OnBackStackChangedListener() {
//                    public void onBackStackChanged() {
//                        FragmentManager fragMan = getFragmentManager();
//                        Fragment fragment = fragMan.findFragmentByTag("frameLayout");
//                        if (fragment instanceof MainFragment) {
//
//                        }
//                        if (fragment instanceof MenuFragment) {
//
//                        }
//                        setActionBarTitle();
//                        drawerList.setItemChecked(main.getDrawerPosition(), true);
//                    }
//                }
//        );
//    }
//
//
//    private void drawerChange(View view, int position, long id) {
//        int kind = 0;
//        try {
//            if (drawerCursor.moveToPosition(position)) {
//                kind = drawerCursor.getInt(drawerCursor.getColumnIndexOrThrow(C.MENU.KIND));
//            }
//        } catch (SQLiteException e) {
//            Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT).show();
//        }
//        Fragment fragment;
//
//        switch (kind) {
//            case 0:
//                fragment = new MainFragment();
//                break;
//            case 1:
//                fragment = new MenuFragment();
//                break;
//            default:
//                fragment = new MenuFragment();
//                break;
//        }
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.replace(R.id.frameLayout, fragment, "frameLayout");
//        ft.addToBackStack(null);
//        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//        ft.commit();
//        //Set the action bar title
//        setActionBarTitle();
//        //Close drawer
//        drawerLayout.closeDrawer(drawerList);
//        Toast.makeText(this, String.valueOf(position) + " " + String.valueOf(id), Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        drawerCursor.close();
//    }
//
//    public void onRestart() {
//        super.onRestart();
//        try {
//            Cursor cursor = mainDatabase.getDrawer(C.DB.NO_PARENT);
//            CursorAdapter adapter = (CursorAdapter) drawerList.getAdapter();
//            adapter.changeCursor(cursor);
//            drawerCursor = cursor;
//        } catch (SQLiteException e) {
//            Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private void setActionBarTitle() {
//        String title = getResources().getString(R.string.app_name);
//
//        try {
//            Cursor cursor = mainDatabase.getDrawerSelect(main.getDrawerId());
//            if (cursor.moveToFirst()) {
//                title = cursor.getString(cursor.getColumnIndexOrThrow(C.MENU.NAME));
//            }
//        } catch (SQLiteException e) {
//            Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT).show();
//        }
//        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
//            getActionBar().setTitle(title);
//        }
//
//    }
//
//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        // Настойка заголовка при открытии/закрытии дравера.
//        boolean drawerOpen = drawerLayout.isDrawerOpen(drawerList);
//        menu.findItem(R.id.action_share).setVisible(!drawerOpen);
//        return super.onPrepareOptionsMenu(menu);
//    }
//
//    @Override
//    protected void onPostCreate(Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
//            // Синхронизация состояния дравера.
//            drawerToggle.syncState();
//        }
//    }
//
//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        // Конфигурация дравера изменилась.
//        drawerToggle.onConfigurationChanged(newConfig);
//    }
//
//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        MenuItem menuItem = menu.findItem(R.id.action_share);
//        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
//        setIntent("This is example text");
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    private void setIntent(String text) {
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT, text);
//        shareActionProvider.setShareIntent(intent);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (drawerToggle.onOptionsItemSelected(item)) {
//            return true;
//        }
//        switch (item.getItemId()) {
//            case R.id.action_create_order:
//                //Code to run when the Create Order item is clicked
//                Intent intent = new Intent(this, TestActivity.class);
//                startActivity(intent);
////            overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
//                return true;
//            case R.id.action_settings:
//                intent = new Intent(this, TestActivity.class);
//                startActivity(intent);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//
//    private void updateNotes() {
//        notesQuery.list()
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<List<Note>>() {
//                    @Override
//                    public void call(List<Note> notes) {
//                        notesAdapter.setNotes(notes);
//                    }
//                });
//    }
}
