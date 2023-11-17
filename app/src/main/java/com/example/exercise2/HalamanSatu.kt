package com.example.exercise2

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun HalamanSatu(
    onNextButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
){
    var namaText by remember { mutableStateOf("") }
    var nimText by remember { mutableStateOf("") }
    var konsenText by remember { mutableStateOf("") }
    var judulText by remember { mutableStateOf("") }
}