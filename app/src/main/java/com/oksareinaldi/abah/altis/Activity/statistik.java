package com.oksareinaldi.abah.altis.Activity;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.oksareinaldi.abah.altis.Activity.R;

import java.util.ArrayList;

public class statistik extends AppCompatActivity {
    BarChart chart;
    ArrayList<BarEntry> barEntries;
    ArrayList<String> barLabels;
    BarDataSet barDataSet;
    BarData barData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistik);

        chart = (BarChart) findViewById(R.id.chart);

        barEntries = new ArrayList<BarEntry>();
        barLabels = new ArrayList<String>();

        barLabels.add("");// index 0 kosongkan saja
        barEntries.add(new BarEntry(1, 70f));
        barLabels.add("Project A");
        barEntries.add(new BarEntry(2, 60f));
        barLabels.add("Project B");
        barEntries.add(new BarEntry(3, 30f));
        barLabels.add("Project C");

        barDataSet = new BarDataSet(barEntries, "Projects");

        barData = new BarData(barDataSet);
        chart.getXAxis().setValueFormatter(
                new IndexAxisValueFormatter(barLabels));

        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        chart.setData(barData);

        chart.animateY(3000);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
