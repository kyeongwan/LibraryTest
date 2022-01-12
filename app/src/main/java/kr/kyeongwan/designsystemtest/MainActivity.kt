package kr.kyeongwan.designsystemtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.woowahan.dctest.ToastDemo
import com.woowahan.dctest.theme.DesignSystemTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignSystemTestTheme {
                // A surface container using the 'background' color from the theme
                Surface() {
                    Greeting("Android")
                    ToastDemo()
                }
            }
        }

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DesignSystemTestTheme {
        Greeting("Android")
    }
}