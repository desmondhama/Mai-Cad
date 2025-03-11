package com.nexera.maicad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nexera.maicad.ui.theme.MyComposeApplicationTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    TitleComposable()
                }
            }
        }
    }
}
@Composable
fun TitleComposable(modifier: Modifier = Modifier) {
    Column(
		
	) {
	    Image(
		painter = painterResource(id = R.drawable.im_android),
		contentDescription = null,
		modifier = Modifier.fillMaxSize(0.2f)
		)
		Text(
		text = stringResource(id = R.string.full_name),
		modifier = Modifier
			.padding(8.dp)
			.fillMaxWidth(),
		style = TextStyle(
		    fontWeight = FontWeight.Bold,
			fontSize = 24.sp
		    )
		)
		Text(
		text = stringResource(id = R.string.title),
		modifier = Modifier.fillMaxWidth(),
		style = TextStyle(
		    fontSize = 18.sp,
		    )
		) 
	}
}