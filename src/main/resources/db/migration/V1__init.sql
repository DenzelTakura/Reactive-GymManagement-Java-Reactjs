CREATE TABLE trainee (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         first_name VARCHAR(255) NOT NULL,
                         last_name VARCHAR(255) NOT NULL,
                         gender VARCHAR(10),
                         id_number VARCHAR(255),
                         birth_date DATE,
                         height FLOAT,
                         weight FLOAT
);

CREATE TABLE contact (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         trainee_id INT,
                         email_address VARCHAR(255) NOT NULL,
                         phone_number VARCHAR(255),
                         home_address VARCHAR(255),
                         FOREIGN KEY (trainee_id) REFERENCES trainee(id)
);
CREATE TABLE membership_details (
                                    id INT AUTO_INCREMENT PRIMARY KEY,
                                    trainee_id INT,
                                    workout_type VARCHAR(255),
                                    admission_date DATE,
                                    end_session_date DATE,
                                    FOREIGN KEY (trainee_id) REFERENCES trainee(id)
);
CREATE TABLE payments (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          trainee_id INT,
                          fees_mode VARCHAR(255),
                          fees_amount FLOAT,
                          payment_date DATE,
                          receipt_detail VARCHAR(255),
                          FOREIGN KEY (trainee_id) REFERENCES trainee(id)
);
CREATE TABLE trainer (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         first_name VARCHAR(255),
                         last_name VARCHAR(255),
                         gender VARCHAR(10),
                         id_number VARCHAR(255),
                         phone_number VARCHAR(255),
                         email_address VARCHAR(255),
                         specialty VARCHAR(255)
);