package com.woowahan.dctest

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.woowahan.dctest.theme.DesignSystemTestTheme

@Composable
fun ToastDemo() {
    val context = LocalContext.current

    DesignSystemTestTheme {
        Column(
            content = {
                Button(onClick = {
                    Toast.makeText(
                        context,
                        "Showing toast....",
                        Toast.LENGTH_LONG
                    ).show()
                }, content = {
                    Text(text = "Show Toast")
                })
            }, modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.primary),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
    }

}
