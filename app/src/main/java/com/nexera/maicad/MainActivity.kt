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
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF1FA8C) // Fixed Color syntax
                ) {
                    TitleComposable()
                    ContactInformation()
                }
            }
        }
    }
}

@Composable
fun TitleComposable() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
		    modifier = Modifier
			    .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp) // Fixed from fillMaxSize(0.2f)
                    .background(Color(0xFF1C1B1F)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.im_android),
                    contentDescription = null
                )
            }
            Text(
                text = stringResource(id = R.string.full_name),
                modifier = Modifier.padding(8.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
            )
            Text(
                text = stringResource(id = R.string.title),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Color(0xFF44BB66)
                )
            )
        }
    }
}

@Composable
fun ContactInformation() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .padding(12.dp)
                .align(Alignment.BottomCenter), // Fixed BoxScope issue
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
		val rowPadding = 4.dp
		val iconContactInfomationPadding = 8.dp
		    //Email address information
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
				.fillMaxWidth()
				.padding(rowPadding)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.im_email),
                    contentDescription = "Email Icon",
					modifier = Modifier.padding(iconContactInfomationPadding)
                )
                Text(
                    text = stringResource(id = R.string.email_address),
					modifier = Modifier.padding(iconContactInfomationPadding)
                )
            }
			//Phone number
			Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
				.fillMaxWidth()
				.padding(rowPadding)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.im_phone),
                    contentDescription = "phone Icon",
					modifier = Modifier.padding(iconContactInfomationPadding)
                )
                Text(
                    text = stringResource(id = R.string.phone_address),
					modifier = Modifier.padding(iconContactInfomationPadding)
                )
            }
			//Physical address
			Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
				.fillMaxWidth()
				.padding(rowPadding)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.im_location),
                    contentDescription = "location Icon",
					modifier = Modifier.padding(iconContactInfomationPadding)
                )
                Text(
                    text = stringResource(id = R.string.location_address),
					modifier = Modifier.padding(iconContactInfomationPadding)
                )
            }
        }
    }
}