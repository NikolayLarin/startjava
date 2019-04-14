-- psql -U postgres
-- \i create_db.sql     - ��������� � ��������� ������� �� ��������� �����
-- \c jaerers;          - ������������� �� ���y jaegers  
-- ������ ��� ���������� �������, ��� ������, �� ��������:
-- https://metanit.com/sql/postgresql/1.1.php

CREATE DATABASE Jaegers;

\c jaegers;


CREATE TABLE jaegers
(
    id         SMALLSERIAL PRIMARY KEY,        -- ������������� � ���������������
    modelName  VARCHAR(50),                    -- ��� ������
    mark       VARCHAR(20),                    -- ������ ������
    height     NUMERIC(5, 2),                  -- ������ ������, �
    weight     NUMERIC(6, 2),                  -- ����� ������, �
    status     VARCHAR(20),                    -- ������
    origin     VARCHAR(20),                    -- ������ ������������
    launch     DATE,                           -- ���� � ������������, ����-��-��
    kaijuKill  INTEGER                         -- ���������� ������ �����
);