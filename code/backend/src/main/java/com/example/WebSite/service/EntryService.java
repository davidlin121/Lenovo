package com.example.WebSite.service;

import com.example.WebSite.dao.EntryDao;
import com.example.WebSite.model.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryService {
    private final EntryDao entryDao;
    @Autowired
    public EntryService(@Qualifier("fakeDao") EntryDao entryDao) {
        this.entryDao = entryDao;
    }
    public int addEntry(Entry entry){
        return entryDao.insertEntry(entry);
    }
    public List<Entry> getAllPeople(){
        return entryDao.selectAllEntry();
    }
//    public Optional<Entry> selectEntryByDock_PN(Entry entry){
//        return entryDao.selectEntryByDock_PN(entry);
//    }
}

