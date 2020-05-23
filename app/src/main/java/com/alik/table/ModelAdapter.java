package com.alik.table;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//import com.alik.table.ModelFragment.OnListFragmentInteractionListener;
import com.alik.table.model.Model;

import java.util.List;


public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder> {

    private final List<Model> items;
    //private final OnListFragmentInteractionListener mListener;

    public ModelAdapter(List<Model> items){//}, OnListFragmentInteractionListener listener) {
        this.items = items;
    //    mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.model_item, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.item = items.get( position );
        holder.modelName.setText( items.get( position ).getName() );
        holder.modelCount.setText( items.get( position ).getCount() );

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
        public final TextView modelName;
        public final TextView modelCount;
        public Model item;

        public ViewHolder(View view) {
            super( view );
            this.view = view;
            modelName = (TextView) view.findViewById( R.id.modelName );
            modelCount = (TextView) view.findViewById( R.id.modelCount );
        }
//
//        @Override
//        public String toString() {
//            return super.toString() + " '" + mContentView.getText() + "'";
//        }
    }
}
