DROP TABLE IF EXISTS conversions;

CREATE TABLE conversions(
    conversionid INT PRIMARY KEY,
    userid INT,
    conversion_type VARCHAR,
    original_sequence VARCHAR,
    result_sequence VARCHAR
);

-- source for translations: https://www.researchgate.net/figure/llustrates-Genetic-code-chart-for-RNA-Image-Credit-Vijini-Mallawaarachchi-Ref-1_fig3_330716916

INSERT INTO conversions VALUES(101, 1, 'TRANSCRIPTION', 'CAT', 'GUA'), (102, 1, 'TRANSLATION', 'AUG', 'M'), (103, 2, 'TRANSCRIPTION', 'TTAGGA', 'AAUCCU'), 
(104, 2, 'TRANSLATION', 'AUGCAUGGG', 'MHG'), (105, 3, 'TRANSCRIPTION', 'TACGACTTT', 'AUGCUGAAA');