package com.alik.table;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//import com.alik.table.ModelFragment.OnListFragmentInteractionListener;
import com.alik.table.model.Detail;
import com.alik.table.model.Model;

import java.util.List;


public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {

    private final List<Detail> items;
    //private final OnListFragmentInteractionListener mListener;

    public DetailAdapter(List<Detail> items){//}, OnListFragmentInteractionListener listener) {
        this.items = items;
    //    mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.detail_item, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.item = items.get( position );
        holder.detailModel.setText( items.get( position ).getModel() );
        holder.detailColor.setText( items.get( position ).getColor() );
        holder.detailDateOrder.setText( items.get( position ).getDateOrder() );
        holder.detailDateReady.setText( items.get( position ).getDateReady() );

//        holder.mView.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (null != mListener) {
//                    // Notify the active callbacks interface (the activity, if the
//                    // fragment is attached to one) that an item has been selected.
//                    mListener.onListFragmentInteraction( holder.item );
//                }
//            }
//        } );
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView detailModel;
        public final TextView detailColor;
        public final TextView detailDateOrder;
        public final TextView detailDateReady;
        public Detail item;

        public ViewHolder(View view) {
            super( view );
            this.view = view;
            detailModel = (TextView) view.findViewById( R.id.detailModel );
            detailColor = (TextView) view.findViewById( R.id.detailColor );
            detailDateOrder = (TextView) view.findViewById( R.id.detailDateOrder );
            detailDateReady = (TextView) view.findViewById( R.id.detailDateReady );
        }
//
//        @Override
//        public String toString() {
//            return super.toString() + " '" + mContentView.getText() + "'";
//        }
    }
}
