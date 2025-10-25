CREATE TABLE ckeck_ins(
    id INTEGER NOT NULL PRIMARY KEY IDENTITY, 
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    attendee_id VARCHAR(255) NOT NULL, 
    CONSTRAINT check_ins_attendee_id _fkey 
            FOREIGN KEY (attendee_id) 
                REFERENCES attendees(id) ON DELETE ON UPDATE CASCADE
);