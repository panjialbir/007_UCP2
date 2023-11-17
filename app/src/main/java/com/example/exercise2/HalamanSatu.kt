package com.example.exercise2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onNextButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
){
    var namaText by remember { mutableStateOf("") }
    var nimText by remember { mutableStateOf("") }
    var konsenText by remember { mutableStateOf("") }
    var judulText by remember { mutableStateOf("") }
    var Dospem by rememberSaveable { mutableStateOf("") }

    var listData : MutableList<String> = mutableListOf(namaText,nimText, konsenText, judulText)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Row {
            Text(text = "Formulir Pengajuan", fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = namaText,
            onValueChange = {namaText = it},
            label = { Text(text = stringResource(id = R.string.name)) }
        )

        OutlinedTextField(
            value = nimText,
            onValueChange = {nimText = it},
            label = { Text(text = stringResource(id = R.string.nim)) }
        )

        OutlinedTextField(
            value = konsenText,
            onValueChange = {konsenText = it},
            label = { Text(text = stringResource(id = R.string.konsen)) }
        )

        OutlinedTextField(
            value = judulText,
            onValueChange = {judulText = it},
            label = { Text(text = stringResource(id = R.string.jdl)) }
        )

        Spacer(modifier = Modifier.padding(10.dp))



        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_medium))
            .weight(1f, false),
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
            verticalAlignment = Alignment.Bottom
        )

        {
            OutlinedButton(
                modifier = Modifier.weight(1f),
                onClick = onBackButtonClicked

            ){
                Text(stringResource(R.string.bckbtn))
            }

            Button(
                modifier = Modifier.weight(1f),
                onClick = {onNextButtonClicked(listData)}
            ){
                Text(stringResource(R.string.nxtbtn))
            }
        }

    }
}
