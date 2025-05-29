package io.github.rajeshcse1721.journalApp.repository;

import io.github.rajeshcse1721.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry , ObjectId> {

}
