package com.example.dishcraft.ui.theme

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView


class ItemSpacingDecoration(private val verticalSpaceHeight: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.bottom = verticalSpaceHeight
    }
}