package com.pavarenkin.vip_lab.ui.activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ShareActionProvider;
import android.widget.Toast;


import com.pavarenkin.vip_lab.R;
import com.pavarenkin.vip_lab.app.C;
import com.pavarenkin.vip_lab.app.VIPApplication;
import com.pavarenkin.vip_lab.db.DaoSession;
import com.pavarenkin.vip_lab.db.Flex;
import com.pavarenkin.vip_lab.db.FlexDao;
import com.pavarenkin.vip_lab.ui.adapters.FlexAdapter;
import com.pavarenkin.vip_lab.ui.fragments.MainFragment;
import com.pavarenkin.vip_lab.ui.fragments.MenuFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.greendao.rx.RxDao;
import org.greenrobot.greendao.rx.RxQuery;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    private VIPApplication main = null;
    private EventBus eventBus = EventBus.getDefault();
    private ShareActionProvider shareActionProvider;

    // Обслуживание дравера.
    private RecyclerView drawerList;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;


    private FlexAdapter flexAdapter;
    private RxQuery<Flex> flexQuery;
    private RxDao<Flex, Long> flexDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = (VIPApplication) getApplication();

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action",
//                        Snackbar.LENGTH_LONG).setAction("Action", null).show();
//            }
//        });

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        // Настройка связи с макетом активности.
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
//        drawerList = (RecyclerView) findViewById(R.id.drawerList);
////        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        drawerList.setHasFixedSize(true);
//        drawerList.setLayoutManager(new LinearLayoutManager(this));
//        flexAdapter = new FlexAdapter(new FlexAdapter.FlexClickListener() {
//            @Override
//            public void onClick(int position) {
//                Flex flex = flexAdapter.getFlex(position);
//                final Long noteId = flex.getId();
//                updateAdapter();
//                main.setDrawerId(noteId);
//                main.setDrawerPosition(position);
//                drawerChange(position, noteId);
//            }
//        });

//        drawerList.setAdapter(flexAdapter);
//        DaoSession daoSession = main.getDaoSession();
//        flexDao = daoSession.getFlexDao().rx();
//        flexQuery = daoSession.getFlexDao().queryBuilder().orderAsc(FlexDao.Properties.Id).rx();
        //updateAdapter();

        //Display the correct fragment.
//        if (savedInstanceState != null) {
//            setActionBarTitle();
//        } else {
//            drawerChange(main.getDrawerPosition(), main.getDrawerId());
//        }
//        //Create the ActionBarDrawerToggle
//        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_drawer, R.string.close_drawer) {
//            //Called when a drawer has settled in a completely closed state
//            @Override
//            public void onDrawerClosed(View view) {
//                super.onDrawerClosed(view);
//            //    invalidateOptionsMenu();
//            }
//
//            //Called when a drawer has settled in a completely open state.
//            @Override
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//             //   invalidateOptionsMenu();
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
//                    }
//                }
//        );


    }

    private void drawerChange(int position, long id) {
//        Fragment fragment = null;
//        Flex flex = flexAdapter.getFlex(position);
//        if (flex != null) switch (flex.getAction()) {
//            case MAIN_MENU:
//                fragment = new MainFragment();
//                break;
//            case MAIN_LIST:
//                fragment = new MenuFragment();
//                break;
//            default:
//                fragment = new MenuFragment();
//                break;
//        }
//        if (fragment == null) return;
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
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void onRestart() {
        super.onRestart();
      //  updateAdapter();
    }

    private void setActionBarTitle() {
//        String title = getResources().getString(R.string.app_name);
//
////        try {
////            Cursor cursor = mainDatabase.getDrawerSelect(main.getDrawerId());
////            if (cursor.moveToFirst()) {
////                title = cursor.getString(cursor.getColumnIndexOrThrow(C.MENU.NAME));
////            }
////        } catch (SQLiteException e) {
////            Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT).show();
////        }
//        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
//            getActionBar().setTitle(title);
//        }

    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // Настойка заголовка при открытии/закрытии дравера.
//        boolean drawerOpen = drawerLayout.isDrawerOpen(drawerList);
//        menu.findItem(R.id.action_share).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
            // Синхронизация состояния дравера.
//            drawerToggle.syncState();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Конфигурация дравера изменилась.
  //      drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        MenuItem menuItem = menu.findItem(R.id.action_share);
//        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
//        setIntent("Share provider");
        return super.onCreateOptionsMenu(menu);
    }

    private void setIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
                return super.onOptionsItemSelected(item);
//        }
    }

    private void updateAdapter() {
//        flexQuery.list()
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<List<Flex>>() {
//                    @Override
//                    public void call(List<Flex> flexList) {
//                        flexAdapter.setFlexList(flexList);
//                    }
//                });
    }

    private void addFlex() {

//        Flex flex = new Flex(null, 1, R.drawable.promobot, "PROMO-BOT", null, 0, 0, 0, "", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, "", null);
//        flexDao.insert(flex)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<Flex>() {
//                    @Override
//                    public void call(Flex flex) {
//                        Log.d("DaoExample", "Inserted new note, ID: " + flex.getId());
//                        updateAdapter();
//                    }
//                });
    }


    @Override
    public void onStart() {
        super.onStart();
        eventBus.register(this);
    }

    @Override
    public void onStop() {
        eventBus.unregister(this);
        super.onStop();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(Object event) {
    //    Toast.makeText(getActivity(), event.message, Toast.LENGTH_SHORT).show();
    }


}
