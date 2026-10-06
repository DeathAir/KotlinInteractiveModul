import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LessonTextFields() {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("Простое поле ввода") }
    var text4 by remember { mutableStateOf("") }

    Column {
        TextField(text1, {text1 = it}, modifier = Modifier.fillMaxWidth().padding(10.dp), label = { Text("Поле ввода") })
        OutlinedTextField(text2, {text2 = it}, modifier = Modifier.fillMaxWidth().padding(10.dp), label = { Text("Поле ввода с окантовкой") })
        BasicTextField(text3, {text3 = it}, modifier = Modifier.fillMaxWidth().padding(10.dp))
        TextField(text4, {text4 = it}, modifier = Modifier.fillMaxSize().padding(10.dp), label = { Text("Ввод текста") })

    }
}


/*
    Тема - ввод текста.
    Создайте через связку remember / mutableStateOf четыре текстовые ("") переменные - по одной для каждого поля ввода.
    Создайте столбец, а внутри - текстовые поля: TextField, OutlinedTextField, BasicTextField
    Все работают одинаково: TextField(переменная, { переменная = it })

    Всем придайте модификаторы: отступы на 10 и заполнение всей возможной ширины fillMaxWidth()
    Последний элемент такой же, как первый, но вместо fillMaxWidth() сделайте заполнение всей площади fillMaxSize()

    Всем (кроме BasicTextField) задайте параметр "надпись", например: label = { Text("Поле ввода") }

    Справка:
    https://metanit.com/kotlin/jetpack/4.3.php
*/