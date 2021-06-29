DROP TABLE IF EXISTS conversions;

CREATE TABLE conversions(
    conversionid SERIAL PRIMARY KEY,
    username VARCHAR,
    conversion_type VARCHAR,
    original_sequence VARCHAR,
    original_sequence_type VARCHAR,
    result_sequence VARCHAR
);

-- source for translations: https://www.researchgate.net/figure/llustrates-Genetic-code-chart-for-RNA-Image-Credit-Vijini-Mallawaarachchi-Ref-1_fig3_330716916

INSERT INTO conversions VALUES(DEFAULT, 'catperson', 'TRANSCRIPTION', 'CAT', 'DNA', 'GUA'), (DEFAULT, 'catperson', 'TRANSLATION', 'AUG', 'RNA', 'M'), 
(DEFAULT, 'dogperson', 'TRANSCRIPTION', 'TTAGGA', 'DNA', 'AAUCCU'), (DEFAULT, 'dogperson', 'TRANSLATION', 'AUGCAUGGG', 'RNA', 'MHG'), 
(DEFAULT, 'birdperson', 'TRANSCRIPTION', 'TACGACTTT', 'DNA', 'AUGCUGAAA');

GRANT ALL PRIVILEGES ON SCHEMA public TO guineapig;
GRANT ALL PRIVILEGES ON TABLE conversions TO guineapig;
GRANT ALL PRIVILEGES ON SEQUENCE conversions_conversionid_seq TO guineapig;