SELECT COUNT(ID) AS COUNT
FROM ECOLI_DATA
WHERE (GENOTYPE&1 OR GENOTYPE&4) AND NOT GENOTYPE&2