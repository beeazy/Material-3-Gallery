 package com.eazybytes.material3practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.eazybytes.material3practice.ui.theme.Material3PracTheme

 @ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3PracTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Scaffold(
                        topBar = {
                            MediumTopAppBar(
                                title = {
                                    Text(text = "Home")
                                },
                                colors = TopAppBarDefaults.mediumTopAppBarColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                                    titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                ),
                            )
                        }
                    ) { values ->
                        LazyColumn(contentPadding = values) {
                            items(20) {
                                ImageCard(title = "Lorem Ipsum", description = "Ipsum Lorem Ipsum", modifier = Modifier.padding(16.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}