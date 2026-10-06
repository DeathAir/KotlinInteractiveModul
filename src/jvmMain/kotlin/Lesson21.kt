import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ui.ElevatedCard
import ui.verticalScroll

@Composable
fun LessonCards(fruits: List<Pair<String, String>>) {
    Column(Modifier.verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally) {
        for(fruit in fruits) {
            ElevatedCard(modifier = Modifier.padding(8.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(fruit.first), "")
                    Text(
                        text = fruit.second,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }

            }

        }

    }
}

/*
    Более красивый вариант предыдущего задания. Сначала скопируйте всё оттуда.
    Весь внутренний столбец поместите теперь внутрь нового элемента ElevatedCard (визуально приподнятая карточка)
        с модификатором отступа от краёв экрана на 8,
    Горизонтальный разделитель теперь уберите, а отступ на 8 придайте подписи под картинкой,
        только уточните, что отступать текст будет только от нижней границы карточки: .padding(bottom = 8.dp)
 */