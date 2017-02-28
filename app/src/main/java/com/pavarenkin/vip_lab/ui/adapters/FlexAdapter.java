package com.pavarenkin.vip_lab.ui.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pavarenkin.vip_lab.R;
import com.pavarenkin.vip_lab.db.Flex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий Паваренкин on 28.02.2017.
 */

public class FlexAdapter extends RecyclerView.Adapter<FlexAdapter.FlexViewHolder> {

    private FlexClickListener clickListener;
    private List<Flex> flexList = null;

    public interface FlexClickListener {
        void onClick(int position);
    }

    static class FlexViewHolder extends RecyclerView.ViewHolder {

        public TextView text;
        public TextView comment;

        public FlexViewHolder(View itemView, final FlexClickListener clickListener) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.textViewNoteText);
            comment = (TextView) itemView.findViewById(R.id.textViewNoteComment);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (clickListener != null) {
                        clickListener.onClick(getAdapterPosition());
                    }
                }
            });
        }
    }

    public FlexAdapter(FlexClickListener clickListener) {
        this.clickListener = clickListener;
        this.flexList = new ArrayList<>();
    }

    public void setFlexList(@NonNull List<Flex> flexList) {
        this.flexList = flexList;
        notifyDataSetChanged();
    }

    public Flex getFlex(int position) {
        return flexList.get(position);
    }

    public void addFlex(Flex flex) {
        flexList.add(flex);
    }

    @Override
    public FlexAdapter.FlexViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_note, parent, false);
        return new FlexAdapter.FlexViewHolder(view, clickListener);
    }

    @Override
    public void onBindViewHolder(FlexAdapter.FlexViewHolder holder, int position) {
        Flex flex = flexList.get(position);
        holder.text.setText(flex.getName());
        holder.comment.setText(flex.getCaption());
    }

    @Override
    public int getItemCount() {
        return flexList.size();
    }
}
