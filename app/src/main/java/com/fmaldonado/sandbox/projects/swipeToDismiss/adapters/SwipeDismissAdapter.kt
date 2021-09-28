package com.fmaldonado.sandbox.projects.swipeToDismiss.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fmaldonado.sandbox.databinding.ProjectItemBinding

class SwipeDismissAdapter(val list: List<String>) :
    RecyclerView.Adapter<SwipeDismissAdapter.SwipeDismissViewHolder>() {

    class SwipeDismissViewHolder(val binding: ProjectItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwipeDismissViewHolder {
        val binding = ProjectItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return SwipeDismissViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SwipeDismissViewHolder, position: Int) {
        holder.binding.projectName.text = list[position]
    }

    override fun getItemCount(): Int = list.size


}