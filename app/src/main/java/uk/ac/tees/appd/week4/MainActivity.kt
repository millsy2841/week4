package uk.ac.tees.AppD.week4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.tooling.preview.Preview
import uk.ac.tees.appd.week4.ui.theme.Week4Theme

import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){}
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight = 116.sp,)
    Text(
        text = from,
        fontSize = 36.sp)
}
@Preview(showBackground = true)
@Composable
fun BCPreview() {
    Week4Theme {
        GreetingText(message = "Happy Birthday bro!", from = "From bro")
    }
}

//https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables part 8 next