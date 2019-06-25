package rafaelpimenta.studio.com.kjogovelha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data_binding.*

class DataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding)

        val user = User("Rafael","Pimenta")

        tv_first_name.text = user.firstName
        tv_last_name.text = user.lastName

    }
}
