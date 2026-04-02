package com.selfProject.journalApp.controller;

import com.selfProject.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long , JournalEntry>journalEntries = new HashMap<>();
    @GetMapping                                                      //used to see only see the data
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());

    }
    @PostMapping//to enter the entity
    public boolean createEntry(@RequestBody JournalEntry myEntry ){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }


}
