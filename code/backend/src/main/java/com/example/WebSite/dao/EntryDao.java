package com.example.WebSite.dao;
import com.example.WebSite.model.Entry;
import java.util.List;
import java.util.Optional;

public interface EntryDao {
    int insertEntry(String Dock_PN,String Compatibility_PN);
    default int insertEntry(Entry entry) {
        return insertEntry(entry.getDock_PN(),entry.getCompatibility_PN());
    }
    List<Entry> selectAllEntry();

    Optional<Entry> selectEntry(Entry entry);

    int deleteEntry (Entry entry);

    int updatePersonById(Entry entry);
}


