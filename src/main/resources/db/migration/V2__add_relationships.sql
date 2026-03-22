-- Address → User (Many-to-One)
ALTER TABLE address
    ADD CONSTRAINT fk_address_user
        FOREIGN KEY (user_id) REFERENCES users(id);

-- Profile → User (One-to-One with MapsId)
ALTER TABLE profile
    ADD CONSTRAINT fk_profile_user
        FOREIGN KEY (user_id) REFERENCES users(id);