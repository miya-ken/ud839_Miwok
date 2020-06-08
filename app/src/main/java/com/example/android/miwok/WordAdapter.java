package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.miwok.Word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    public WordAdapter(Context context, ArrayList<Word> pWords) {
        super(context,0, pWords);
    }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
    // Check if the existing view is being reused, otherwise inflate the view
    View listItemView = convertView;

    if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
    }
    Word my_word= (Word) getItem(position);
    TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
    miwokTextView.setText(my_word.getMiwokTranslation());
    TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
    defaultTextView.setText(my_word.getDefaultTranslation());

    return listItemView;
   //return super.getView(position, convertView, parent);
}

}