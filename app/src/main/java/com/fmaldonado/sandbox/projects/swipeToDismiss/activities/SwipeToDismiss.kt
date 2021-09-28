package com.fmaldonado.sandbox.projects.swipeToDismiss.activities

import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.fmaldonado.sandbox.projects.BaseActivity
import com.fmaldonado.sandbox.databinding.ActivitySwipeToDismissBinding
import com.fmaldonado.sandbox.projects.swipeToDismiss.adapters.SwipeDismissAdapter

class SwipeToDismiss : BaseActivity() {

    private lateinit var binding: ActivitySwipeToDismissBinding
    val list = mutableListOf<String>()
    val adapter = SwipeDismissAdapter(list)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipeToDismissBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
    }

    private fun setupRecycler() {
        for (i in 0..10) {
            list.add("Objeto $i")
        }
        binding.swipeList.adapter = adapter
        ItemTouchHelper(itemCallback).attachToRecyclerView(binding.swipeList)
    }

    private val itemCallback =
        object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {

                list.removeAt(viewHolder.adapterPosition)
                adapter.notifyItemRemoved(viewHolder.adapterPosition)

            }

        }


}