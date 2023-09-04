package com.example.lab1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun FactBox(randomFactsAboutMe: List<String>) {
    Box(
        Modifier
            .padding(30.dp)
            .width(300.dp)
            .height(300.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(MaterialTheme.colorScheme.inversePrimary),
        contentAlignment = Alignment.Center,
    ) {
        StyledText(textToDisplay = randomFactsAboutMe.first())
    }
}