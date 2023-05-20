package com.example.acividadboton.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.acividadboton.modelo.Planeta
import com.squareup.picasso.Picasso

class RecyclerFlightAdapter(
    private val listPlanets: List<Planeta>,
   // private val flightListener: RecyclerFlight
) : RecyclerView.Adapter<RecyclerFlightAdapter.ViewHolderPlanet>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPlanet {

        val inflater = LayoutInflater.from(parent.context)
       // val binding = ItemFlightLayoutBinding.inflate(inflater,parent,false)

      //  return ViewHolderFlight(binding)

    }

    override fun getItemCount(): Int = listPlanets.size

    override fun onBindViewHolder(holder: ViewHolderPlanet, position: Int) {

        val planet = listPlanets[position]
        holder.bind(planet)
    }

    inner class ViewHolderPlanet(private val binding: ItemFlightLayoutBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(planeta: Planeta){
//
//            binding.txtCity.text = flight.ciudad
//            Picasso.get().load(flight.imagen).fit().into(binding.cityImage)
//            binding.root.setOnClickListener { flightListener.onClick(flight,adapterPosition) }
//            binding.btnDelete.setOnClickListener { flightListener.onDelete(flight,adapterPosition) }

        }

    }

}
