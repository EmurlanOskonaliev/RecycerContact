package com.example.recycerhw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

	private ArrayList<Contact> contact = new ArrayList<>();


	public ContactAdapter(ArrayList<Contact> contact) {
		this.contact = contact;
	}

	@NonNull
	@Override
	public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return new ContactViewHolder
			(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent, false));
	}

	@Override
	public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
holder.bind(contact.get(position));
	}

	@Override
	public int getItemCount() {
		return contact.size();
	}

	static class ContactViewHolder extends RecyclerView.ViewHolder {
		private TextView name, number;

		public ContactViewHolder(@NonNull View itemView) {
			super(itemView);
			name=itemView.findViewById(R.id.name);
			number=itemView.findViewById(R.id.person_number);
		}

		public void bind(Contact contact) {
			number.setText(contact.getNumber());
			name.setText(contact.getName());
		}
	}
}
