package com.example.practica10.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practica10.AccesorioActivity
import com.example.practica10.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val detalle: String = "lorem ipsum"
        var costo : String  =  "$175.00"
        var intent : Intent
        binding.imgAccesorio01.setOnClickListener{
            Toast.makeText(activity, "Gafas $600.00",Toast.LENGTH_LONG).show()
            costo  = "$600.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 1)
            startActivity(intent)
        }

        binding.imgAccesorio02.setOnClickListener{
            Toast.makeText(activity, "Producto 2 $600.00",Toast.LENGTH_LONG).show()
            costo  = "$700.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 2)
            startActivity(intent)
        }

        binding.imgAccesorio03.setOnClickListener{
            Toast.makeText(activity, "Producto 3",Toast.LENGTH_LONG).show()
            costo  = "$500.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 3)
            startActivity(intent)
        }

        binding.imgAccesorio04.setOnClickListener{
            Toast.makeText(activity, "Producto 4",Toast.LENGTH_LONG).show()
            costo  = "$900.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 4)
            startActivity(intent)
        }

        binding.imgAccesorio05.setOnClickListener{
            Toast.makeText(activity, "Producto 5",Toast.LENGTH_LONG).show()
            costo  = "$1000.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 5)
            startActivity(intent)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}