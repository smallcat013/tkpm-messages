package com.example.messages.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.messages.Model.ContactAndSeenTime;

import java.util.ArrayList;

public class NewGroupViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ContactAndSeenTime>> arrayListMutableLiveData;
    public NewGroupViewModel()
    {
        arrayListMutableLiveData=new MutableLiveData<>();
    }

}
