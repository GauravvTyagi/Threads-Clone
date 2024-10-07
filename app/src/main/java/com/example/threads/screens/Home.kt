package com.example.threads.screens

import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.threads.item_view.ThreadItem
import com.example.threads.utils.SharedPref
import com.example.threads.viewmodel.HomeViewModel
import com.google.firebase.auth.FirebaseAuth
import androidx.compose.foundation.lazy.LazyColumn as LazyColumn1

@Composable
fun Home(navHostController: NavHostController){
    val context= LocalContext.current
    val homeViewModel:HomeViewModel= viewModel()
    val threadAndUsers by homeViewModel.threadsAndUser.observeAsState(null)

    LazyColumn1 {
        if(threadAndUsers!=null){
        items(threadAndUsers ?: emptyList()) { pairs ->
            ThreadItem(
                thread = pairs.first,
                users = pairs.second,
                navHostController,
                FirebaseAuth.getInstance().currentUser!!.uid
            )
        }
    }
    }

}