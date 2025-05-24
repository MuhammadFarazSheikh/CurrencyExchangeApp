package com.example.feature.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.feature.R

@Composable
fun CurrencyConverterUi() {

    val textFieldEditText = remember { mutableStateOf("") }
    val list = arrayListOf<String>("", "", "", "", "")

    Column(
        modifier = Modifier
            .padding(32.dp, 32.dp, 32.dp, 0.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        content = {
            Text(
                text = "Account",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )

            LazyRow(
                modifier = Modifier
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                    .fillMaxWidth()
                    .wrapContentHeight(), content = {
                    itemsIndexed(list) { index, item ->
                        Column(
                            modifier = Modifier
                                .padding(0.dp, 0.dp, 10.dp, 0.dp)
                                .background(
                                    color = MaterialTheme.colorScheme.tertiary,
                                    shape = RoundedCornerShape(2.dp)
                                )
                                .padding(10.dp, 7.dp)
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            content = {
                                Text(
                                    modifier = Modifier
                                        .wrapContentWidth()
                                        .wrapContentHeight(),
                                    text = "50000.00",
                                    style = MaterialTheme.typography.labelMedium,
                                    color = MaterialTheme.colorScheme.primary
                                )

                                Text(
                                    text = "US DOLLARS",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = MaterialTheme.colorScheme.primary
                                )
                            })
                    }
                })

            Text(
                modifier = Modifier
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                    .wrapContentWidth()
                    .wrapContentHeight(),
                text = "From",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )

            Row(
                modifier = Modifier
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                    .border(
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .fillMaxWidth()
                    .wrapContentHeight(), content = {
                    TextField(
                        singleLine = true,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        value = textFieldEditText.value,
                        onValueChange = {
                            textFieldEditText.value = it
                        },
                        colors = TextFieldDefaults.colors(
                            focusedTextColor = MaterialTheme.colorScheme.secondary,
                            unfocusedTextColor = MaterialTheme.colorScheme.secondary,
                            focusedContainerColor = MaterialTheme.colorScheme.secondary,
                            unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
                            focusedIndicatorColor = MaterialTheme.colorScheme.secondary,
                            unfocusedIndicatorColor = MaterialTheme.colorScheme.secondary,
                            disabledIndicatorColor = MaterialTheme.colorScheme.secondary,
                            errorIndicatorColor = MaterialTheme.colorScheme.secondary
                        )
                    )

                    Text(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                            .weight(0.3f)
                            .wrapContentWidth()
                            .wrapContentHeight(),
                        text = "GBP",
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.primary
                    )

                    IconButton(
                        modifier = Modifier.align(alignment = Alignment.CenterVertically),
                        content = {
                            Image(
                                painter = painterResource(R.drawable.down_arrow),
                                contentDescription = "",
                                modifier = Modifier
                                    .weight(0.1f)
                                    .wrapContentWidth()
                                    .wrapContentHeight()
                            )
                        },
                        onClick = {

                        })

                })

            Image(
                painter = painterResource(R.drawable.convert_icon),
                contentDescription = "",
                modifier = Modifier
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                    .width(20.dp)
                    .height(20.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )

            Text(
                modifier = Modifier
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                    .wrapContentWidth()
                    .wrapContentHeight(),
                text = "To",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )

            Row(
                modifier = Modifier
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                    .border(
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .fillMaxWidth()
                    .wrapContentHeight(), content = {
                    TextField(
                        singleLine = true,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        value = textFieldEditText.value,
                        onValueChange = {
                            textFieldEditText.value = it
                        },
                        colors = TextFieldDefaults.colors(
                            focusedTextColor = MaterialTheme.colorScheme.secondary,
                            unfocusedTextColor = MaterialTheme.colorScheme.secondary,
                            focusedContainerColor = MaterialTheme.colorScheme.secondary,
                            unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
                            focusedIndicatorColor = MaterialTheme.colorScheme.secondary,
                            unfocusedIndicatorColor = MaterialTheme.colorScheme.secondary,
                            disabledIndicatorColor = MaterialTheme.colorScheme.secondary,
                            errorIndicatorColor = MaterialTheme.colorScheme.secondary
                        )
                    )

                    Text(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                            .weight(0.3f)
                            .wrapContentWidth()
                            .wrapContentHeight(),
                        text = "GBP",
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.primary
                    )

                    IconButton(
                        modifier = Modifier.align(alignment = Alignment.CenterVertically),
                        content = {
                            Image(
                                painter = painterResource(R.drawable.down_arrow),
                                contentDescription = "",
                                modifier = Modifier
                                    .weight(0.1f)
                                    .wrapContentWidth()
                                    .wrapContentHeight()
                            )
                        },
                        onClick = {

                        })

                })

        })

}