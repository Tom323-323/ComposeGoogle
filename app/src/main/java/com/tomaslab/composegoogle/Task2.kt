package com.tomaslab.composegoogle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tomaslab.composegoogle.ui.theme.ComposeGoogleTheme

class Task2: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeGoogleTheme() {
                Surface(color = MaterialTheme.colors.background) {
                    ActivityTask2(r1 = getString(R.string.r1),r2 = getString(R.string.r2))
                }
            }
        }
    }
}

@Composable
fun ActivityTask2(r1:String,r2:String){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.ic_task_completed)

       Image(painter = image, contentDescription = "image")

        Text(text = r1,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )

        Text(text = r2,
            fontSize = 16.sp,
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally))
    }
}

@Preview(showBackground = true)
@Composable
fun Activity2(){
    ComposeGoogleTheme() {
            ActivityTask2(r1 = stringResource(id = R.string.r1),
                          r2 = stringResource(id = R.string.r2))
    }
}