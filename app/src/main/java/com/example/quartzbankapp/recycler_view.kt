package com.example.quartzbankapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class recycler_view (private var list_buy:List<List_model>,
                     private var open_view:(buy:List_model)-> Unit):
    RecyclerView.Adapter<BuyListView>(){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuyListView {
        val view :View= LayoutInflater.from(parent.context).inflate(R.layout.view_list_buy, parent,false, )
        return BuyListView(view)
    }

    override fun getItemCount(): Int {
        return list_buy.size
    }

    override fun onBindViewHolder(holder: BuyListView, position: Int) {
        val view_list= list_buy[position]
        holder.bind(view_list,open_view)
    }


}

class BuyListView(item_view: View):RecyclerView.ViewHolder(item_view){

// val variavel da image view , variaveis dos dois text


    fun bind(item_task:List_model,open_view:(buy:List_model)-> Unit){

        //  invoca  a tela ,, pra quando tiver o click

    }
}