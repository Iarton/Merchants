package brasil.airton.teamscore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var couroA=0
        btn10A.setOnClickListener(){
            couroA=couroA+10
           ouroA.setText("$couroA")
        }
        btn5A.setOnClickListener(){
            couroA=couroA+5
            ouroA.setText("$couroA")
        }
        btn1A.setOnClickListener(){
            couroA=couroA+1
            ouroA.setText("$couroA")
        }
        var couroB=0
        btn10B.setOnClickListener(){
            couroB=couroB+10
            ouroB.setText("$couroB")
        }
        btn5B.setOnClickListener(){
            couroB=couroB+5
            ouroB.setText("$couroB")
        }
        btn1B.setOnClickListener(){
            couroB=couroB+1
            ouroB.setText("$couroB")
        }
        btnLmp.setOnClickListener(){
            couroA=0
            couroB=0
            ouroA.setText("$couroA")
            ouroB.setText("$couroB")
            Produtos.setText("")
        }
        btnProd.setOnClickListener(){
            var Prod = editText.text.toString()
            var quan = Qt.text.toString()
            if (Prod.equals("") or quan.equals("")){
                Toast.makeText(this, "Necessario colocar Produto E Quantidade", Toast.LENGTH_SHORT).show()
            }else {
                var ListProd = Produtos.text.toString()
                var pl = "\n"
                Toast.makeText(this, "$Prod $quan", Toast.LENGTH_SHORT).show()
                Produtos.setText("$ListProd $pl Produto = $Prod | Qnt = $quan")
            }
        }
    }
}
