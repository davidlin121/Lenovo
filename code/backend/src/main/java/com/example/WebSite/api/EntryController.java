package com.example.WebSite.api;

import com.example.WebSite.model.Entry;
import com.example.WebSite.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/entry")
@RestController
public class EntryController {

    private final EntryService entryService;
    @Autowired
    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }
    @PostMapping
    public void addEntry(@RequestBody Entry entry){
        entryService.addEntry(entry);
    }
    @GetMapping
    public List<Entry> getAllPeople(){
        return entryService.getAllPeople();
    }
}
