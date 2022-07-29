package com.example.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.Observer
import androidx.ui.core.setContent
import com.example.mycompose.model.UserState
import com.example.mycompose.ui.theme.screens.UserListViewModel
import com.example.mycompose.ui.theme.screens.UsersListUi

class MainActivity : ComponentActivity() {
    private val usersState: UserState = UserState()
    private val usersListViewModel: UserListViewModel = UserListViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        usersListViewModel.getUsers().observe(this, Observer {
            usersState.users.addAll(it)
        })
        usersListViewModel.addUsers()
        setContent {
            UsersListUi.addList(usersState)
        }
    }
}

