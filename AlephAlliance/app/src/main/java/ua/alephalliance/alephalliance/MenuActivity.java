package ua.alephalliance.alephalliance;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends Activity implements View.OnClickListener{

    private Toolbar toolbar;
    private Button modelsBtn;
    private Button memoriesBtn;
    private Button colorsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        initToolbar();


        modelsBtn = (Button)findViewById(R.id.model_button);
        modelsBtn.setOnClickListener(this);
        memoriesBtn = (Button)findViewById(R.id.memory_button);
        memoriesBtn.setOnClickListener(this);
        colorsBtn = (Button)findViewById(R.id.color_button);
        colorsBtn.setOnClickListener(this);

    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.model_button:
            {
                Intent intent = new Intent(this, ModelsListActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.memory_button:
            {
                Intent intent = new Intent(this, MemoryListActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.color_button:
            {
                Intent intent = new Intent(this, ColorListActivity.class);
                startActivity(intent);
                break;
            }
            default: {
                break;
            }
        }
    }
}
