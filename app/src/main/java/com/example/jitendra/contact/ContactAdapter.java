package com.example.jitendra.contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;


class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private List<item> items;
    private Context mcontext;
    private List<contents> contentslist = new ArrayList<>();

    ContactAdapter(Context context, List<item> items) {
        this.items = items;
        this.mcontext = context;
        getting_data();

    }

    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactAdapter.ViewHolder holder, final int position) {
        final item s = items.get(position);
        holder.name1.setText(s.name);
        holder.number1.setText(s.number);
        Glide.with(mcontext).load(s.getId()).into(holder.image1);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contents c = contentslist.get(position);
                Intent i = new Intent();
                Bundle b = new Bundle();
                b.putParcelable("data", c);
                i.putExtras(b);
                i.setClass(mcontext, details.class);
                mcontext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void getting_data() {
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
        String na[] = {
                "Raju", "Shyam", "Rajendra", "Lokesh", "deep", "Rajesh", "Chiraj", "Shital", "Aishwarya", "Anand"
        };
        String nu[] = {
                "8967453874", "7276534973", "9840793462", "9804512123", "7823236766", "9809097658", "7413563456", "9845630090", "9908111453", "9876463862"
        };
        String add[] = {
                "123 6th St.Melbourne, FL 32904", "478 S. John Ave.Lake Jackson, TX 77566", "788 Peachtree DriveSan Pablo, CA 94806", "7445 Gartner Ave.Biloxi, MS 39532"
                , "76 Glen Creek Dr.Hope Mills, NC 28348", "187 Ann Dr.Shirley, NY 11967", "73 High Ridge Rd.Wadsworth, OH 44281", "828 Windfall Dr.Land O Lakes, FL 34639"
                , "924 Sage St.Canandaigua, NY 14424", "8775 West Trout Ave.Yakima, WA 98908"
        };

        String em[] = {
                "josephine_darakjy@darakjy.org", "art@venere.org", "lpaprocki@hotmail.com", "donette.foller@cox.net", "simona@morasca.com", "mitsue_tollner@yahoo.com",
                "leota@hotmail.com", "sage_wieser@cox.net", "kris@gmail.com", "minna_amigon@yahoo.com"
        };
        String fax[] = {
                "+1-202-555-0188", "+1-202-555-0147", "+1-202-555-0164", "+1-202-555-0194", "+1-202-555-0139", "+1-202-555-0158", "+1-202-555-5684", "+1-202-752-0458", "+1-202-124-4522"
                , "+1-202-234-786"
        };

        for (int i = 0; i < 10; i++) {
            contents a = new contents(na[i], nu[i], add[i], covers[i], em[i], fax[i]);
            contentslist.add(a);
        }

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name1;
        TextView number1;
        ImageView image1;


        ViewHolder(View itemView) {
            super(itemView);
            name1 = (TextView) itemView.findViewById(R.id.name);
            number1 = (TextView) itemView.findViewById(R.id.number);
            image1 = (ImageView) itemView.findViewById(R.id.image);
        }
    }

}
