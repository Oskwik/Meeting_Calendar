package se.lexicon.data;

import se.lexicon.models.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserRepository {

    private static final AppUserRepository INSTANCE = new AppUserRepository();

    private AppUserRepository(){
        appUserStorage = new ArrayList<>();
    }

    public static AppUserRepository getInstance(){
        return INSTANCE;
    }

    /*
    Använd bara i test!!!!!
     */
    public static AppUserRepository getInstanceForTests(List<AppUser> list){
        AppUserRepository appUserRepository = new AppUserRepository();
        appUserRepository.appUserStorage = list;
        return appUserRepository;
    }

    //State of AppUserRepository
    private List<AppUser> appUserStorage;

    public List<AppUser> findAll(){
        return null;0
        return null;
    }

    public int getAppUserCount(){
        return 0;
    }

    public AppUser persist(){
        return null;
    }

    public boolean remove(int id){
        return false;
    }

    public void clear(){
        appUserStorage.clear();
    }

    //define other methods...

}
