-- Ensure email uniqueness
ALTER TABLE users
    ADD CONSTRAINT uq_user_email UNIQUE (email);