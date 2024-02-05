CREATE TABLE foto_pessoa (
                       fp_id SERIAL PRIMARY KEY,
                       pes_id INT NOT NULL,
                       fp_data DATE NOT NULL,
                       fp_bucket varchar(50) NOT NULL,
                       fp_hash varchar(50) NOT NULL
);
