DROP TABLE IF EXISTS conversions;

CREATE TABLE conversions(
    conversionid INT PRIMARY KEY,
    username VARCHAR,
    conversion_type VARCHAR,
    original_sequence VARCHAR,
    result_sequence VARCHAR
);

-- source for translations: https://www.researchgate.net/figure/llustrates-Genetic-code-chart-for-RNA-Image-Credit-Vijini-Mallawaarachchi-Ref-1_fig3_330716916

INSERT INTO conversions VALUES(101, 'catperson', 'TRANSCRIPTION', 'CAT', 'GUA'), (102, 'catperson', 'TRANSLATION', 'AUG', 'M'), (103, 'dogperson', 'TRANSCRIPTION', 'TTAGGA', 'AAUCCU'), 
(104, 'dogperson', 'TRANSLATION', 'AUGCAUGGG', 'MHG'), (105, 'birdperson', 'TRANSCRIPTION', 'TACGACTTT', 'AUGCUGAAA');