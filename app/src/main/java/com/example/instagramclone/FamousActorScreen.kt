package com.example.instagramclone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramclone.ui.theme.BackgroundColor
import com.example.instagramclone.ui.theme.CardBackgroundColor
import com.example.instagramclone.ui.theme.cairoFont

@Composable
fun FamousActorsScreen(
) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(BackgroundColor)
        .padding(20.dp)
    ) {
            TopAppBar()
        Divider(
            color = CardBackgroundColor,
            thickness = 2.dp,
        modifier = Modifier.padding(vertical = 30.dp)
        )
        LazyColumn {
            items(actorsList) {
                actor ->
                SingleItemCard(actorName = actor)
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}

@Composable
fun SingleItemCard(
    actorName: String
) {
    Card (
        backgroundColor = CardBackgroundColor,
        contentColor = Color.White
            ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = R.drawable.ic_people), contentDescription = "People Icon")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = actorName,
            fontSize = 20.sp,
            fontFamily = cairoFont)
        }
    }
}




@Composable
fun TopAppBar() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 7.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
            ){
        Text(text = "Search",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
            color = Color.White,
            fontFamily = FontFamily.Cursive
        )
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Rounded.Search, contentDescription ="Search Icon",
            tint = Color.White,
            modifier = Modifier.size(30.dp))
        }
    }
}




@Preview
@Composable
fun Prev() {
    FamousActorsScreen(

    )
}