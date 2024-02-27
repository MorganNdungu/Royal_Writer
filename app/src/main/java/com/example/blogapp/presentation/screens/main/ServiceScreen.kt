package com.example.blogapp.presentation.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.blogapp.data.CardItem
import com.example.blogapp.presentation.MainViewModel

@Composable
fun ServiceScreen(navController: NavController, vm: MainViewModel) {
    var selectedOption by remember { mutableStateOf("cardlist") }
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Service Screen")


        BottomNavigationMenu(
            selectedItem = BottomNavigationItem.SERVICES,
            navController = navController
        )


//Horizontal Bar with Options
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OptionItem(text = "list") { selectedOption = "cardlist" }

        }

        //Display Product Grid based on selected option
        when (selectedOption) {
            "cardList" -> ProductCard( CardItem)

        }
    }
}

@Composable
fun OptionItem(text: String, onClick: () -> Unit) {
    Text(
        text = text,
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick)
    )
}

//@Composable
//fun ProductGrid(products: List<Product>) {
//    LazyColumn(
//        modifier = Modifier.padding(16.dp)
//    ) {
//        items(products) { product ->
//            ProductCard(product)
//        }
//    }
//}

@Composable
fun ProductCard(CardItem: CardItem) {
    Card(
        modifier = Modifier.padding(8.dp),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = CardItem.image),
                contentDescription = null,
                modifier = Modifier.size(120.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = CardItem.title)
            Text(text =
        }
    }
}