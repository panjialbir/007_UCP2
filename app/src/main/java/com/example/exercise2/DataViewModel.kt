package com.example.exercise2

import androidx.lifecycle.ViewModel
import com.example.exercise2.data.DataUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DataViewModel: ViewModel() {
    private val _stateUI = MutableStateFlow(DataUIState())
    val stateUI : StateFlow<DataUIState> = _stateUI.asStateFlow()

    fun setDatat(ListData: MutableList <String>, nmrmhs: Int) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                name = ListData[0],
                nim =  ListData[3],
                konsen = ListData[1],
                jdl = ListData[2]
            )
        }
    }

    fun setDosen(dosenPilihan: String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                dsn = dosenPilihan
            )
        }
    }
}