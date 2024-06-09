import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.udb.vetstabarbaraudb.R
import java.util.*

class CrearCita : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_appointment)

        // Spinner para seleccionar el paciente
        val spinnerPaciente: Spinner = findViewById(R.id.spinnerPaciente)
        val pacientes = arrayOf("Paciente 1", "Paciente 2", "Paciente 3")
        val adapterPaciente = ArrayAdapter(this, android.R.layout.simple_spinner_item, pacientes)
        spinnerPaciente.adapter = adapterPaciente

        // Spinner para seleccionar el doctor
        val spinnerDoctor: Spinner = findViewById(R.id.spinnerDoctor)
        val doctores = arrayOf("Doctor 1", "Doctor 2", "Doctor 3")
        val adapterDoctor = ArrayAdapter(this, android.R.layout.simple_spinner_item, doctores)
        spinnerDoctor.adapter = adapterDoctor

        // Botón para seleccionar la fecha
        val buttonFecha: Button = findViewById(R.id.buttonFecha)
        buttonFecha.setOnClickListener {
            seleccionarFecha()
        }
    }

    private fun seleccionarFecha() {
        val calendario = Calendar.getInstance()
        val año = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val día = calendario.get(Calendar.DAY_OF_MONTH)

        val datePicker = DatePickerDialog(
            this,
            { _, year, month, dayOfMonth ->
                val fechaSeleccionada = "$dayOfMonth/${month + 1}/$year"
                findViewById<TextView>(R.id.textViewFecha).text = fechaSeleccionada
            },
            año, mes, día
        )
        datePicker.show()
    }
}
