package edu.ucne.primer_parcial.adaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.ucne.primer_parcial.R
import edu.ucne.primer_parcial.databinding.ItemListBinding
import edu.ucne.primer_parcial.models.Prestamos


class AdaptadorPersonas(private val dataSet: List<Prestamos>?) :
    RecyclerView.Adapter<AdaptadorPersonas.ViewHolder>() {




    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_list, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

       val item = dataSet?.get(position)
        viewHolder.enlazarItem(item!!)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet!!.size

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var binding = ItemListBinding.bind(view)
        var contexto = view.context

        fun enlazarItem(personal: Prestamos) {
            binding.tvNombre.text = "${personal.Nombre}, ${personal.Apellido}"
            binding.tvTelefono.text = personal.Telefono
            binding.tvCorreo.text = personal.Correo
            binding.tvOcupacion.text = personal.ocupacion

            //todo evento on click
        }

    }
}
