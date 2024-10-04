package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(
                        "",
                        "",
                        ""
                    )
                }
            }
        }
    }
}

@Composable
fun MyApp(name: String, message: String, intro: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = name,
            modifier = modifier
                .padding(all = 16.dp),
            fontSize = 24.sp
        )
        Text(
            text = message,
            modifier = modifier.padding(start =  16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = intro,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify

            )
    }
}

@Composable
fun AppImage(message: String, name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
   Image(
       painter = image,
       contentDescription = null
   )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyAppPreview() {
    LearnTogetherTheme {
        MyApp(
            stringResource(R.string.jetpack_compose_name),
            stringResource(R.string.message),
            stringResource(R.string.intro)
            )
    }
}