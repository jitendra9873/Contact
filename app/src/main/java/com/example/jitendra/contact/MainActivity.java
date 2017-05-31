package com.example.jitendra.contact;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String na[] = {
                "Raju", "Shyam", "Rajendra", "Lokesh", "deep", "Rajesh", "Chiraj", "Shital", "Aishwarya", "Anand"
        };
        String nu[] = {
                "8967453874", "7276534973", "9840793462", "9804512123", "7823236766", "9809097658", "7413563456", "9845630090", "9908111453", "9876463862"
        };

        int[] covers = new int[]{
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j
        };
        final ArrayList<item> item_lists = new ArrayList<item>();
        for (int i = 0; i < 10; i++) {
            item_lists.add(new item(na[i], nu[i], covers[i]));
        }

        RecyclerView rv = (RecyclerView) findViewById(R.id.contact_list);
        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.addItemDecoration(new SpacingDecoration(4));
        rv.setAdapter(new ContactAdapter(this, item_lists));


    }

    private static class SpacingDecoration extends RecyclerView.ItemDecoration {
        private int spacing;

        SpacingDecoration(int spacing) {
            this.spacing = spacing;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                                   RecyclerView.State state) {
            outRect.bottom = spacing;
            outRect.top = spacing;

        }
    }


}
