package com.example.randomuser.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.randomuser.R;
import com.example.randomuser.model.User;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

      private List<User> userList;
//
//    public void atualizarUsers(List<User> userList) {
//        this.userList = userList;
//        notifyDataSetChanged();
//    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_cell, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        User user = userList.get(position);
        holder.setupUser(user);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private SwipeRefreshLayout swipeRefreshLayout;
        private ImageView foto;
        private TextView nome;
        private TextView email;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foto = itemView.findViewById(R.id.civ_id);
            nome = itemView.findViewById(R.id.name_text_view_id);
            email = itemView.findViewById(R.id.email_text_view_id);
        }

        public void setupUser(User user) {

            nome.setText(user.getName().getFirst());
            email.setText(user.getEmail());
            Picasso.get()
                    .load(user.getImage().getLarge())
                    .into(foto);

        }
    }
}
