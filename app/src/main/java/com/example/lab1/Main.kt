package com.example.lab1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource


private val randomFactsAboutMeInit = listOf(
    "My name is Dzenis.",
    "People usually mispronounce my name.",
    "Even this IDE's spell checker can't recognise my name.",
    "I am 22 years old (currently).",
    "Born and raised in Serbia.",
    "Tool is my favorite Band.",
    "My favorite albums are: To Pimp A Butterfly, Lateralus, In The Court of a Crimson King and Master Of Puppets.",
    "I play a bunch of instruments for quite a long time.",
    "I drink 3 coffees a day.",
    "I have very little free time."
)

@Composable
fun Main() {
    var randomFactsAboutMe by remember { mutableStateOf(randomFactsAboutMeInit) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_waving),
            contentDescription = "Hello!"
        )
        FactBox(randomFactsAboutMe)
        Button(onClick = { randomFactsAboutMe = randomFactsAboutMe.shuffled() }) {
            StyledText(textToDisplay = "Click Here For A Random Fact About Me!")
        }
    }
}

