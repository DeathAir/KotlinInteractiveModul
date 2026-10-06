import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ui.verticalScroll

@Composable    // fruits - список пар значений: first - ресурс изображения (типа R.drawable.p1), second - имя картинки
fun LessonColumns(fruits: List<Pair<String, String>>) {
    Column(Modifier.verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally) {
        for(fruit in fruits) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painterResource(fruit.first), "")
                Text(
                    text = fruit.second
                )
            }
            Divider(modifier = Modifier.padding(8.dp))
        }

    }
}

/*
    Всё как в предыдущем задании,
    но вместо горизонтального ряда - столбец на всю ширину экрана с центрированием по горизонтали,
    вместо значка - Image, отображающий painterResource от первого компонента пары,
    модификатор отступа на 8 - не у текста, а у разделителя.
*/