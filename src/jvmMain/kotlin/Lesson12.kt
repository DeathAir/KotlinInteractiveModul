import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable    // Используйте exit в качестве параметра-действия для кнопки выхода
fun LessonRegForm(exit: ()->Unit) {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf(0) }
    var list by remember {  mutableStateOf(false) }


    Column(modifier = Modifier.size(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Регистрация пользователя", fontSize = 20.sp)
        OutlinedTextField(name, {name = it},
            modifier = Modifier.padding(4.dp),
            label = { Text("Имя пользователя") },
            placeholder = { Text("Введите логин") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )



        OutlinedTextField(password, {password = it},
            modifier = Modifier.padding(4.dp),
            label = { Text("Пароль") },
            placeholder = { Text("Введите не менее 6 букв и цифр") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Вы:")


            RadioButton(
                selected = gender == 1,
                onClick = { gender = 1 },

            )
            Text("мужчина")


            RadioButton(
                selected = gender == 2,
                onClick = { gender = 2 },
            )
            Text("женщина")
        }

        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Checkbox(list, {list = it})
            if (gender == 2) {
                Text("с правилами ознакомлена")

            }
            else
                Text("c правилами ознакомлен  ")
        }
        Button({}) {
            Icon(Icons.Default.Check, "Зарегистрироваться")
            Text("Зарегистрироваться")
        }

        TextButton({}) {
            Text("Выход")
        }




    }



}

/*
    Пришло время проверить свои знания и умения. Создайте форму регистрации (пока не рабочую, только дизайн).

    Ключевые слова для напоминания: четыре переменные, столбец с горизонтальным выравниванием, размер шрифта (20),
    поля ввода, модификаторы отступа (на 4), горизонтальные ряды, радиокнопки, кнопка, текстовая кнопка...

    Переменную "пол" можно сделать, например, числовой, где 1=мужчина, 2=женщина, 0=не выбран.
    На кнопке регистрации - значок Icons.Default.Check

    После "с правилами ознакомлен" в случае мужского пола выводится пробел, в случае женского - буква "а"
*/