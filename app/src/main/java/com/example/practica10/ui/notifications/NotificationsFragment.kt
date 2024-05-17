package com.example.practica10.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practica10.R
import com.example.practica10.databinding.FragmentNotificationsBinding
import java.util.Calendar

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private lateinit var btnGuardar: Button
    private lateinit var edtNombre: TextView


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        btnGuardar = root.findViewById(R.id.btnGuardar)
        btnGuardar.setOnClickListener {
            val iniciarFecha = Calendar.getInstance()
            val year = iniciarFecha.get(Calendar.YEAR)
            val month = iniciarFecha.get(Calendar.MONTH)
            val dayOfMonth = iniciarFecha.get(Calendar.DAY_OF_MONTH)
            val date = String.format("%04d-%02d-%02d", year, month + 1, dayOfMonth)
            edtNombre = root.findViewById(R.id.edtNombre)
            val nombre = edtNombre.text.toString()
            if(nombre.isEmpty()){
                Toast.makeText(activity, "Ingrese un nombre", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(activity, "Fecha ${date}", Toast.LENGTH_LONG).show()
                Toast.makeText(activity, "Nombre ${nombre}", Toast.LENGTH_LONG).show()
            }
        }

        val textView: TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}