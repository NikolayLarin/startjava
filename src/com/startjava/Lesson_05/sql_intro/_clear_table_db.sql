-- psql -U postgres
-- \i _clear_table_db.sql

\c jaegers;
DELETE FROM jaegers;                             -- �������� ��� �������
ALTER SEQUENCE jaegers_id_seq RESTART WITH 1;    -- ��������� �������������� �������
SELECT * FROM jaegers;                           -- ������� ��� ������ �������