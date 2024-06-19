package com.example.learningjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(viewModel: StateTestViewModel) {

    val name by viewModel.name.observeAsState("")
    val age by viewModel.age.observeAsState("")

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyText("$name $age")
        MyTextField(name,
            label = "Enter your name",
            onNameChange = {
                viewModel.onNameUpdate(it)
            })
        MyTextField(age.toString(),
            label = "Enter your age",
            onNameChange = {
                viewModel.onAgeUpdate(it.toInt())
            })
    }
}

@Composable
fun MyTextField(name: String, label: String, onNameChange: (String) -> Unit) {
    OutlinedTextField(
        value = name,
        onValueChange = {
            onNameChange(it)
        },
        label = {
            Text(label)
        })
}

@Composable
fun MyText(name: String) {
    Text(text = "Hello $name", style = TextStyle(fontSize = 30.sp))
}
