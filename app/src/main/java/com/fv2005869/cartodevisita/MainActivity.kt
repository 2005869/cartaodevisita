package com.fv2005869.cartodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fv2005869.cartodevisita.ui.theme.CartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                            .background(Color(255,196,126,100)),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Espacamento()
                        DadosPessoais()
                        Contatos("19 99999 9999",
                            "#dapascoa",
                            "coelhinho@dapascoa.com")
                    }
                }
            }
        }
    }
}

@Composable
fun DadosPessoais(modifier: Modifier = Modifier){
    Column(
    verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.coelhinho),
            contentDescription = null,
            modifier = modifier.height(100.dp).border(4.dp, Color.Black),
        )
        Text(
            text = "Coelhinho da Pascoa",
            fontSize = 22.sp,
        )
        Text(
            text = "Distribuidor de Ovos de Pascoa",
            fontSize = 20.sp
        )
    }
}



@Composable
fun Contatos(telefone: String, redeSocial: String, email: String, modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        val espacamento:String = "    "

        Row{
            Image(
                painter = painterResource(id = R.drawable.baseline_phone_24),
                contentDescription = null
            )
            Text(text = espacamento)
            Text(
                text = telefone
            )
        }

        Row{
            Image(
                painter = painterResource(id = R.drawable.baseline_mobile_screen_share_24),
                contentDescription = null
            )
            Text(text = espacamento)
            Text (
                text = redeSocial
            )
        }
        Row{
            Image(
                painter = painterResource(id = R.drawable.baseline_mail_outline_24),
                contentDescription = null
            )
            Text(text = espacamento)
            Text(
                text = email
            )
        }
        Row{
            Text(text = "\n")
        }

    }
}

@Composable
fun Espacamento(){
    Spacer(modifier = Modifier.fillMaxWidth())
}

@Preview(showBackground = true)
@Composable
fun CartaoDeVisitasPreview() {
    CartãoDeVisitaTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(255,196,126,100)),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Espacamento()
            DadosPessoais()
            Contatos("19 99999 9999",
                "#dapascoa",
                "coelhinho@dapascoa.com")
        }

    }

}

