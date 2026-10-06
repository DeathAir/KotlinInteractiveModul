import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Composable
fun LessonSwitches() {
    var radio by remember { mutableStateOf(false) }
    var checked by remember { mutableStateOf(false) }
    var switch by remember { mutableStateOf(false) }
    var icon by remember { mutableStateOf(false) }
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(radio,{radio = !radio})
            if (!radio) Text("нет")
            else
                Text("да")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked, { checked = it })
            if (!checked) Text("не выбран")
            else
                Text("выбран")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Switch(switch, { switch = it })
            if (!switch) Text("выключен")
            else
                Text("включен")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            IconToggleButton(icon, {icon = it}) {
                Icon(Icons.Default.Favorite, "Favorite", tint = if (!icon) Color.Gray else MaterialTheme.colorScheme.primary )
            }

            Text(
                text = if (!icon) "не нравится" else "нравится"
            )






        }


    }

}

/*
    Тема - переключатели
    Создайте 4 переменных через связку remember / mutableStateOf логического типа, значение по умолчанию - false:
    var radio by remember { mutableStateOf(false) } // и ещё 3

    Создайте столбец, внутри него - 4 горизонтальных ряда с вертикальным выравниванием
        по центру (verticalAlignment = Alignment.CenterVertically)
    Каждый ряд содержит переключатель и текстовый элемент.

    Переключатели: RadioButton, Checkbox, Switch, IconToggleButton.
    Все переключатели записываются одинаково: Переключатель(переменная, { переменная = новое_значение })

    Радиокнопка не предназначена для использования вне группы радиокнопок, и не даёт своё новое значение,
    поэтому оформляется так: RadioButton(radio, { radio = !radio })
    Остальные могут использовать параметр it для получения нового значения: Checkbox(check, { check = it })

    Для IconToggleButton нужно также указать последний параметр {},
        внутри которого будет Icon, отображающий значок "сердце" - Icons.Default.Favorite,
        цвет значка (параметр tint=) определяется условием:
            ЕСЛИ (НАЖАТО) MaterialTheme.colorScheme.primary ИНАЧЕ Color.Gray

    Текстовые элементы должны выводить надпись по условию: ЕСЛИ (НАЖАТО) "надпись_да" ИНАЧЕ "надпись_нет"

    Справка:
    https://metanit.com/kotlin/jetpack/4.4.php
    https://metanit.com/kotlin/jetpack/4.5.php
    https://metanit.com/kotlin/jetpack/4.15.php
*/