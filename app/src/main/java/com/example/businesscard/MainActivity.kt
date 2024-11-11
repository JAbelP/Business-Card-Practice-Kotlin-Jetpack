package com.example.businesscard

import android.graphics.Color.green
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.sharp.Call
import androidx.compose.material.icons.sharp.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Horizontal
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Greeting(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize().background(color = Color(0xFFa7d1a7)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.weight(1f))
        TopHalf()
        Spacer(modifier = Modifier.weight(1f))
        BottomHalf()

    }

}

@Composable
fun TopHalf(modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box(modifier = Modifier.background(color = Color.DarkGray)) {
            Image(
                image, null, modifier = Modifier.size(
                    160.dp
                )
            )
        }
        Spacer(modifier.size(20.dp))
        Text(
            "Abel Pinales",
            fontSize = 25.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.End
        )
        Text(
            "Super Android Developer-jin",
            fontSize = 15.sp,
            color = Color(0xFF28A428),
            fontWeight = FontWeight.Bold
        )
    }


}


@Composable
fun BottomHalf(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(bottom = 106.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(Icons.Sharp.Call, null,modifier = Modifier.weight(1f))
            Text("Call Me",modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(Icons.Sharp.Call, null,modifier = Modifier.weight(1f))
            Text("Call Me",modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(Icons.Sharp.Email, null,modifier = Modifier.weight(1f))
            Text("Email@Domain.com",modifier = Modifier.weight(1f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting()
    }
}