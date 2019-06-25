package rafaelpimenta.studio.com.kjogovelha

import android.app.Activity
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DataBindingDinamicoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding_dinamico)
        /*
 * Busque colocar o código de acesso a classe binding
 * gerada, aqui a classe ActivityMainBinding, exatamente
 * aonde estava o código de vinculo de layout,
 * setContentView(R.layout.activity_main), pois assim é
 * possível manter códigos de acesso a Views que ainda
 * não foram (ou não serão) atualizados para a sintaxe
 * Data Binding em XML.
 *
     val binding = DataBindingUtil
         .setContentView<ActivityMainBinding>(this,R.layout.activity_data_binding_dinamico)
*/
        val user = User("Rafael","Eduardo")

//        binding.user = user
    }
}

//class ActivityMainBinding : ViewDataBinding() {
//
//}
