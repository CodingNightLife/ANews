package com.java.wuzihan.anews.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.java.wuzihan.anews.ANewsRepository;
import com.java.wuzihan.anews.database.entity.Category;

import java.util.List;

public class NewsListViewModel extends AndroidViewModel {

    private ANewsRepository mRepository;

    private LiveData<List<Category>> newsCategories;

    public NewsListViewModel(Application application) {
        super(application);
        mRepository = new ANewsRepository(application);
        newsCategories = mRepository.getShownCategories();
    }

    public LiveData<List<Category>> getShownCategories() {
        return newsCategories;
    }
}
