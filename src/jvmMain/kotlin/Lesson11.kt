import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun LessonTextFieldTypes() {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }
    var text4 by remember { mutableStateOf("") }

    Column {
        OutlinedTextField(text1, {text1 = it}, modifier = Modifier.fillMaxWidth().padding(10.dp),
            label = { Text("Поле ввода пароля") },
            placeholder = { Text("Введите не менее 6 букв и цифр") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )

        OutlinedTextField(text2, {text2 = it}, modifier = Modifier.fillMaxWidth().padding(10.dp),
            label = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Default.Edit,
                        contentDescription = null)
                        Text("Поле с кнопками")
                }
                    },
            placeholder = { Text("Начинайте ввод...") },
            singleLine = true,

            leadingIcon = {
                Icon(
                Icons.Default.Clear,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier.clickable{}
                )
                          },
            trailingIcon = {
                Icon(
                    Icons.Default.Search,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.clickable{}
                )
            }
            )

        OutlinedTextField(text3, {text3 = it}, modifier = Modifier.fillMaxWidth().padding(10.dp),
            label = { Text("Закруглённое поле ввода") },
            shape = CircleShape
        )

        OutlinedTextField(text4, {text4 = it}, modifier = Modifier.fillMaxWidth().padding(10.dp),
            label = { Text("Что за фрукт?") },
            leadingIcon = {
                Image(painterResource(R.drawable.p1),
                    contentDescription = null,
                    modifier = Modifier.padding(4.dp))

            }
        )
    }
}

/*
    Тема - дополнительные возможности ввода текста.
    Сделайте всё, как в предыдущем задании, только все четыре элемента будут OutlinedTextField.

    Первым двум задайте параметр "текст подсказки", например: placeholder = { Text("Введите не менее 6 букв и цифр") }
    и параметр "одна строка", чтобы в них нельзя было разбивать строку кнопкой Enter: singleLine = true

    Первое поле - для ввода пароля, оно должно скрывать символы при вводе.
    Задайте ему параметр визуальной трансформации: visualTransformation = PasswordVisualTransformation()

    "Округлите" третье поле ввода, придав ему параметр shape = CircleShape

    Второе поле мы украсим значками. Для этого есть два параметра: leadingIcon и trailingIcon - значки слева и справа
    внутри {скобок} этих двух параметров можно указать значки Icon: Icons.Default.Clear и Icons.Default.Search
        * укажите их цвет (tint), первому - красный, второму - основной цвет темы (MaterialTheme.colors.primary)
        * можете также указать модификатор нажатия clickable с пустым блоком {} чтобы значки визуально "нажимались"
    Параметр label второго поля ввода тоже будет чуть сложнее, чем обычно. Поместите в него горизонтальный ряд
        с вертикальным выравниванием по центру, а внутри - значок Icons.Default.Edit и текстовая надпись

    Вместо значка никто не запрещает использовать целую картинку: укажите в параметре leadingIcon четвёртого поля ввода
        элемент Image, отображающий с помощью функции painterResource изображение из ресурса R.drawable.p1 (отступы 4)

    Справка:
    https://metanit.com/kotlin/jetpack/4.3.php
*/