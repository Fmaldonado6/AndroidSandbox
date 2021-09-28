package com.fmaldonado.sandbox

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fmaldonado.sandbox.databinding.ProjectItemBinding

class ProjectsAdapter(private val projects: List<Projects>) :
    RecyclerView.Adapter<ProjectsAdapter.ProjectsViewHolder>() {

    class ProjectsViewHolder(val binding: ProjectItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectsViewHolder {
        val binding = ProjectItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ProjectsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProjectsViewHolder, position: Int) {
        val project = projects[position]
        holder.binding.projectName.text = project.projectName
        holder.binding.projectCard.setOnClickListener {
            val context = it.context
            val intent = Intent(context, project.projectActivity)
            intent.putExtra(ParcelableKeys.ProjectName.name, project)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = projects.size

}