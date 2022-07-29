package com.example.mycompose.ui.theme.screens

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.Row
import androidx.ui.layout.WidthSpacer
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.text.TextStyle
import com.example.mycompose.model.UserState

object UsersListUi {

    @Composable
    fun addList(state: UserState) {
        MaterialTheme {
            FlexColumn {
                inflexible {
                    TopAppBar( // App Bar with title
                        title = { Text("Users",)
                        }
                    )
                    VerticalScroller {
                        Column {
                            state.users.map {
                                Column {
                                    Row {
                                        Text(text = it.userName)
                                        WidthSpacer(width = 2.dp)
                                        Text(text = it.userSurName)
                                    }
                                    Text(text = it.userJob)
                                }
                                Divider(color = Color.Black, height = 1.dp)
                            }
                        }
                    }
                }
            }
        }
    }
}