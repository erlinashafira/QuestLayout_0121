package com.example.prak4.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import java.lang.reflect.Modifier

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            StringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            StringResource(id = R.string.univ),
            fontSize = 22.sp
        )

    }
}