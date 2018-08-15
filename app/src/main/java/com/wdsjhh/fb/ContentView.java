package com.wdsjhh.fb;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.support.v7.widget.CardView;

public class ContentView extends CardView
{
    public ContentView(Context context,AttributeSet attr){
        super(context,attr);
        LayoutInflater.from(context).inflate(R.layout.contentview,this);
        
    }
}
