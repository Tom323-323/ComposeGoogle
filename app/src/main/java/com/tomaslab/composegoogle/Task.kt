package com.tomaslab.composegoogle

import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tomaslab.composegoogle.ui.theme.ComposeGoogleTheme

class Task: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeGoogleTheme() {
                Surface(color = MaterialTheme.colors.background) {
                    ActivityTask(n1 = getString(R.string.n1),
                                 n2 = getString(R.string.n2),
                                 n3 = getString(R.string.n3))
                }
            }
        }
    }
}

@Composable
fun ActivityTask(n1: String, n2: String, n3: String){
    Column{
        val img = painterResource(id = R.drawable.bg_compose_background)

        Image(painter = img,
            contentDescription = "image",
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = n1,
            fontSize = 24.sp,

            modifier = Modifier.padding(16.dp)
        )

        Text(text = n2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )

        Text(text = n3,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true, name = "Task")
@Composable
fun Show() {
    ComposeGoogleTheme {
        ActivityTask(n1 = stringResource(id = R.string.n1),
            n2 = stringResource(id = R.string.n2),
            n3 = stringResource(id = R.string.n3))
    }
}