package com.example.jitendra.contact;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


class secondadapter extends RecyclerView.Adapter<secondadapter.ViewHolder> {

    private List<String> items;
    private Context mcontext;

    secondadapter(Context context, List<String> items) {
        this.items = items;
        this.mcontext = context;

    }

    @Override
    public secondadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(secondadapter.ViewHolder holder, final int position) {
        final String s = items.get(position);
        StyleSpan b = new StyleSpan(android.graphics.Typeface.BOLD);

        if (position == 0) {
            holder.name1.setText(s);
            holder.name1.setTypeface(null, Typeface.BOLD);
            holder.name1.setGravity(Gravity.CENTER);
        } else if (position == 1) {
            SpannableStringBuilder sb1 = new SpannableStringBuilder("Mobile:  " + s);
            sb1.setSpan(b, 0, 7, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            holder.name1.setText(sb1);
        } else if (position == 2) {
            SpannableStringBuilder sb1 = new SpannableStringBuilder("Address: " + s);
            sb1.setSpan(b, 0, 8, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            holder.name1.setText(sb1);
        } else if (position == 3) {
            SpannableStringBuilder sb1 = new SpannableStringBuilder("Email: " + s);
            sb1.setSpan(b, 0, 6, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            holder.name1.setText(sb1);
        } else if (position == 4) {
            SpannableStringBuilder sb1 = new SpannableStringBuilder("Fax: " + s);
            sb1.setSpan(b, 0, 4, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            holder.name1.setText(sb1);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name1;


        ViewHolder(View itemView) {
            super(itemView);
            name1 = (TextView) itemView.findViewById(R.id.value);
        }
    }

}
