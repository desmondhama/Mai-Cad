// Package declaration for the application
package com.nexera.maicad

// Importing necessary Android and Compose libraries
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

/**
 * MainActivity is the entry point of the application.
 * It sets up the UI using Jetpack Compose.
 */
class MainActivity : ComponentActivity() {
    /**
     * Called when the activity is created.
     * Sets up the Compose UI and applies the app's theme.
     *
     * @param savedInstanceState The saved instance state of the activity.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content of the activity using Jetpack Compose
        setContent {
            // Apply the app's theme
            MyComposeApplicationTheme {
                // A surface container that uses the background color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), // Fill the entire screen
                    color = Color(0xFFF1FA8C) // Fixed Color syntax (background color)
                ) {
                    // Display the TitleComposable and ContactInformation composables
                    TitleComposable()
                    ContactInformation()
                }
            }
        }
    }
}

/**
 * TitleComposable is a composable function that displays the app's title,
 * an image, and a subtitle.
 */
@Composable
fun TitleComposable() {
    // Create a Box to hold the content
    Box(
        modifier = Modifier.fillMaxSize() // Fill the entire available space
    ) {
        // Create a Column to arrange content vertically
        Column(
            modifier = Modifier
                .fillMaxSize(), // Fill the entire available space
            horizontalAlignment = Alignment.CenterHorizontally, // Center content horizontally
            verticalArrangement = Arrangement.Center // Center content vertically
        ) {
            // Create a Box to hold the image with a background color
            Box(
                modifier = Modifier
                    .size(80.dp) // Fixed from fillMaxSize(0.2f) (set a fixed size)
                    .background(Color(0xFF1C1B1F)), // Set the background color
                contentAlignment = Alignment.Center // Center the content inside the Box
            ) {
                // Display the image
                Image(
                    painter = painterResource(id = R.drawable.im_android), // Load the image from resources
                    contentDescription = null // No description for accessibility (not recommended for production)
                )
            }
            // Display the full name text
            Text(
                text = stringResource(id = R.string.full_name), // Load the full name from resources
                modifier = Modifier.padding(8.dp), // Add padding around the text
                style = TextStyle(
                    fontWeight = FontWeight.Bold, // Set the font weight to bold
                    fontSize = 28.sp // Set the font size
                )
            )
            // Display the title text
            Text(
                text = stringResource(id = R.string.title), // Load the title from resources
                style = TextStyle(
                    fontWeight = FontWeight.Bold, // Set the font weight to bold
                    fontSize = 12.sp, // Set the font size
                    color = Color(0xFF44BB66) // Set the text color
                )
            )
        }
    }
}

/**
 * ContactInformation is a composable function that displays contact information,
 * including email, phone number, and physical address.
 */
@Composable
fun ContactInformation() {
    // Create a Box to hold the content
    Box(
        modifier = Modifier.fillMaxSize() // Fill the entire available space
    ) {
        // Create a Column to arrange content vertically
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f) // Set the width to 90% of the available space
                .padding(12.dp) // Add padding around the Column
                .align(Alignment.BottomCenter), // Fixed BoxScope issue (align to the bottom center)
            horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
        ) {
            // Define padding values for rows and icons
            val rowPadding = 4.dp
            val iconContactInfomationPadding = 8.dp

            // Email address information
            Row(
                horizontalArrangement = Arrangement.Start, // Align content to the start (left)
                modifier = Modifier
                    .fillMaxWidth() // Fill the entire width
                    .padding(rowPadding) // Add padding around the Row
            ) {
                // Display the email icon
                Image(
                    painter = painterResource(id = R.drawable.im_email), // Load the email icon from resources
                    contentDescription = "Email Icon", // Description for accessibility
                    modifier = Modifier.padding(iconContactInfomationPadding) // Add padding around the icon
                )
                // Display the email address text
                Text(
                    text = stringResource(id = R.string.email_address), // Load the email address from resources
                    modifier = Modifier.padding(iconContactInfomationPadding) // Add padding around the text
                )
            }

            // Phone number information
            Row(
                horizontalArrangement = Arrangement.Start, // Align content to the start (left)
                modifier = Modifier
                    .fillMaxWidth() // Fill the entire width
                    .padding(rowPadding) // Add padding around the Row
            ) {
                // Display the phone icon
                Image(
                    painter = painterResource(id = R.drawable.im_phone), // Load the phone icon from resources
                    contentDescription = "phone Icon", // Description for accessibility
                    modifier = Modifier.padding(iconContactInfomationPadding) // Add padding around the icon
                )
                // Display the phone number text
                Text(
                    text = stringResource(id = R.string.phone_address), // Load the phone number from resources
                    modifier = Modifier.padding(iconContactInfomationPadding) // Add padding around the text
                )
            }

            // Physical address information
            Row(
                horizontalArrangement = Arrangement.Start, // Align content to the start (left)
                modifier = Modifier
                    .fillMaxWidth() // Fill the entire width
                    .padding(rowPadding) // Add padding around the Row
            ) {
                // Display the location icon
                Image(
                    painter = painterResource(id = R.drawable.im_location), // Load the location icon from resources
                    contentDescription = "location Icon", // Description for accessibility
                    modifier = Modifier.padding(iconContactInfomationPadding) // Add padding around the icon
                )
                // Display the physical address text
                Text(
                    text = stringResource(id = R.string.location_address), // Load the physical address from resources
                    modifier = Modifier.padding(iconContactInfomationPadding) // Add padding around the text
                )
            }
        }
    }
}