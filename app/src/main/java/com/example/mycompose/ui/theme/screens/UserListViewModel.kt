package com.example.mycompose.ui.theme.screens

import androidx.lifecycle.MutableLiveData
import com.example.mycompose.model.UserModel

class UserListViewModel {

    private val usersList: MutableLiveData<ArrayList<UserModel>> by lazy {
        MutableLiveData<ArrayList<UserModel>>()
    }

    private val users:ArrayList<UserModel> = ArrayList()

    fun addUsers(){
        users.add(UserModel("Pooria","Maleki","android developer"))
        users.add(UserModel("Sara","Ahmadi","flutter developer"))
        users.add(UserModel("Fateme","Akbari","ios developer"))
        usersList.value = users
    }

    fun getUsers():MutableLiveData<ArrayList<UserModel>>{
        return usersList
    }


}