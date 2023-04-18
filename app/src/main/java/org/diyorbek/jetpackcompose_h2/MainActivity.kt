package org.diyorbek.jetpackcompose_h2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.diyorbek.jetpackcompose_h2.ui.theme.JetpackComposeH2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeH2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeWork()
                }
            }
        }
    }
}

@Composable
fun HomeWork() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.headphone),
            contentDescription = "desc",
            modifier = Modifier.padding(start = 10.dp)
        )

        Text(
            text = "Beast Products",
            fontSize = 30.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 8.dp, top = 5.dp)
        )
        Text(
            text = "Discover new products from us",
            color = Color.Black,
            modifier = Modifier.padding(start = 8.dp, top = 5.dp, bottom = 10.dp)
        )
        Row(
            Modifier
                .background(Color.Red)
                .padding(top = 10.dp, start = 80.dp)
                .width(300.dp)
                .height(130.dp)
        ) {
            Column {
                Text(
                    text = "Beast Phone 1",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
                Text(
                    text = "Its very good",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.headphone),
                contentDescription = "desc",
                modifier = Modifier.padding(start = 5.dp)
            )


        }
        Row(
            Modifier
                .background(Color.Blue)
                .padding(top = 10.dp, start = 80.dp)
                .width(300.dp)
                .height(130.dp)
        ) {
            Column {
                Text(
                    text = "Beast Phone 2",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
                Text(
                    text = "Its very bad",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.headphone),
                contentDescription = "desc",
                modifier = Modifier.padding(start = 5.dp)
            )


        }
        Row(
            Modifier
                .background(Color.Green)
                .padding(top = 10.dp, start = 80.dp)
                .width(300.dp)
                .height(130.dp)
        ) {
            Column {
                Text(
                    text = "Beast Phone 3",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
                Text(
                    text = "Low Headphone",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.headphone),
                contentDescription = "desc",
                modifier = Modifier.padding(start = 5.dp)
            )


        }
        Row(
            Modifier
                .background(Color.Cyan)
                .padding(top = 10.dp, start = 80.dp)
                .width(300.dp)
                .height(130.dp)
        ) {
            Column {
                Text(
                    text = "Beast Phone 4",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
                Text(
                    text = "Simple headphone",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.headphone),
                contentDescription = "desc",
                modifier = Modifier.padding(start = 5.dp)
            )


        }
        Row(
            Modifier
                .background(Color.Red)
                .padding(top = 10.dp, start = 80.dp)
                .width(300.dp)
                .height(130.dp)
        ) {
            Column {
                Text(
                    text = "Beast Phone 5",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
                Text(
                    text = "Newest headphone",
                    fontSize = 23.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.headphone),
                contentDescription = "desc",
                modifier = Modifier.padding(start = 5.dp)
            )


        }

    }
}

@Preview(showBackground = true)
@Composable
fun FirstUiPreview() {
    HomeWork()
}