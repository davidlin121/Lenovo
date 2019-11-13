package com.example.WebSite.dao;
import com.example.WebSite.model.Entry;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDao")
public class FakeEntryData implements EntryDao {
    private static List<Entry> DB = new ArrayList<>();
    @Override
    public int insertEntry(String Dock_PN, String Compatibility_PN) {
        DB.add(new Entry(Dock_PN,Compatibility_PN));
        return 1;
    }

    @Override
    public List<Entry> selectAllEntry() {
        return DB;
    }

    @Override
    public Optional<Entry> selectEntry(Entry entry) {
        return DB.stream()
                .filter(entry1 -> entry.getDock_PN().equals(entry.getDock_PN()))
                .findFirst();
    }

    @Override
    public int deleteEntry(Entry entry) {
        return 0;
    }

    @Override
    public int updatePersonById(Entry entry) {
        return 0;
    }

}
